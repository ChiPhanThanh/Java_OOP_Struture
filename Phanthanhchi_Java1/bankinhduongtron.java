package Phanthanhchi_Java;

import java.util.Scanner;

public class bankinhduongtron {
    public static void main(String[] args) {
        double S;
        double C;
        double DK;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao ban kinh r=");
        float r = input.nextFloat();
        System.out.println(r);

        System.out.println("ĐƯờng kính của hình tròn là" + r*2);
         //tinh cu vi hinh tron la
         C = Math.PI * r *2;
        System.out.println("Chu vi hình tròn là"+C);

         S = Math.PI *r*r;
        System.out.println("Chu vi hình tròn là %2.5d"+S);

    }

}
