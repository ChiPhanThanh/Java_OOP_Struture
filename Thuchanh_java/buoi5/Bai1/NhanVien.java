package Thuchanh_java.buoi5.Bai1;
import java.util.Random;

public class NhanVien {
        private int maSo;
        private String hoTen;
        private String diaChi;
        private boolean CBQL;
        public NhanVien() {
        }

        public NhanVien(int maSo, String hoTen, String diaChi, boolean cBQL) {
            super();
            this.maSo = maSo;
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            CBQL = cBQL;
        }

        public int getMaSo() {
            return maSo;
        }

        public void setMaSo(int maSo) {
            this.maSo = maSo;
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

        public boolean isCBQL() {
            return CBQL;
        }

        public void setCBQL(boolean cBQL) {
            CBQL = cBQL;
        }

        @Override
        public String toString() {
            return "NhanVien: maSo=" + maSo + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", CBQL=" + CBQL + "]";
        }

        public static void main(String[] args) {
            System.out.print("==================Lap Trinh Java- Phan Thanh Chi=====================" + "\n" );
            NhanVien[] nhanVien = new NhanVien[3];
            for(int i = 0; i < 3; i++) {
                Random random = new Random();
                nhanVien[i]  = new NhanVien(i, "Phan Thanh Chi", "Yen Thanh", random.nextBoolean());
            }

            for(int i = 0 ; i < 3; i++) {
                if(nhanVien[i].isCBQL()) {
                    System.out.println(nhanVien[i]);
                }
            }
        }
    }

