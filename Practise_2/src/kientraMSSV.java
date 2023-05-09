
//Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//        Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//        Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để
//        ràng buộc định dạng)  = quan trọng trong xác định email

import java.util.Scanner;

public class kientraMSSV {
    public static void main(String[] args){
        String MSSV;
        System.out.println("Nhập vào MSSV:");
        Scanner sc = new Scanner(System.in);

        MSSV = sc.nextLine(); // Nhận vào 1 chuỗi từ bàn phím

        if (MSSV.matches("8\\d{8}")) //Kiểm tra bằng biểu thức chính quy
            System.out.println("Phù hợp");
        else
            System.out.println("Không phù hợp");

    }
}
