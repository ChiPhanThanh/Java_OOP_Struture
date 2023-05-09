package Phanthanhchi_Java;

import java.util.Scanner;

public class TBC_haiso {
    float TBC;
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao so a=");
        float a = input.nextFloat();

        System.out.println("Nhap vao so b=");
        float b = input.nextFloat();

        System.out.println("Nhap vao so c=");
        float c = input.nextFloat();

        System.out.println("Nhap vao so d=");
        float d = input.nextFloat();

        System.out.println("Nhap vao so e=");
        float e = input.nextFloat();

        System.out.print("============Trung Binh CHung cua Năm Số============");
        float TBC = (a+b+c+d+c)/4;
        System.out.println("TRung bình chung xua 5 so la:" + TBC);


        System.out.println("Chao Tat ca moi ngươi");
    }

}
