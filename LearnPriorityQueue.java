import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class LearnPriorityQueue {
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(109);
        pq.offer(102);
        pq.offer(105);
        pq.offer(108);
        System.out.println(pq);
        System.out.println("Peek Element : "+pq.peek());

        pq.poll();
        System.out.println(pq);

    }
}
