import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
    public static void main(String[] args) {
        //Creating arrayList
        ArrayList<String> list = new ArrayList<String>();
        //add object to arrayList
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        //show list through Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        //show list through for-each
        System.out.println();
        for (String obj : list) {
            System.out.print(obj + ", ");
        }
        //show list through index
        System.out.println();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}