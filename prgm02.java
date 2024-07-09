import java.util.*;

class prgm02 {
    public static void checkDate(int d, int m, int y) {
        try {
            int maxDate = d;
            if (m < 1 || m > 12) {
                throw new Exception(d + "/" + m + "/" + y + " is not valid.Invalid Month!");
            } else if (m == 2) {
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                    maxDate = 29;
                } else {
                    maxDate = 28;
                }
            } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                maxDate = 31;
            }
            if (d < 1 || d > maxDate) {
                throw new Exception(d + "/" + m + "/" + y + " is not valid.Invalid Day!");
            }
            if (y <= 999) {
                throw new Exception(d + "/" + m + "/" + y + " is not valid.Invalid year!");
            } else {
                System.out.println(d + "/" + m + "/" + y + " is valid date!");
            }
        } catch (Exception e) {
            System.out.println("error occured: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Scanner xx = new Scanner(System.in);
            int d, m, y;
            System.out.println("Enter day:");
            d = xx.nextInt();
            System.out.println("Enter month:");
            m = xx.nextInt();
            System.out.println("Enter year:");
            y = xx.nextInt();
            checkDate(d, m, y);
        } catch (InputMismatchException i) {
            System.out.println("All the values must be in numbers!");
        }
    }
}
