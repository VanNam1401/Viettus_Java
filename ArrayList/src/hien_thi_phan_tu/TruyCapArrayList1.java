package hien_thi_phan_tu;

import java.util.ArrayList;

public class TruyCapArrayList1 {
    public static void main(String[] args) {
        //khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        // truy cập phần tử có chỉ số 3 của list
        System.out.println(list.get(3));
    }
}
