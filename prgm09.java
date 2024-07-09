import java.util.*;

class Fruit {
    void Display1() {
        System.out.println("has seeds");
    }

    void Display2() {
        System.out.println("grows in a tree");
    }
}

class Apple extends Fruit {
    String name = "apple";

    void Display1() {
        System.out.println(name + " has seeds");
    }

    void Display2() {
        System.out.println(name + " grows in a tree");
    }

    void Display3() {
        System.out.println(name + " takes 4-6 years to grow");
    }
}

class prgm09 {
    public static void main(String[] args) {
        Fruit f = new Apple();
        Apple a = new Apple();
        f.Display1();
        f.Display2();
        a.Display3();
    }
}