import java.util.Scanner;

public class fibonacin {
    public static void main(String[] args) {

        int n,i;
        // f0 = 0; f1 = 1
        //fn  =f(n-1)+ f(n-2)
        //luu a = fo  b = f1
        int a =0; int b = 1, c;


        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap vao so n=");
        n = input.nextInt();
        System.out.println("Day fibonaci");
        if( n>=0 ){
            System.out.println(a + " ");
        }
        if( n>=1 ){
            System.out.println(b + " ");
        }

        for(i =2; i<=n;i++){
             c = a+b;
            System.out.println(c + " \t");

            //luu a = f(n-1) va b = f(n)
            a = b;
            b = c;
        }


    }
}
