import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> _list = new LinkedList<>();
        _list.addFirst(1);
        _list.add(2);
        _list.add(3);
        _list.addLast(4);

        System.out.print("List is: " + _list);

        System.out.print("\nFirst Element: " + _list.getFirst());
        System.out.print("\nLast Element: " + _list.getLast());

        System.out.print("\nSize of list: " + _list.size());
    }
}
