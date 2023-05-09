package Thuchanh_java._buoi2;
import java.util.Scanner;


//Tinhtong s = 1 + 1/2+1/3+1/4+1/5...1/n
public class bai3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double s = 0;
        System.out.println("Nhap vao so n=");
        float n =  input.nextFloat();

        for(int i = 1; i<=n;i++){
            s = s + 1.0/i;
        }
        System.out.println("tong cua s= " + s);
    }
}
