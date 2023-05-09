import java.util.Scanner;

public class Lap_3_vonglap {
    public static void main(String[] args) {
        //kiem tra ba cạnh tam giac
        //scanner input = new scanner(system.in);
        //System.out.print(" Nhap vao so a=");
        //int a = input.nextInt();

        int n = 100;
        int s = 0;
        int i = 1;
        /*
        for( int i = 1; i<=n; i++){
            s = s+i;
            System.out.println("Tong của dãy số là:" + i);
        }
        System.out.println("Tong của dãy số là:" + s);*/


        //Dung vog lap while
       /* while(i <=n){
            i++;
            s = s+i;
            System.out.println("Tong của dãy số là:" + i);
        }
        System.out.println("Tong của dãy số là:" + s);*/

        //DUng do while
        do{
            System.out.println("Tong của dãy số là:" + i);
            i++;
            s= s+i;
            System.out.println("Tong của dãy số là:" + s);

        }
        while (i <=n);
    }

}
