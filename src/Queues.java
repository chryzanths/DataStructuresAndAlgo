import java.util.LinkedList;
import java.util.Queue;

public class Queues
{
    public static void main(String[] args) {
        /*
        uses FIFO data structure - First-In First-Out (ex. Queues or line of people)
        A collection designed for holding elements prior to processing Linear data
        structure

        queue.offer() = enqueue, add()
        queue.poll() = dequeue, remove()
        queue.peek() = peeking at the top most element, element()

        *************************************************************************/

        /* Queue is an interface and not a class, we cannot create an instance of an interface
         + Interface is meant to be more of like template that we can apply to another class
         + We need a class that implements Queue.. there are 2 classes that implement Queues, which are:
         + LinkedList and PriorityQueue

         PriorityQueue - rearrange elements based on a certain priority

         We will be using the class LinkedList instead, we wont be focusing on any of the features of linkedlist,
         we will only cover the features that linked lists will utilize via the Queue interface
         */
        Queue<String> queue = new LinkedList<String>();

        // let's add people in the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");


        /* current Queue arrangement


         ┬─┬  karen, chad, steve, harold
         ----------------------------------
           head ^                   ^ tail

        */

        // queue.size() check the size of the queue or how many objects are in the queue
        System.out.println("How many objects are there in the queue? " + queue.size());

        System.out.println("The queue arrangement: " + queue);
        System.out.println("The current first customer at the queue: " + queue.peek());

        // queue.poll() always removes the first one on the queue
        String convertRemovedPersonToString = queue.poll(); // removes karen

        System.out.println(convertRemovedPersonToString + " finished their turn and left the queue");
        System.out.println("Here is the current/updated queue: " + queue);

        queue.poll(); // removes Chad
        queue.poll(); // removes Steve

        // queue.contains() will check if the specific object is still on the queue
        System.out.println("Is Chad still in the queue? " + queue.contains("Chad"));

        System.out.println("The only person left in the queue is: " + queue);

        String harold = queue.poll(); // removes harold

        System.out.println(harold + " just left");

        // this wont cause any errors unlike Stack
        queue.poll(); // will remove nothing because no one is left at the queue

        // queue.isEmpty() to check if the queue is empty or not
        System.out.println("The queue is currently empty? " + queue.isEmpty());


        /*/

        Uses of Queues:
        - Keyboard buffer (letters should appear on the screen in order they're pressed)
        - Printer Queue (Print jobs should be completed to order)
        - Used in LinkedLists, PriorityQueues, Breadth-first search
         */







    }
}
