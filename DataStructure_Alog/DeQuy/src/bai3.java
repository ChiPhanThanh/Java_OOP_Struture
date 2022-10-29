import java.util.Scanner;

public class bai3 {

    //tinh s =  1/2 + 1/4 ...+ 1/2*n

    static double Tong(int n){
        if( n == 1){
            return 0.5;
        }else{
            return ( 1/(2*n)) +Tong(n-1);
        }
    }


    public static void main(String [] args){
        int n = 0;
        double s = 0;
        System.out.println("Nhap vao n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for( int i = 1 ; i <= n; i ++){
            s = s + Tong(i);
        }
        System.out.println("Tong của day so la:" + s);
    }
}
