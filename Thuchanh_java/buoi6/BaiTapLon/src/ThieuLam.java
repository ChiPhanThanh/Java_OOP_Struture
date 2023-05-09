public class ThieuLam extends MonPhai implements BoHanhVi{
    public void TungKinh(){
        System.out.println("Thieu Lam dang tung kinh!");
    }

    @Override
    public void LuyenCong(String VuKhi, KyNang kyNang) {
        System.out.println("Thieu Lam dang luyen cong voi vu khi: "+ VuKhi + "Ky Nang: "+ kyNang);
    }

    @Override
    public void AnUong(String DoAn, String ThoiGian, String DiaDiem) {
        System.out.println("Thieu Lam dang an: "+ DoAn + "Thoi Gian: "+ ThoiGian + "Dia Diem: "+DiaDiem);
    }
}
