import java.util.Scanner;

public class HCN {
    private int a;
    private int b;
    int S;
    int C;

    public HCN( int a, int b){
        this.a= a;
        this.b = b;
    }

    public HCN() {
    }

    public void Nhap(){
        Scanner input =  new Scanner(System.in);
        System.out.print(" Nhap vao vanh a = ");
        a = input.nextInt();
        System.out.print(" Nhap vao vanh b = ");
        b = input.nextInt();
    }

    void Xuat(){
        System.out.print(" Dien tich hinh chu nhat la" + tinhDienTich() + "\n");
        System.out.print(" Cgu vi hinh chu nhat la" + tinhChuViHCN());
    }

    public int getA() {
        return a;
    }
    public void setA(int a){
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB( int b){
        this.b = b;
    }

    public int tinhChuViHCN (){
        return this.S = (a * b)*2;
    }

    public int tinhDienTich() {
        return this.C = a * b;
    }
}

