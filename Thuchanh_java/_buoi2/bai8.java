package Thuchanh_java._buoi2;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n = input.nextFloat();
        float s = 0;
        int i = 1;
        System.out.println("Nhap vao n=");
        for ( i = 1; i<= n ;){
            i = i+2;
            s = (2*i)-1 /(float) (2*i) +2;
        }
        System.out.println ("Tong cua s la=" + s);
    }
}
