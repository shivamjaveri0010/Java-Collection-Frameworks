import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<Integer, String> _treeMap = new TreeMap<>();
        _treeMap.put(3, "Kaustubh");
        _treeMap.put(1, "Shivam");
        _treeMap.put(4, "Arya");
        _treeMap.put(2, "Akash");

        System.out.println(_treeMap);

        System.out.println(_treeMap.ceilingKey(3));
        System.out.println(_treeMap.floorKey(1));

        Set<Integer> st = _treeMap.keySet();

        System.out.println(st);
    }
}
