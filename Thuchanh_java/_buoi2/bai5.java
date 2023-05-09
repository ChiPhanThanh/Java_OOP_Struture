//Tinhtong s = 1+1/3+1/5+1/7...1/(2*n)+1
package Thuchanh_java._buoi2;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("nhap vao n = ");
        float n = input.nextFloat();
        double s = 1;
        for (int i = 1; i <= n;){
            s = s + 1.0/((2*i) +1);
            i = i+2;
        }
        System.out.print("Tong cua day so s  =" + s);
    }
}

