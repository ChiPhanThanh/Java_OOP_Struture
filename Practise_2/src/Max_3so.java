import java.util.Scanner;

public class Max_3so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Nhap vao so a=");

        int a = input.nextInt();

        System.out.print(" Nhap vao so b=");
        int b = input.nextInt();

        System.out.print(" Nhap vao so c=");
        int c = input.nextInt();


        if ((a > b) &&(a > c)){
            System.out.println("So lon nhat la" + a);
        }

        if ((a < b) &&(c < b)){
            System.out.println("So lon nhat la" + b);
        }

        if ((c>b) &&(a < c)){
            System.out.println("So lon nhat la" + c);
        }

    }

}
