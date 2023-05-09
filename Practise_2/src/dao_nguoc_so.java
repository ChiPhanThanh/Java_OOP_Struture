import java.util.Scanner;

public class dao_nguoc_so {


    // Nhập số n từ bàn phím
    public static void main(String[] args) {
        int n, reverseNumber, lastDigit;
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao so n=");
         n = input.nextInt();

        reverseNumber = 0;
        while (n > 0) {
            // Lấy chữ số cuối cùng của n
            lastDigit = n % 10;

            // Thêm chữ số vừa lấy được vào reverseNumber
            reverseNumber = reverseNumber * 10 + lastDigit;

            // Bỏ đi chữ số cuối cùng của n
            n /= 10;
        }
        System.out.println("The reverse number is: " + reverseNumber);
    }
}
