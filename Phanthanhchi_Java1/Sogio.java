package Phanthanhchi_Java;

import java.util.Scanner;

public class Sogio {
    int tonggiay;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao so giay=");
        int tonggiay = input.nextInt();

        //tinh gio so phut
        int gio = tonggiay/3600;
        int phut = (tonggiay % 3600)/60;
        int giay = tonggiay % 60;

        System.out.println("so gio:" + gio);
        System.out.println("so gio:" + phut);
        System.out.println("so gio:" + giay);

        System.out.println("Xem so gio vua nhap la=\t" + gio + ": "+ phut + ":" + giay);
    }
}

