package hien_thi_phan_tu;

import java.util.*;

public class PhuongThucArrayList1 {
    // các phương thức addAll(), removeAll(), retainAll()
    public static void main(String[] args) {
        //khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Ví dụ sử dụng phương thức addAll()");
        System.out.println("----------------------------------");
        //thêm các phần tử của list vào listA
        ArrayList<String> listA = new ArrayList<String>();
//        ArrayList<String> listA = new ArrayList<String>(list);
        listA.addAll(list);
        System.out.print("ListA: ");
        showList(listA);

        System.out.println("\nVí dụ sử dụng phương thức retainAll()");
        System.out.println("---------------------------------------");
        //khởi tọa listB
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");
        //Xóa những phần tử không thược listB khởi listA
        listA.retainAll(listB);
        System.out.print("ListA: ");
        showList(listA);

        System.out.println("\nVí dụ sử dụng phương thức removeAll()");
        System.out.println("---------------------------------------");
        //Xóa những phần tử thuộc listB khỏi list
        list.removeAll(listB);
        System.out.print("List: ");
        showList(list);
    }

    public static void showList(ArrayList<String> list) {
        //show list through for-each
        for (String obj :
                list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}
