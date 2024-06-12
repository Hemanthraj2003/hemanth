set ns [ new Simulator ]
set tracefile [ open p2p.tr w ]
$ns trace-all $tracefile
set namfile [ open p2p.nam w ]
$ns namtrace-all $namfile

set n0 [ $ns node ]
set n1 [ $ns node ]
set n2 [ $ns node ]

$ns duplex-link $n0 $n1 2Mb 10ms DropTail
$ns duplex-link $n1 $n2 0.5Mb 10ms DropTail

set tcp [ new Agent/TCP ]
$ns attach-agent $n0 $tcp

set sink [ new Agent/TCPSink ]
$ns attach-agent $n2 $sink

$ns connect $tcp $sink
set ftp [ new Application/FTP ]
$ftp attach-agent $tcp
$ftp set packetSize_ 1024

proc finish {} {
    global ns namfile tracefile
    $ns flush-trace
    close $namfile
    close $tracefile

    set awkCode {
        BEGIN {}
        {
            if ($1 == "d" && $4 == 2) {
                dcount = dcount + $6
                print $2, dcount >> "p2p.data"
            }
        }
    }
    exec awk $awkCode p2p.tr
    exec xgraph -x Time -y Bytes p2p.data -bg white &
    exec nam p2p.nam &
    exit 0
}


    $ns 0.0 "$ftp start"
    $ns 0.4 "$ftp stop"
    $ns 0.5 "finish"
    $ns run

