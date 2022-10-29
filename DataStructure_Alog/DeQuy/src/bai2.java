import java.util.Scanner;

public class bai2 {
    //Tinh tong s = 1 + 3 + ...(2*n+1)

    static int Tong(int n){
        if( n == 1){
            return 1;
        }else{
             return ((2*n -1) + Tong(n -1));
        }
    }


    public static void main(String [] args)
    {
        int n = 0;
        int s = 0;
        System.out.println("Nhap vao n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for( int i = 1 ; i <= n; i ++){
            s = s + Tong(i);
        }
        System.out.println("Tong của day so la:" + s);
    }
}
