package hien_thi_phan_tu;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ConvertToArrary {
    public static void main(String[] args) {
        //khai báo 1 ArrayList có tên là líst
        //có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        //thêm các phần tử vào list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        //Sử dụng phương thức toArray() chuyển list thành mảng
        //kết quả của phương thức này sẽ trả về mảng arr
        Object[] arr = list.toArray();

        //hiển thị các phần tử có trong mảng arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử tại vị trí " + i + " " + "trong arr là " + arr[i]);
        }
    }
}
