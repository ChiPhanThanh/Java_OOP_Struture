package Thuchanh_java._buoi2;
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n = input.nextFloat();
        float s = 0;
        int i = 1;
        System.out.println("Nhap vao n=");
        for ( i = 1; i<= n ;i++){
            s = i /(float) (i+1);
        }
        System.out.println ("Tong cua s la=" + s);
    }

}