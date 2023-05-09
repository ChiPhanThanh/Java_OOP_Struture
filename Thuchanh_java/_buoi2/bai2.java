
//tinh s = 1^2 + 2^2 + 3^2
package Thuchanh_java._buoi2;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        int s = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so n=");
        int n = input.nextInt();

        if (n >= 5 && n <=20) {
            for (int i = 1; i <= n; i++) {
                i = i * i;
                s = s + i;
            }
            System.out.print("tong cua S=" + s);
        } else {
            System.out.print("tong cua khong thoa man");
        }
    }
}
