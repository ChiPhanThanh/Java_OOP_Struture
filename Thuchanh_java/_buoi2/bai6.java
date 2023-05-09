// s = 1/(1*2) + 1/(2*3).....+1/(n*(n+1)

package Thuchanh_java._buoi2;
import java.util.Scanner;

public class bai6 {
    public void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        float s = 0;
        System.out.println("Nhap vao n=");

        for(int i = 1; i<=n;i++){
            s = (float) (s +1.0/(i*(i+1)));
        }
        System.out.print("Tong cua n=:" + s);
    }
}
