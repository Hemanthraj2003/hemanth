import java.util.*;

class prgm01 {
    public static void main(String[] args) {
        try {
            int a, b, c;
            int res1, res2, res3;
            Scanner xx = new Scanner(System.in);
            System.out.println("Enter 3 numbers:");
            a = xx.nextInt();
            b = xx.nextInt();
            c = xx.nextInt();
            System.out.println("\nPRECEDENCE:\n");
            res1 = a * b - c;
            res2 = a / b + c;
            res3 = a - b % c;
            System.out.println("Result of a*b-c: " + res1);
            System.out.println("Result of a/b+c: " + res2);
            System.out.println("Result of a-b%c: " + res3);
            System.out.println("\nASSOCIATIVITY:\n");
            res1 = a + b - c;
            res2 = a / b * c;
            System.out.println("Result of a+b-c: " + res1);
            System.out.println("Result of a/b*c: " + res2);
            System.out.println("\nPRECEDENCE OVERRIDDEN:\n");
            res1 = a * (b - c);
            res2 = (a + b) / c;
            System.out.println("Result of a*(b-c): " + res1);
            System.out.println("Result of (a+b)/c: " + res2);
        } catch (InputMismatchException i) {
            System.out.println("Enter values in numbers only!");
        } catch (ArithmeticException ae) {
            System.out.println("Can't divide numbers by zero!");
        }
    }
}