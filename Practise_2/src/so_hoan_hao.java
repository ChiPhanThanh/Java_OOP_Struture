import java.util.Scanner;

public class so_hoan_hao {
    public static void main(String[] args) {
        int n, i,tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhap vao so n=");
        n = input.nextInt();

         //so hoan hao la so chia het cho cac so tru chinh no và tong cac uoc bang so chinh no 6 =3+2+1
        for (i =1; i<=n/2; i++){
            //neu i la uoc cua n thi cong i vao tong
            if( n % i==0){
                tong = tong + i;

            }
        }

        //kiem tra lai tong của ươc co bang n hay khong
        //neu bang thi xuat ra so do hoan khao va thoa man va ngươc lai
        if( tong ==n){
            System.out.println("So do la so hoan hao");
        }
        else{
            System.out.println("So do khong phai so hoan hao");
        }
        }
}
