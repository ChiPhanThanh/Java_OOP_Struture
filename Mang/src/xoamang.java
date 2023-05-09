import java.util.Scanner;

public class xoamang {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println(" nhap vao so phan tu mang=");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "]");
            arr[i] = input.nextInt();
        }

        for( i= 0; i < n; i++){
            arr[i] = arr[ i + 1];
            n--;
        }
        System.out.println("Xóa phan tu dau cua mang=" + arr[i]);
    }

}
