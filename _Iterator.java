import java.util.*;

public class _Iterator {
    public static void main(String[] args) {
        List<Integer> _arrList = new ArrayList<>();
        Random store = new Random();

        for (int i = 0; i < 10; i++) {
            int randNum = store.nextInt(10);
            _arrList.add(randNum);
        }

        System.out.println("Original List: " + _arrList);

        _arrList = new ArrayList<>(new HashSet<>(_arrList));

        Collections.sort(_arrList);

        System.out.println("Sorted list without duplicates: " + _arrList);

        Iterator<Integer> iterate = _arrList.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}