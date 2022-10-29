
public class TestTamGiac {
    public static void main(String[] args){
        HinhTamGiac TamGiac = new HinhTamGiac();
        TamGiac.Nhap();
        System.out.print("\n"+"Kiem tra:" +TamGiac.laTamGiac());
        TamGiac.Xuat();
    }
}
