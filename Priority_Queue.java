import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(0);
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);

        System.out.println(pq);
        
        while (pq.isEmpty() == false) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
