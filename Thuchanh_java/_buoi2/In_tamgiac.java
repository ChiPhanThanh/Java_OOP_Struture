package Thuchanh_java._buoi2;
import java.util.Scanner;
public class In_tamgiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao n=");
        int n  = input.nextInt();
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println("--");
        }

    }
}
