import java.util.*;

class Counter {
    public static int stat_count = 0;
    public int var_count = 0;

    public Counter() {
        stat_count++;
        var_count++;
    }

    public static int get_stat_count() {
        return stat_count;
    }

    public int get_var_count() {
        return var_count;
    }
}

class prgm07 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println("static variable " + "| instance variable");
        System.out.println("\t" + Counter.get_stat_count() + "\t\t" + c1.get_var_count());
        Counter c2 = new Counter();
        System.out.println("\t" + Counter.get_stat_count() + "\t\t" + c2.get_var_count());
        Counter c3 = new Counter();
        System.out.println("\t" + Counter.get_stat_count() + "\t\t" + c3.get_var_count());
    }
}