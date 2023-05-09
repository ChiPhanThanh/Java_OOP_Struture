
//Viết câu lệnh nhập  vào  4 giá trị lần lượt là số  thực, nguyên,  nguyên  dài và  kí tự. In  ra màn
        //hình các giá trị này để kiểm tra.
package Thuchanh_java.buoi1;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        //nhap vao số Thực
        System.out.println("Nhap vao so thuc=:");
        float basicFloat = input.nextFloat();
        System.out.println("So thuc vua nhap la:=" + basicFloat);

        //so nguyen
        System.out.println("Nhap vao so nguyen duong=:");
        int basicInteger = input.nextInt();
        System.out.println("So thuc vua nhap la:=" + basicInteger);

        //So nguyen dai
        System.out.println("Nhap vao so nguyen dai=:");
        double basicLongInteger = input.nextDouble();
        System.out.println("So thuc vua nhap la:=" + basicLongInteger);

        //kí tụ
        System.out.println("Nhap vao mot ki tu=:");
        String basicWord = input.nextLine();
        System.out.println("So thuc vua nhap la:=" + basicWord);



    }
}
