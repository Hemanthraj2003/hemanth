
//WAP to perform getter and setter mehtod//
import java.util.*;

class prgm06 {
    private String bikeName;
    private int price;

    public void setValues(String b, int p) {
        this.bikeName = b;
        this.price = p;
    }

    public String getBikeName() {
        return bikeName;
    }

    public int getBikePrice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        try {
            System.out.println("Enter your Bike name:");
            String name = xx.next();
            System.out.println("Enter Bike price:");
            int price = xx.nextInt();
            prgm06 p = new prgm06();
            p.setValues(name, price);
            System.out.println("\nYour " + p.getBikeName() + " is of Rs." + p.getBikePrice());
        } catch (Exception e) {
            System.out.println("Enter appropriate values!");
        }
    }
}