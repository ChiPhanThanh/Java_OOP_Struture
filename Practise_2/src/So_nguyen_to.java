import java.util.Scanner;

public class So_nguyen_to {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Nhap vao so n=");
        int num = input.nextInt();


        boolean isPrime = true;

// Với các số < 2 thì không phải số nguyên tố
        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                // Nếu tìm thấy ước số khác 1 và chính nó thì gán lại isPrime
                // và thoát khỏi vòng lặp
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " la so nguyen to");
        } else {
            System.out.println(num + " khong phai la so nguyen to");

        }
    }
}
