package Thuchanh_java._buoi2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = input.nextInt();
        float T = 0;
        int i = 1;
        System.out.println("Nhap vao x=");
        System.out.println("Nhap vao n mũ=");
        for ( i = 1; i<= n ;i++){
            T = (x * (i*i));
        }
        System.out.println ("Tong cua T(x,n) la=" + T);
    }
}
