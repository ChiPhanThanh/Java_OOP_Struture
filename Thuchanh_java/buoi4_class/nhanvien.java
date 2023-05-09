
package Thuchanh_java.buoi4_class;
import java.util.Scanner;

public class nhanvien {
    String maNV;
    int soSP;

    public nhanvien(){

    }

    public nhanvien(String ma, int sp){
        if(sp >= 0){
            this.soSP = sp;
        }else{
            this.soSP = 0;
        }
        this.maNV = ma;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public boolean coVuotChuan(){
        if(soSP > 500){
            return true;
        }else{
            return false;
        }
    }

    public String getTongKet(){
        if(soSP > 500){
            return "Vuot";
        }else{
            return "";
        }
    }

    public double getLuong(){
        if(soSP <= 500){
            return soSP*20000;
        }else{
            return 500*20000+(soSP-500)*30000;
        }
    }

    public static String xuatTieuDe(){
        return " Ma NV          SOSP        Luong       Tong Ket";//
    }

    @Override
    public String toString() {
        return maNV+"           "+soSP+"         "+getLuong()+"         "+getTongKet();
    }

    public static void main(String[] args) {
        nhanvien nv1 = new nhanvien("NV1",450);
        nhanvien nv2 = new nhanvien("NV2", 550);

        System.out.println(xuatTieuDe());
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());


    }
}
