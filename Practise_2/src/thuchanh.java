import java.util.Scanner;

public class thuchanh {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" nhap vao  n =");
        float n = input.nextInt();
        for( int i = 0; i <=n; i++){
            if( i % 2 == 0){
                System.out.print( "\n" + i
                + "so chan la");
            }else{
                System.out.print( " ");
            }
        }

    }

}
