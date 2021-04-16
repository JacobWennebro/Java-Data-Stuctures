import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    private ArrayList QueueList = new ArrayList();

    public Queue() {

    }

    public void enqueue(String text) {
        QueueList.add(text);
    }

    public String dequeue() {
        QueueList.remove(0);
        return "";
    }

    public boolean isEmpty() {
        return false;
    }

    public int size() {
        return -1;
    }
}
