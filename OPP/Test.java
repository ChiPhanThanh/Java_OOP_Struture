package OPP;
import java.util.Scanner;


public class Test {
    public static void main(String [] args){
        Ngay ngay1 = new Ngay(15,5,2021);
        Ngay ngay2 = new Ngay(15,9,2030);
        Ngay ngay3 = new Ngay(12,5,2025);

        TacGia  tacgia1 = new TacGia ("TungTV", ngay1);
        TacGia  tacgia2 = new TacGia ("TungTV", ngay2);
        TacGia  tacgia3 = new TacGia ("TungTV", ngay3);

        Sach sach1 = new Sach(" Lap trinh c", 600, 2021, tacgia1);
        Sach sach2 = new Sach(" Lap trinh java", 600, 2030, tacgia3);
        Sach sach3 = new Sach(" Lap trinh py", 600, 2025, tacgia2);

        sach1.inTenSach();
    }
}
