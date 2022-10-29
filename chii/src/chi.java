import java.util.Arrays;
import java.util.Scanner;

public class chi {
    public static void main(String[] args) {
        int[] mang = new int [4];
        Scanner s  = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++){
            System.out.printf(" nhap vao phan tu thu %d:", (i+1));
            mang[i] = s.nextInt();

        }
        System.out.println(" Xuat mang vua nhap" + Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println(" Xuat mang vua nhap" + Arrays.toString(mang));

        //Tim kiem mang
        int k;
        Scanner m = new Scanner(System.in);
        System.out.print(" nhap vao phan tu k muon tim kiem:");
        k = m.nextInt();

        for( int i = 1; i< mang.length; i++){
            if( k == mang[i]){
                System.out.print(" da tim thay" + mang[i]+"\n");
            }
        }

        //GIA trị lon nhat
        int min = mang[0];
        for(int i = 1; i < mang.length; i++){
            if(min < mang[i]){
                min = mang[i];
            }
        }
        System.out.print("Mang co gia tri lon nhat la" + min);
    }
}
