import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        //FIFO
        ArrayDeque<Integer> _arrdq = new ArrayDeque<>();
        _arrdq.offer(1);
        _arrdq.offer(2);
        _arrdq.offer(3);
        _arrdq.offer(4);
        _arrdq.offer(5);

        System.out.println(_arrdq);
        _arrdq.poll();
        System.out.println(_arrdq);
        System.out.println(_arrdq.peek());
    }
}
