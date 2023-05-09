import java.util.Scanner;

public class AmDuong {
    public static void main(String[] args){
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println(" nhap vao so phan tu mang=");
        int n = input.nextInt();

        int []arr = new int[n];

        for(i = 0; i< arr.length;i++){
            System.out.println("a[" + i + "]");
            arr[i] = input.nextInt();
        }

        for(i = 0; i< arr.length;i++){
            int temp = 0;
            if( arr[i] > 0){
                 temp = arr[i];
                System.out.println( " So duong :=");
                System.out.println(  temp+"\n ");
            }
        }

        for(i = 0; i< arr.length;i++){
            int temp = 0;
            if( arr[i] < 0){
                temp = arr[i];
                System.out.print("So am:=");
                System.out.println( temp + " ");
            }
        }
    }
}
