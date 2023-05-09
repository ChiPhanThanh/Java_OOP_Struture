package Thuchanh_java.buoi7;

import java.util.Scanner;

//Bài 9. Nhập vào một số điện thoại theo định dạng (091) 022-6758080.
// In ra màn hình mã Quốc gia (091), mã vùng (022) và số điện thoại (6758080)
public class Bai9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra");
        String chuoi = input.nextLine();

        String [] chi = chuoi.split(("-"));
        String chi1 = chi[0];
        System.out.println(" So lan mot"+ " " + chi1);
        String chi2 = chi[1];
        System.out.println(" So lan hai"+ " " + chi2);

    }

}
