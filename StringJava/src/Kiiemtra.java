import java.util.Scanner;

public class Kiiemtra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(("Mơi nhp ho ten"));
        String hoten = input.nextLine();
        hoten = hoten.trim(); // Cắt tất cả các dấu cách ở đầu và cuối

        //kiem tra tu ơ dau có phao PHan khong
        if (hoten.startsWith("Phan")) {
            System.out.print((" Ho cua ban la: Phan"));
        } else {
            System.out.print((" Ho cua ban  khong p la: Phan"));
        }
    }
}
