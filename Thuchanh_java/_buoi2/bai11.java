package Thuchanh_java._buoi2;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float s= 0;
        do {
            for (int i = 1; i<=n;i++){
                for (int j = i; j<=i; j++){
                    s  =i*j;
                }
            }
        }
        while(n >6);
        System.out.println ("Tong cua T(x,n) la=" + s);
    }
}
