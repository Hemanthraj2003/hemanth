import java.util.*;

class prgm03 {
    public static void main(String[] args) {
        try {
            Scanner xx = new Scanner(System.in);
            int n;
            System.out.println("Enter the number size:");
            n = xx.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } catch (InputMismatchException i) {
            System.out.println("Numbers only!");
        }
    }
}