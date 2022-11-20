import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        //Creating hasSet
        Set<String> set = new HashSet<String>();
        //add objects to hashSet
        set.add("Java");
        set.add("C++");
        set.add("PHP");
        set.add("Java");
        //show set through Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        //show set through for-each
        System.out.println();
        for (String obj : set) {
            System.out.print(obj + ", ");
        }
    }
}
