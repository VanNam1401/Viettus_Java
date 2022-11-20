package hien_thi_phan_tu;

import java.util.ArrayList;

public class TimKiemArrayList1 {
    public static void main(String[] args) {
        //Khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        list.add("Java");

        System.out.println("Kiểm tra bằng phương thức contains()");
        System.out.println("------------------------------------");
        //kiểm tra xem PHP có tồn tại trong list hay không?
        System.out.println(list.contains("PHP"));
        //kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.contains("ANDROID"));

        System.out.println("Kiểm tra bằng phương thức indexOf()");
        System.out.println("-----------------------------------");
        //kiểm tra xem Java có tồn tại trong list hay không?
        System.out.println(list.indexOf("Java"));
        //kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.indexOf("ANDROID"));

        System.out.println("Kiểm tra bằng phương thức lastIndexOf()");
        System.out.println("---------------------------------------");
        //Kiểm tra xem Java có tồn tại trong list hay không?
        System.out.println(list.lastIndexOf("Java"));
        //Kiểm tra xem ANDROID có tồn tại trong list hay không?
        System.out.println(list.lastIndexOf("ANDROID"));
    }
}
