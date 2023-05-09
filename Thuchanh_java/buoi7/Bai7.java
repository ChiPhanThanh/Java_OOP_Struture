package Thuchanh_java.buoi7;
import java.util.Scanner;
public class Bai7 {
    static int i;

    static void KtChuoi(String chuoi)
    {
        for(i=0;i<chuoi.length();i++) // vòng lặp kiểm tra chuoi
        {
            char ch=chuoi.charAt(i); //charAt tách chuoi
            if(ch != ' ') // Nếu biến ch =  rỗng thì bắt đầu xóa
                System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        //Nhập vào một xâu. Loại bỏ tất cả các khoảng trắng dư thừa trong xâu.
        System.out.println("Hien Thi Xau ");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mo chuoi:");
        String chuoi = input.nextLine();
        Bai7.KtChuoi("Xuat chuoi:" + "   " + chuoi);



    }
}