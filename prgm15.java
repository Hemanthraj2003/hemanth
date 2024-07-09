import java.util.*;

class myException extends Exception {
    public myException(String msg) {
        super(msg);
    }
}

class notMain {
    void checkGender(char g) throws myException {
        g = Character.toUpperCase(g);
        switch (g) {
            case 'M':
                System.out.println("\tMale");
                break;
            case 'F':
                System.out.println("\tFemale");
                break;
            case 'O':
                System.out.println("\tOthers");
                break;
            default:
                throw new myException("\tNot identifiable!");
        }
    }

    void checkAge(int a) throws myException {
        if (a < 18) {
            throw new myException("\tIneligible");
        } else {
            System.out.println("\tsuccess");
        }
    }
}

class prgm15 {
    public static void main(String args[]) {
        try {
            Scanner xx = new Scanner(System.in);
            System.out.println("Enter your gender(M, F, O): ");
            char i = xx.next().charAt(0);
            System.out.println("Enter your age: ");
            int age = xx.nextInt();
            notMain nm = new notMain();
            System.out.println("Identity: ");
            nm.checkGender(i);
            System.out.println("Appln. status: ");
            nm.checkAge(age);
        } catch (InputMismatchException im) {
            System.out.println("Enter the appropriate values!");
        } catch (myException my) {
            System.out.println(my.getMessage());
        }
    }
}