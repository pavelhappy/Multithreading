package multithreading;

public class Writer implements Runnable {
    private Warehouse warehouse;

    public Writer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        while(!Thread.interrupted()) {
            try {
                System.out.println(warehouse.poll());
                Thread.sleep(5000);
            } catch (Exception e) {

            }
        }

    }
}
