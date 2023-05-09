import java.util.Scanner;

public class Kt_tontai {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao n=");
        int n = input.nextInt();

        int[] num;
        num = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("a[" + i + "]=");
            num[i] = input.nextInt();
        }

        System.out.println("Nhap vao k để kiem tra=");
        int k = input.nextInt();
        for( i = 0; i< num.length; i++){
            if( num[i] == k ){
                System.out.println( num[i] +" "+ "so đo tồn tại");

            }else{
                System.out.println("so đso khong tồn tại");

            }
        }
    }
}
