package Thuchanh_java.buoi7;

import java.util.Scanner;

public class Bai5 {
    //Viết chương trình lấy ký tự đầu của mỗi từ trong họ tên (được nhập từ bàn phím) và in chuỗi tìm được ra màn hình.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mo chuoi:");
        String chuoi = input.nextLine();
            int index1  = chuoi.charAt(0);
//            int index2 =  chuoi.charAt(6);
        System.out.println(chuoi);
        System.out.println("Ký tự tại vị trí thứ 0: " + (char) index1);
//        System.out.println("Ký tự tại vị trí thứ 10: " + (char) index2);
    }
}
