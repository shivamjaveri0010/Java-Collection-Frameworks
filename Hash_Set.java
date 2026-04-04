import java.util.HashSet;
import java.util.Random;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> _hset = new HashSet<>();
        Random store = new Random();

        for (int i=0; i<20; i++) {
            int _randomNumber = store.nextInt(20);
            _hset.add(_randomNumber);
        }
        System.out.println("Some random numbers: " + _hset);

        for (var elements : _hset) {
            System.out.print(" " + elements);
        }
    }
}
