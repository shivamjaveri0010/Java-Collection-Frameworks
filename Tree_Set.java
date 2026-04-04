import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<Integer> _tset = new TreeSet<>();
        _tset.add(3);
        _tset.add(-1);
        _tset.add(2);
        _tset.add(0);
        _tset.add(1);
        _tset.add(-3);
        _tset.add(-2);

        System.out.println("Tree Set is: " + _tset);
        System.out.println(_tset.floor(-2));
        System.out.println(_tset.ceiling(1));
    }
}
