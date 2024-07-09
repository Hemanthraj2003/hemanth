import java.util.*;

public class prgm16 {
    public static void main(String args[]) {
        List<Integer> sharedList = new ArrayList<Integer>();
        Thread thread1 = new Thread(new Producer(sharedList));
        Thread thread2 = new Thread(new Consumer(sharedList));
        thread1.start();
        thread2.start();
    }
}

class Producer implements Runnable {
    int count = 0;
    List<Integer> sharedList = null;
    final int MAX_SIZE = 5;
    private int i = 0;

    public Producer(List<Integer> sharedList) {
        super();
        this.sharedList = sharedList;
    }

    public void run() {
        while (count <= 10) {
            try {
                produce(i++);
            } catch (InterruptedException e) {
            }
            count++;
        }
    }

    public void produce(int i) throws InterruptedException {
        synchronized (sharedList) {
            while (sharedList.size() == MAX_SIZE) {
                System.out.println("shared list is full......");
                System.out.println("waiting for consumer to consume");
                sharedList.wait();
            }
            System.out.println("producer produced elements " + i);
            sharedList.add(i);
            Thread.sleep(100);
            sharedList.notify();
        }
    }
}

class Consumer implements Runnable {
    int count = 0;
    List<Integer> sharedList = null;
    final int MAX_SIZE = 5;
    private int i = 0;

    public Consumer(List<Integer> sharedList) {
        super();
        this.sharedList = sharedList;
    }

    public void run() {
        while (count <= 10) {
            try {
                consume();
            } catch (InterruptedException e) {
            }
            count++;
        }
    }

    public void consume() throws InterruptedException {
        synchronized (sharedList) {
            while (sharedList.isEmpty()) {
                System.out.println("shared list is empty......");
                System.out.println("waiting for producer to produce");
                sharedList.wait();
            }
            Thread.sleep(1000);
            System.out.println("consumed elements " + sharedList.remove(0));
            sharedList.notify();
        }
    }
}