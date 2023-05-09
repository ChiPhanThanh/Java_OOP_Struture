public class CaiBang extends MonPhai implements BoHanhVi{
    public void AnXin(){
        System.out.println("Cai Bang dang di an xin!");
    }

    @Override
    public void LuyenCong(String VuKhi, KyNang kyNang) {
        System.out.println("Cai Bang dang luyen cong voi vu khi: "+ VuKhi + "Ky Nang: "+ kyNang);
    }

    @Override
    public void AnUong(String DoAn, String ThoiGian, String DiaDiem) {
        System.out.println("Cai Bang dang an: "+ DoAn + "Thoi Gian: "+ ThoiGian + "Dia Diem: "+ DiaDiem);
    }
}
