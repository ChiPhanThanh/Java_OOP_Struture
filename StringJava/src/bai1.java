
/* Bài 1. Viết chương trình nhập vào một xâu ký tự và một ký tự ch.
 Đếm và in ra màn hình số lần xuất hiện của ký tự ch trong xâu ký tự đó.*/

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hoten = new String();
        System.out.print(" Nhap vao ho ten:");
        hoten = input.nextLine();
        hoten = hoten.trim(); // Xóa các spcae trước và sau
        int dem = 0;
        for (int i = 0; i < hoten.length(); i++) {
            if (hoten.charAt(i) == 'c') {
                dem++;
            }
        }
        System.out.print(" So lan xuat hien chu c la:" + dem);

    }
}
