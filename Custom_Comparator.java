import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;

public class Custom_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> _elements = new ArrayList<>();
        _elements.add(5);
        _elements.add(3);
        _elements.add(1);
        _elements.add(4);
        _elements.add(2);

        Collections.sort(_elements);
        System.out.println("All the elements of this List is in ascending order: " + _elements);

        //what if we want this in descending order?
        // Collections.sort(_elements, new Comparator<Integer>() {
            
        //     @Override
        //     public int compare(Integer num1, Integer num2) {
        //         if (num1 < num2) {
        //             return 1;
        //         } else if (num1 > num2) {
        //             return -1;
        //         } else {
        //             return 0;
        //         }
        //     }
        // });
        Collections.sort(_elements, (num1, num2) -> num2 - num1);
        System.out.println("All the elements of this list is now in descending order: " + _elements);
    }
} 