import java.util.*;

class BCA {
    void studentDisplay(String s) {
        System.out.println("Name: " + s);
        System.out.println("Course: 1st semester BCA");
    }
}

class MCA extends BCA {
    void studentDisplay(String s) {
        System.out.println("name: " + s);
        System.out.println("Course: 1st semester MCA");
    }
}

class prgm10 {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        String name = new String("monish");
        BCA a1 = new BCA();
        BCA a2 = new MCA();
        a1.studentDisplay(name);
        a2.studentDisplay(name);
    }
}