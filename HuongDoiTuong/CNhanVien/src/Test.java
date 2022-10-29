import java.util.Scanner;

public class Test {
    public static void main(String [] args){
        CNhanVien nv1  = new CNhanVien();
        nv1.Nhap();
        System.out.print(nv1.Xuat() + "\n");
        System.out.println(nv1.toString());

        System.out.print("=========================================" + "\n");
        CNhanVien nv2  = new CNhanVien();
        nv1.Nhap();
        System.out.print(nv1.Xuat() + "\n");
        System.out.println(nv1.toString());

        if( nv1.soSP > nv2.soSP ){
            System.out.print(" Nhan vien cso So Luong Lon Nhat: " + nv1.getmTen());
        }else{
            System.out.print(" Nhan vien do la: " + nv2.getmTen());

        }



    }
}
