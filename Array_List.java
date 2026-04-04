import java.util.ArrayList;

class Data {

    public Integer num;
    public String name;

    public Data(Integer num, String name) {
        this.num = num;
        this.name = name;
    }
}

public class Array_List {
    public static void main(String[] args) {
        //adding elements to the array list
        ArrayList<Integer> _numList = new ArrayList<>();
        //add() operation
        _numList.add(10);
        _numList.add(11);
        _numList.add(12);
        _numList.add(13);
        _numList.add(14);
        _numList.add(15);

        System.out.println(_numList);

        //size() will tell you the exact size of whole array
        System.out.println(_numList.size());

        //get() helps to know which element is present at what index
        System.out.println(_numList.get(3));

        //remove() will remove the specific index
        System.out.println(_numList.remove(0));

        System.out.println(_numList);

        //add() adding value at specific index
        _numList.add(0, 21);
        System.out.println(_numList);
    }
}