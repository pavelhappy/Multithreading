package multithreading;

import java.util.PriorityQueue;
import java.util.Queue;

public class Warehouse {
    private Queue <Integer> numbers = new PriorityQueue<Integer>();

    public synchronized void add(int num) {
        numbers.add(num);
    }

    public synchronized int poll() {
        return numbers.poll();
    }
}
