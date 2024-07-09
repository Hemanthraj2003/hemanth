import java.util.*;

class Student {
    String name;
    int regno;

    Student(String nm, int r) {
        this.name = nm;
        this.regno = r;
    }

    void print() {
        System.out.println("Name\t\t|\t" + name);
        System.out.println("-----------------------------------");
        System.out.println("Register Number |\t" + regno);
    }
}

class prgm13 {
    public static void main(String args[]) {
        Scanner xx = new Scanner(System.in);
        int size = 0;
        try {
            do {
                try {
                    System.out.println("\nEnter the number of lists tobe made: ");
                    size = xx.nextInt();
                    if (size < 1) {
                        throw new Exception("Invalid size! Pleaseenter a valid size!");
                    }
                } catch (Exception e) {
                    System.out.println("error occured:" + e.getMessage());
                }
            } while (size <= 0);
            Student stud[] = new Student[size];
            for (int i = 0; i < stud.length; i++) {
                System.out.println("Enter name and register number:");
                String name = xx.next();
                int regno = xx.nextInt();
                stud[i] = new Student(name, regno);
                System.out.printf("\nStudent [%d] details:\n", i + 1);
                stud[i].print();
            }
        } catch (InputMismatchException i) {
            System.out.println("Enter the appropriate values!");
        }
    }
}