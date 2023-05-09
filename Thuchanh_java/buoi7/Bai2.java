package Thuchanh_java.buoi7;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){

        while (true){
            //Nhập và họ tên một người. Cho biết người đó có phải họ Tran không?
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vao mo chuoi:");
            String chuoi = input.nextLine();

            System.out.print(" nhap vao ho ban can kiem tra");
            String chuoiKT = input.nextLine();

            if(chuoi.startsWith("Tran")){
                System.out.print("Co chu tran trong chuoi" + "\n");

            }else{
                System.out.print(" khong Co chu tran trong chuoi" + "\n");
            }
        }
    }

}
