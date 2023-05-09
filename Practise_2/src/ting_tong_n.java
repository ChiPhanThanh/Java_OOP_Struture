import java.util.Scanner;

public class ting_tong_n {
    public static void main(String[] args) {
        int n, tong = 0,last;
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhap vao so n=");
        n = input.nextInt();
//tong = 0;
        int temp  = n; //tao mot biên cho n
        while (temp > 0) { //diem tra dieu kien trươc khi thuc thi
            last = temp % 10;//chia lay du
            tong = tong + last; //sau ckhi chia lây du rôi ta cong vào bien tong chua no
            temp = temp/10; //ta chi lay phan nguyen
        }
        System.out.println("ket qua la:=" + tong);
    }

}
