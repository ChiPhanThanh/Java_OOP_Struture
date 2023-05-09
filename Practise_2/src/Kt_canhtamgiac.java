import java.util.Scanner;

public class Kt_canhtamgiac {
    public static void main(String[] args) {
        //kiem tra ba cạnh tam giac
        Scanner input = new Scanner(System.in);

        System.out.print(" Nhap vao so a=");

        int a = input.nextInt();

        System.out.print(" Nhap vao so b=");
        int b = input.nextInt();

        System.out.print(" Nhap vao so c=");
        int c = input.nextInt();

        if(a+b > c){
            System.out.print(" Ba cạnh đó lập thành được một tam giac");
        }else if(a +c > b){
            System.out.println(" Ba cạnh đó  lập thành được một tam giac");
        }
        else if( b +c >a){
            System.out.println(" Ba cạnh đó  lập thành được một tam giac");

        }
        else{
            System.out.println(" Ba cạnh đó  khong lập thành được một tam giac");
        }
    }
}

