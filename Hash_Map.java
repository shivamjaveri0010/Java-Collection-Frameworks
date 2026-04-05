import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer, String> _hashMap = new HashMap<>();
        _hashMap.put(1, "Shivam");
        _hashMap.put(2, "Akash");
        _hashMap.put(3, "Kaustubh");
        _hashMap.put(4, "Aray");

        System.out.println(_hashMap);

        System.out.println(_hashMap.get(1));
    }
}
