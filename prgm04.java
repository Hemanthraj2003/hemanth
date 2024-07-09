
//WAP to print first 'n' members of Fibonacci series//
import java.util.*;

class prgm04 {
    public static void main(String[] args) {
        try {
            Scanner xx = new Scanner(System.in);
            int num1, sum, N, i, num2 = 1;
            num1 = sum = i = 0;
            System.out.println("Enter the limit:");
            N = xx.nextInt();
            System.out.println();
            if (N < 0)
                throw new Exception("positive numbers only!");
            for (; i < N; i++) {
                System.out.print("\t" + findFib(i));
            }
        } catch (InputMismatchException i) {
            System.out.println("values must be in integers!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findFib(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        return findFib(n - 1) + findFib(n - 2);
    }
}