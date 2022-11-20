package hien_thi_phan_tu;

import java.util.ArrayList;

public class XoaArrayList1 {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Số phần tử của list ban đầu: " + list);
        System.out.println("Các phần tử của list ban đầu: " + list.size());
//        //clear list
//        list.clear();
//        System.out.println("\nSố các phần tử của list sau khi clear: " + list);
//        System.out.println("Các phần tử của list sau khi clear: " + list.size());

        //remove phần tử có chỉ số index - 1 khỏi list
        list.remove(1);
        System.out.println("\n Số phần tử của list sau khi remove phần tử có index = 1: " + list);
        System.out.println("Các phần tử của list sau khi remove phần tử có index = 1: " + list.size());
        // remove phần tử có chỉ số index = 1 khỏi list
        list.remove("PHP");
        System.out.println("\n Số các phần tử của list sau khi remove phần tử \"PHP\": " + list);
        System.out.println("Các phần tử của list sau khi remove phần tử \"PHP\": " + list.size());
    }
}
