import java.util.Scanner;

public class HinhTamGiac {
    private int ma; //ma canh tam giac a
    private int mb; // mb canh tam giac b
    private int mc; // mb canh tam giac c

    public HinhTamGiac(int ma, int mb, int mc){
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;

        if((ma) < 0 || (mb) < 0|| (mc) < 0){
            this.ma = 0;
            this.mb  =0;
            this.mc = 0;
        }else if((this.ma + this.mb > this.mc) || (this.ma + this.mc > this.mb) ||(this.mc + this.mb > this.ma)){
            System.out.print(" Khong thanh lap mot tam giac");
        }
    }

    public HinhTamGiac() {

    }

    public int getCanhA(){
        return ma;
    }
    public void setCanhA( int ma){
        if ( this.ma > 0){
            this.ma = ma;
        }
        //this.ma = ma;
    }

    public int getCanhB(){
        return mb;
    }
    public void setCanhB( int mb){
        if ( this.mb > 0){
            this.mb = mb;
        }
        //this.mb = mb;
    }

    public int getCanhC(){

        return mc;
    }
    public void setCanhC( int mc){
        if ( this.mc > 0){
            this.mc = mc;
        }
        //this.mc = mc;
    }

    public int getChuVi(){
        int  S = this.ma + this.mb + this.mc;
        return S;
    }
    public int getDienTich(){
        int  D = (this.ma + this.mb + this.mc)*2;
        return D;
    }
    public boolean laTamGiac(){
        if( (this.ma + this.mb > this.mc) || (this.ma + this.mc > this.mb) ||(this.mc + this.mb > this.ma)){
            return true;
        }else{
            return false;
        }
    }

    public boolean laTamGiac(int ma, int mb, int mc){
        if((this.ma + this.mb > this.mc) || (this.ma + this.mc > this.mb) ||(this.mc + this.mb > this.ma)){
            return true;
        }else{
            return false;
        }
    }

    public void Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao canh ma:=");
        ma = input.nextInt();
        System.out.print(" Nhap vao canh mb:=");
        mb = input.nextInt();
        System.out.print(" Nhap vao canh mc:=");
        mc = input.nextInt();
    }

    public void Xuat(){
        System.out.print( "\n" + "Chu vi tam giac la:" + getChuVi() + "\n");
        System.out.print("Dien tich tam giac la:" + getDienTich());
    }

}
