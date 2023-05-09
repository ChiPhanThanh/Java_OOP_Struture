package Thuchanh_java._buoi2;

import java.util.Scanner;

// Tinh n!
public class Tinhgiathua_n {
    public static void main(String[] args){
        System.out.print("Nhap vao n=");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum  = 1;
        for( int i = 1; i<= n; i++){
            sum  = sum *i;
        }
        System.out.print("Ket qua cua " + n + " la = " + sum);
    }

}
