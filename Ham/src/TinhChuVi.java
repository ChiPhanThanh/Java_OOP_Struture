import java.util.Scanner;

public class TinhChuVi {
    public static final double PI = 3.14;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap gia tri ban =");
        float banKinh  = input.nextFloat();
        System.out.println("dien tich hinh tron=" + dienTich(banKinh));
        System.out.println("chu vi hinh tron=" + chuVi(banKinh));
    }

    public static double dienTich(float banKinh){
        double s =  PI* banKinh;
        return s;
    }
    public static double chuVi(float banKinh){
        double c = 2 * PI* banKinh;
        return c;
    }
}
