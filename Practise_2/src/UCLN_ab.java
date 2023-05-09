import java.util.Scanner;

public class UCLN_ab {
    public static void main(String[] args){
        /*Scanner input  = new Scanner(System.in);

        System.out.println(" Nhap vao so a=");
        int a = input.nextInt();

        System.out.println(" Nhap vao so b=");
        int b = input.nextInt();

        //ddieu kien
        if( a == 0 || b == 0){
            System.out.println("Khong thoa man dieu kien");
        }
        while( a != b){
            if( a > b){
                a = a -b;
            }
            else{
                b = b-a;
            }
        }
        System.out.println("Ươc chung lon nhat la:=" + a);*/
        int gcd = 1;
// nhập 2 số num1 và num2
        Scanner input  = new Scanner(System.in);
        System.out.println(" Nhap vao so a=");
        int num1 = input.nextInt();
        System.out.println(" Nhap vao so a=");
        int num2 = input.nextInt();

        for (int i = 1; i <= num1 && i <= num2; i++) {
            // Kiểm tra nếu num1 và num2 đều chia hết cho i
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Ươc chung lon nhat la:=" + gcd);
    }

}
