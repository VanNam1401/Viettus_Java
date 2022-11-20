package hien_thi_phan_tu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DuyetArrayList1 {
    public static void main(String[] args) {
        //khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        //hiển thị các phần t của list
//        System.out.println("Các phần tử có trong list là: ");
//        System.out.println(list);
//        //sử dụng vòng lặp for để hiển thị các phần tử của list.
//        System.out.println("Các phần tử có trong list là: ");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        // sử dụng vòng lặp for-each để hiển thị các phần tử của list
//        System.out.println("Các phần tử có trong list là: ");
//        for (String str :
//                list) {
//            System.out.println(str);
//        }
        //sử dụng Iterator để hiển thị các phần tử của list.
        Iterator<String> iterator = list.iterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //sử dụng ListIterator để hiển thị các phần tử của list
        ListIterator<String> iterator1 = list.listIterator();
        System.out.println("Các phần tử có trong list là: ");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
