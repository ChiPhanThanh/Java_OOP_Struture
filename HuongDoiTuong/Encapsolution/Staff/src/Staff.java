public class Staff {
    private  String maNhanVien;
    private String hoTen;
    private String diaChi;
    private int tuoi;
    private String soDienThoai;
    private String mucLuong;
    private int soNamkinhNghiem;

    //Contructor 1 paragram
    public Staff( String maNhanVien){
        this.maNhanVien = maNhanVien;
    }

    public Staff( String maNhanVien, String hoTen){
        this(maNhanVien);
        this.hoTen = hoTen;
    }
     public Staff( String maNhanVien, String hoTen, int tuoi){
        this(maNhanVien, hoTen);
        this.tuoi = tuoi;

     }

     public Staff (String maNhanVien, String hoTen, int tuoi, String soDienThoai){
        this(maNhanVien, hoTen,tuoi);
        this.soDienThoai = soDienThoai;

     }

     public Staff( String maNhanVien, String hoTen, int tuoi, String soDienThoai, String mucLuong ){
        this(maNhanVien, hoTen, tuoi, soDienThoai);
        this.mucLuong = mucLuong;
     }

     public Staff(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String mucLuong, int soNamkinhNghiem){
        this(maNhanVien, hoTen, tuoi, soDienThoai, mucLuong);
        this.soNamkinhNghiem = soNamkinhNghiem;
     }

    public Staff() {

    }
    //getter và setter


    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(String mucLuong) {
        this.mucLuong = mucLuong;
    }

    public int getSoNamkinhNghiem() {
        return soNamkinhNghiem;
    }

    public void setSoNamkinhNghiem(int soNamkinhNghiem) {
        this.soNamkinhNghiem = soNamkinhNghiem;
    }

    public void lamViec(){
        System.out.print( hoTen + " tot");
    }
    public void nghiNgoi(){
        System.out.print( hoTen + " Nghi nghoi thoi");
    }
    public void nhanLuong(){
        System.out.print( hoTen + " Nhan luong thoi");
    }
    public void diDuLich(){
        System.out.print( "Di du lịch");
    }

}
