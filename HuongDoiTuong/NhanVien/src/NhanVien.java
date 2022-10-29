public class NhanVien {
    String maNV;
    int soSP;
    double Luong;
    public NhanVien( String maNV, int soSP){
        this.maNV = maNV;

        if(soSP > 0){
            this.soSP = soSP;
        }else{
           this.soSP = 0;
        }
    }

    public NhanVien(){
    }

    public String getMaNV(){
        return maNV;
    }

    public void setMaNV(String maNV){
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    //Vươt chuẩn
    public boolean coVuotChuan(){
        if(this.soSP > 500){
            return true;
        }else{
            return false;
        }
    }
    public String getTongKet(){
        if(this.soSP > 500){
            return "Vuot";
        }else{
            return "";
        }
     }

    public double getLuong(){
        if(this.soSP < 500){
            return Luong = 20000 * this.soSP;
        }else{
            return Luong  = 30000 * this.soSP;
        }
    }

    public static String xuatTieuDe( ){
        return " Ma NV         SoSP        Luong        TongKet";
    }

    @Override
    public String toString(){
        return maNV  + "    " + soSP + "       " + getLuong() + "         " + getTongKet();
    }

    public static void main(String [] args){
        NhanVien nhanvien = new NhanVien("021323420000",700);
        NhanVien nhanvien2 = new NhanVien("02124354758",300);
        //System.out.print("Kiem tra:" + nhanvien.coVuotChuan() +"\n");
       // System.out.print("Tong ket qua: " + " " +nhanvien.getTongKet() + "\n");
       // System.out.print("Luong=" +nhanvien.getLuong());
        System.out.println(xuatTieuDe());
        System.out.println(nhanvien.toString());
        System.out.print(nhanvien2.toString());



    }
}
