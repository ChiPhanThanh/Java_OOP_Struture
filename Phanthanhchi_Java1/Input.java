package Phanthanhchi_Java1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        float  tong;
        Scanner input =  new Scanner(System.in);

        System.out.println("Nhap vao chieu cao:=");
        float height = input.nextFloat();

        System.out.println("Nhap vao can nang:=");
        float weight = input.nextFloat();
        System.out.println("Can nang cua ban la" + weight);

        System.out.println(" nhap vao chuoi ");
        String n = input.nextLine();

        System.out.println(" Chieu cao cua bạn la" + height);
        // Tong ca hai la:
        tong = (weight / height*height);
        System.out.println(" Ket qua cua ca hai: height + weight=" + tong);
        input.close();
    }
}
