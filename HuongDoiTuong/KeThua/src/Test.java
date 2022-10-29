public class Test {
    public static void main(String [] args){
        HCN hcn = new HCN();
        //Object hcn =new HCN();
        hcn.Nhap();
        hcn.tinhChuViHCN();
        hcn.tinhDienTich();
        hcn.Xuat();

        HinhTamGiac tamgiac = new HinhTamGiac(7,5,3);
        tamgiac.Nhap();
        tamgiac.Xuat();

    }
}
