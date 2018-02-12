package multithreading;

public class Multithreading {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Thread thread1 = new Thread(new Reader(warehouse));
        Thread thread2 = new Thread(new Writer(warehouse));
        thread1.start();
        thread2.start();
    }

}
