import UPack.*;
import java.util.*;

class prgm11 {
    public static void main(String args[]) {
        try {
            Scanner xx = new Scanner(System.in);
            int num1, num2;
            System.out.println("Enter 2 operands:");
            num1 = xx.nextInt();
            num2 = xx.nextInt();
            System.out.printf("\nThe sum of %d and %d is : %d\n", num1,
                    num2, Arithmetic.sum(num1, num2));
            System.out.printf("\nThe difference of %d and %d is: %d\n",
                    num1, num2, Arithmetic.difference(num1, num2));
            System.out.printf("\nThe product of %d and %d is: %d\n", num1,
                    num2, Arithmetic.product(num1, num2));
            System.out.printf("\nThe quotient of %d and %d is: %d\n",
                    num1, num2, Arithmetic.quotient(num1, num2));
            System.out.printf("\nThe remainder of %d and %d is: %d\n",
                    num1, num2, Arithmetic.remainder(num1, num2));
        } catch (InputMismatchException i) {
            System.out.println("Values in numbers!");
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }
}
