package Thuchanh_java.buoi7;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mo chuoi:");
        String chuoi = input.nextLine();
        StringBuilder stringBuilder = new StringBuilder(chuoi);
        System.out.println(stringBuilder.reverse().toString());
    }
}
