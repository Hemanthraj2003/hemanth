import java.util.*;

class Car {
    String carName;

    Car(String name) {
        this.carName = name;
    }

    public void showCarName() {
        System.out.println("car name: " + carName);
    }

    class Start {
        public boolean engineStatus(int key) {
            if (key == 1)
                return true;
            else
                return false;
        }
    }

    public void onRoad() throws InputMismatchException {
        Scanner xx = new Scanner(System.in);
        Start s = new Start();
        System.out.println("Enter the key(0/1):");
        int key = xx.nextInt();
        if (s.engineStatus(key)) {
            System.out.println("Engine started!");
            System.out.println("\tWear seat belts!");
            System.out.println("\t\tGet ready to go!");
        } else {
            System.out.println("Engine is off");
        }
    }
}

class prgm08 {
    public static void main(String args[]) {
        try {
            Car c = new Car("Mustang");
            c.showCarName();
            c.onRoad();
        } catch (InputMismatchException i) {
            System.out.println("Invalid key type!");
        }
    }
}