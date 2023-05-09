
//tính S = 1+2+3+4+5....+n
package Thuchanh_java._buoi2;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        int s = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println("Nhap vao so n=");
        int n  = input.nextInt();

        if(n <3 || n >=50){
            System.out.println("KHong phu hop de tinh");
        }else{
            for(int i = 1; i <=n; i++) {
                s = s + i;
            }
            System.out.print("tong cua S=" + s);
        }

    }
}
