import java.util.Scanner;

public class bai1_1 {
    public static void main(String[] args){
        int i, tong = 0, TBC = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao n=");
        int n = input.nextInt();

        //int [] nums;
        // nums = new int [5];
        int sum = 0;
        int[]num = new int[n];

        for( i = 0; i<n; i++){
            System.out.printf("a[" + i +"]=");
            num[i] = input.nextInt();
        }
        //tinh tong cua mang
        for( i = 0; i< n; i++){
            sum = sum + num[i];

        }

        //tinh trung binh chung cua mang
        for(i = 0; i < n;i++){
            TBC = sum/2;
        }
        System.out.println("Tong cua mang la:" + sum);
        System.out.println("TBC cua mang la:" + TBC);

    }
}
