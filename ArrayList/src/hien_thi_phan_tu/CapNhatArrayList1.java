package hien_thi_phan_tu;

import java.util.ArrayList;

public class CapNhatArrayList1 {
    public static void main(String[] args) {
        //khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //thềm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("List trước khi cập nhật: ");
        System.out.println(list);
        //cập nhật giá tị cho phần tử có chỉ số là 3 (Java)
        list.set(3, "Python");
        System.out.println("List trước khi cập nhật: ");
        System.out.println(list);
    }
}
