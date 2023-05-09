public abstract class MonPhai {
    private String TenMonPhai;
    private String TenTruongMon;
    private KyNang kyNang;
    private String NoiO;
    private String MonQuy;
    private String MoTa;

    public MonPhai(){}

    public MonPhai(String tenMonPhai, String tenTruongMon, KyNang kyNang, String noiO, String monQuy, String moTa) {
        this.TenMonPhai = tenMonPhai;
        this.TenTruongMon = tenTruongMon;
        this.kyNang = kyNang;
        this.NoiO = noiO;
        this.MonQuy = monQuy;
        this.MoTa = moTa;
    }

    public String getTenMonPhai() {
        return TenMonPhai;
    }

    public void setTenMonPhai(String tenMonPhai) {
        this.TenMonPhai = tenMonPhai;
    }

    public String getTenTruongMon() {
        return TenTruongMon;
    }

    public void setTenTruongMon(String tenTruongMon) {
        this.TenTruongMon = tenTruongMon;
    }

    public KyNang getKyNang() {
        return kyNang;
    }

    public void setKyNang(KyNang kyNang) {
        this.kyNang = kyNang;
    }

    public String getNoiO() {
        return NoiO;
    }

    public void setNoiO(String noiO) {
        this.NoiO = noiO;
    }

    public String getMonQuy() {
        return MonQuy;
    }

    public void setMonQuy(String monQuy) {
        this.MonQuy = monQuy;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        this.MoTa = moTa;
    }

    public void SoTai(MonPhai monPhai1, MonPhai monPhai2){
        if(monPhai1.kyNang.getSatThuong() > monPhai2.kyNang.getSatThuong()){
            System.out.println("Mon phai: "+ monPhai1.getTenMonPhai() + "Chien thang");
        }
    }

    @Override
    public String toString() {
        return "MonPhai: TenMonPhai=" + TenMonPhai + ", TenTruongMon=" + TenTruongMon + ", KyNang=" + kyNang + ", NoiO=" + NoiO + ", MonQuy=" + MonQuy + ", MoTa=" + MoTa + ".";
    }
}
