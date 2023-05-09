//Tinhtong s = 1/2+1/4+1/4+1/6...1/2*n
package Thuchanh_java._buoi2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("nhap vao n = ");
        float n = input.nextFloat();
        double s = 0;
        for (int i = 2; i<= n;){
            i = i+2;
            s = s + 1.0/2*i;
        }
        System.out.print("Tong cua day so s  =" + s);
    }
}
