import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Comparator;


public class LearnDeque {
    public static void main(String[] args) {
        Queue<Integer> dq = new ArrayDeque<>();
        dq.offer(121);
        dq.offer(122);
        dq.offer(123);
        System.out.println(dq);
        dq.poll();
        System.out.println(dq.peek());

    }
}
