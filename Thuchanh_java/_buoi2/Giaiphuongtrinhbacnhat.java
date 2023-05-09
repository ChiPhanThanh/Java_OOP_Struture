package Thuchanh_java._buoi2;

import java.util.Scanner;

//Giai phuogn trinh bac nhat ax+ b=0;
public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a = ");
        float a = input.nextFloat();
        System.out.print("Nhap vao b=  ");
        float b = input.nextFloat();
        float x = (-b/a);
        if((a==0) && (b==0)){
            System.out.print("Phuwong trinh co vo so nghie");
        }
        if((a == 0) && (b != 0)){
            System.out.print("Phuwong trinh vo nghiem");
        }
        if(a!= 0){
            System.out.print("Phuwong trinh co nghime=" + x);
        }
    }
}
