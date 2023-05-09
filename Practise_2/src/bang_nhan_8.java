import java.util.Scanner;

public class bang_nhan_8 {
    public static void main(String[] args) {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao so bang cưu chương=");
        int n = input.nextInt();

        for(i =1; i<=n; i++){
            System.out.print(i);
                for( i = 1; i<= i ;i++){
                    System.out.println("\t*");
                }
        }



        /*for(i  = 1 ; i<= n; i++){
            System.out.println(n + "x" + i + "=" +(n *i));
        }*/

    }
}


