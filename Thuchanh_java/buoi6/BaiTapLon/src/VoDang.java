public class VoDang extends MonPhai implements BoHanhVi{
    public void GiangDao(){
        System.out.println("Vo Dang dang giang dao!");
    }

    @Override
    public void LuyenCong(String VuKhi, KyNang kyNang) {
        System.out.println("Vo Dang dang luyen cong voi vu khi: "+ VuKhi + "Ky Nang: "+ kyNang);
    }

    @Override
    public void AnUong(String DoAn, String ThoiGian, String DiaDiem) {
        System.out.println("Vo Dang dang an: "+ DoAn + "Thoi Gian: "+ ThoiGian + "Dia Diem: "+ DiaDiem);
    }
}
