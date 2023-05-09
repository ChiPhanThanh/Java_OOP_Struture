public class KyNang {
    private String TenKyNang;
    private int SatThuong;
    private String ThuocTinh;
    private String MoTa;

    public KyNang(){}

    public KyNang(String tenKyNang, int satThuong, String thuocTinh, String moTa) {
        this.TenKyNang = tenKyNang;
        this.SatThuong = satThuong;
        this.ThuocTinh = thuocTinh;
        this.MoTa = moTa;
    }

    public String getTenKyNang() {
        return TenKyNang;
    }

    public void setTenKyNang(String tenKyNang) {
        this.TenKyNang = tenKyNang;
    }

    public int getSatThuong() {
        return SatThuong;
    }

    public void setSatThuong(int satThuong) {
        this.SatThuong = satThuong;
    }

    public String getThuocTinh() {
        return ThuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.ThuocTinh = thuocTinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        this.MoTa = moTa;
    }

    @Override
    public String toString() {
        return "KyNang: TenKyNang=" + TenKyNang + ", SatThuong=" + SatThuong + ", ThuocTinh=" + ThuocTinh + ", MoTa=" + MoTa + ".";
    }
}
