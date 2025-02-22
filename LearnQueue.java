import java.util.*;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[] args){
       Queue<Integer> queue = new LinkedList<>();
       queue.offer(1000);
       queue.offer(1001);
       // throw an exception id queue is full
       queue.add(1003);

        System.out.println(queue);
        System.out.println("Peek Element : "+queue.peek());
        System.out.println("Front Element : " + queue.poll());
        System.out.println(queue);



    }
}
