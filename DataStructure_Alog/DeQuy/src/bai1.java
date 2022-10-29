import java.util.Scanner;

public class bai1 {


    static int Tong(int n){
        if( n == 1){
            return 1;
        }else{
            return ( n + Tong(n-1));
        }
    }
    public static void main(String [] args){
        // Sử dun hamg đệ quy để tính S = 1 +2 +3+4...+n
        int n = 0;
        int s = 0;
        System.out.println("Nhap vao n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
             s = s + Tong(i);
        }
        System.out.print(s);
    }
}
