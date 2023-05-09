package Phanthanhchi_Java1;
import java.util.Scanner;

public class chi {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a=");
        a = input.nextInt();

        System.out.println("Nhap vao b=");
        b = input.nextInt();

        c = a + b;
        System.out.println("Kết qua của C la:" + c);

        if( c == 10) {
            System.out.println("Tau yêu mi");
        }
            else{System.out.println("chòa");
        }

    }
}
