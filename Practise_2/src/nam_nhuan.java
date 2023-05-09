import java.util.Scanner;

public class nam_nhuan {
    //kiem tra nam nhuan
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao năm dể  kiểm tra năm nhuận=");

        int n = input.nextInt();
// Năm nhuận là năm chia hết cho 4 và chia hết cho 400 và không chia hết cho 1000
        if(( n % 400 ==0) || (n % 4)==0 &&( n % 100 != 0)){
            System.out.println("Nam vua nhap la nam nhua" + n);
        }
        else{
            System.out.println( n + "Năm đó khong phải là năm nhuận");
        }
    }

}
