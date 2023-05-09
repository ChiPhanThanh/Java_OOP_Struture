import java.util.Scanner;

public class Reveser_array {
    public static void  main(String[] args){
            int i;
            Scanner input = new Scanner(System.in);
                System.out.println("Nhap vao n=");
                int n = input.nextInt();

                int[] num;
                num = new int[n];

                for (i = 0; i < n; i++) {
                    System.out.printf("a[" + i + "]=");
                    num[i] = input.nextInt();

               }

                for (  i = (num.length) - 1;i >= 0; i--) {
                    System.out.printf(num[i]+"  ");
                }
           }
}
