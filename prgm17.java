class goodMorning extends Thread {
    synchronized public void run() {
        try {
            int i = 0;
            while (i < 10) {
                sleep(1000);
                System.out.println("Good Morning!");
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error handled");
        }
    }
}

class hello extends Thread {
    synchronized public void run() {
        try {
            int i = 0;
            while (i < 10) {
                sleep(2000);
                System.out.println("Hello!");
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error handled");
        }
    }
}

class welcome extends Thread {
    synchronized public void run() {
        try {
            int i = 0;
            while (i < 10) {
                sleep(3000);
                System.out.println("Welcome!");
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error handled");
        }
    }
}

class prgm17 {
    public static void main(String args[]) {
        goodMorning g = new goodMorning();
        hello h = new hello();
        welcome w = new welcome();
        g.start();
        h.start();
        w.start();
    }
}