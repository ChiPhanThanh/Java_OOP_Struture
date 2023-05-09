package Phanthanhchi_Java1;
import java.util.Scanner;
public class Tinh_2so {
    public static void main(String[] args){
        float tong;

        Scanner input = new Scanner(System.in);

        System.out.println(" Nhap vao so a = ");
        float a = input.nextFloat();


        System.out.println(" Nhap vao so b = ");
        float b = input.nextFloat();
        //tinh tong hai so
         tong = a + b;
        System.out.println("TOng cua hai so a va b la:=" + tong);
        //tinh hỉu hai so
         tong = a - b;
        System.out.println("Hieu cua hai so a va b la:=" + tong);
        //nhân hai so
        tong = a * b;
        System.out.println("Nhan cua hai so a va b la:=" + tong);
        //phep chia
        tong = a / b;
        System.out.println("Phep chia lay nguyen cua hai so a va b la:=" + tong);
        //phep chia lay du
        tong = a % b;
        System.out.println("Phep chia du cua hai so a va b la:=" + tong);
    }
}
