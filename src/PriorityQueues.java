import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues
{
    public static void main(String[] args){
        /*
        FIFO data structure that serves elements
        with the highest priorities first
        before elements with lower priority
         */


        // Priority Queues will print each objects in ascending order
        // adding a method Collections.reverseOrder() will print the objects in descending order instead
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        // add Double objects to the Queue
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        // while the queue is not empty, remove/poll object one by one and display it.. it will only stop if the queue is empty
        while(!queue.isEmpty()) {
            System.out.println(queue.poll()); // using queue.peek() will only repeatedly print the first object in the queue
        }

        /*/

        Uses of Priority Queues:
        - Finding the closest restaurants/hotels/bathrooms/whatever to a given location
        - Filter products to ascending or descending in online shops when browsing

         */


    }
}
