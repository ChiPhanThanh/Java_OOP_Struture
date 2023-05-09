import java.util.Scanner;
public class ArrayFinal {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("nhap vao pha tu n=");
        int n = input.nextInt();
        int[] Arr = new int[n];
        for (i = 0; i < Arr.length; i++) {
            System.out.print(" phan tu thu" + i);
            Arr[i] = input.nextInt();
        }
        for (i = 0; i < Arr.length; i++) {
            System.out.println("   " + Arr[i]);
        }
        //dem mang
        demArr(Arr, n);
        System.out.println("----------------------------" + "\n");
        demAmMang(Arr, n);
        System.out.println(" \n" + "----------------------------" + "\n");
        demChanMang(Arr);
        System.out.println(" \n" + "----------------------------" + "\n");
        lietKeSoDuong(Arr, n);
        tinhTongMang(Arr);
        tinhHieu(Arr);
        Max(Arr);
        Min(Arr);
        sapXepMang(Arr);
        timKiem(Arr);


    }

    // Dem   duong phan tu mang trong Mang
    public static void demArr(int Arr[], int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (Arr[i] > 0) {
                dem++;
            }
        }
        System.out.print("Mang co so duong la:" + dem + "\n");
    }

    // Dem phan tu am trong Mang
    public static void demAmMang(int[] Arr, int n) {
        int dem = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] < 0) {
                dem++;
            }
        }
        System.out.print("mang co am  la:" + dem);
    }

    //Dem phan tu chan trong mang
    public static void demChanMang(int[] Arr) {
        int dem = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.print(" Mang co so phan tu chia het cho 2 la :" + dem);
    }

    // liet ke so duong + am + so chan
    public static void lietKeSoDuong(int Arr[], int n) {

        for (int i = 0; i < n; i++) {
            if (Arr[i] > 0) {
                System.out.print("So duong: " + Arr[i] + "\n");
            }

        }
    }

    // tinh tong Mang
    public static void tinhTongMang(int[] Arr) {
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            sum = sum + Arr[i];
        }
        System.out.println("tong trong mang:=" + sum);
    }

    //Tinh hieu trong mang
    public static void tinhHieu(int[] Arr) {
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            sum = sum - Arr[i];
        }
        System.out.println("Hieu cua mang la:=" + sum);
    }

    //Tinh so lown nhat trong mang
    public static void Max(int[] Arr) {
        int max = Arr[0];
        for (int j : Arr) {
            if (max > j) {
                max = j;
            }
        }
        System.out.println("So lon nhat trong mang la:=" + max);
    }

    // So nho nhat trong mang
    public static void Min( int [] Arr){
        int min = Arr [0];
        for ( int i = 0; i < Arr.length; i++){
            if( min < Arr[i]){
                min = Arr[i];
            }
        }
        System.out.println("So nho nhat trong mang:=" + min);
    }

    // Sap xep mang - sap xep chon(Selection)
    public static void sapXepMang( int [] Arr){
        for(int i = 0; i < Arr.length - 1; i++){
            int emty = Arr[i];
            for ( int j =  i + 1; j < Arr.length; j++){
                if ( emty > Arr [j]){
                    Arr[i] = Arr[j];
                    Arr[j] = emty;
                    emty = Arr[i];
                }
            }
        }
        System.out.println(" Mang duoc sap xep la");
        for( int x : Arr){
            System.out.print( " " + x );
        }
    }

    //Tim kiem mang
    public static void timKiem( int [] Arr){
        Scanner input = new Scanner(System.in);
        System.out.print( " \n" +"Nhap pha tu muon tim kiem =");
        int k = input.nextInt();
        for ( int i = 0; i < Arr.length - 1; i++){
            if (k  == Arr[i]){
                System.out.print(" Vi tri tim thay o " + i + "\n");
            }
        }
    }
}

