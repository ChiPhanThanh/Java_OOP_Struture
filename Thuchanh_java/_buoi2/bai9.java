package Thuchanh_java._buoi2;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float s = 0;
        int i = 1;
        System.out.println("Nhap vao n=");
        for ( i = 1; i<= n ;){
            s = i*(i+1);
        }
        System.out.println ("Tong cua s la=" + s);
    }
}
