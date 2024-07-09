
//WAP to generate multiplication tables from the range 'm' to 'n', where m<n//
import java.util.*;

class prgm05 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        int m = 0, n = 0;
        do {
            try {
                System.out.println("Enter start range and end range:");
                m = xx.nextInt();
                n = xx.nextInt();
                if (m < 1 || n < 1)
                    throw new Exception("Enter non-negative and non-zero numeral!");
                if (m >= n)
                    throw new Exception("Not a valid form to displaytables!");
            } catch (InputMismatchException i) {
                System.out.println("Integers only!");
                xx.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                xx.next();
            }
        } while (n < 1 || m < 1 || m >= n);
        for (int i = 1; i < 11; i++) {
            for (int j = m; j <= n; j++) {
                System.out.print(j + "X" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}