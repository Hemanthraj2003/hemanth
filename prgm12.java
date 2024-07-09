import java.util.*;

abstract class AbsEg {
    abstract String name(String name);

    abstract void place();
}

class Fish extends AbsEg {
    public String name(String name) {
        return name;
    }

    public void place() {
        System.out.print("\tlives in sea and oceans!");
    }
}

class prgm12 {
    public static void main(String args[]) {
        try {
            Scanner xx = new Scanner(System.in);
            System.out.println("Enter a sea creature:");
            String s = xx.next();
            Fish f = new Fish();
            System.out.println("\n-----------\n" + f.name(s));
            f.place();
        } catch (InputMismatchException i) {
            System.out.println("Enter values in characters!");
        }
    }
}