import java.util.Scanner;

public class Max_min {
    public static void main(String[] args){
      int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao n=");
        int n = input.nextInt();

        int [] num;
        num = new int[n];

        //Tim gia tri lon nhat và nho nhat cau mang
        for( i = 0; i<n;i++){
            System.out.print("a[" + i+"]=");
            num[i] = input.nextInt();
        }

        //Lam thao man cac dieu kien
        int max = num[0], min = num[0];
        for( i =0;i < n; i++){
            if (max < num[i] )
            {
                max = num[i];
            }
            if( min > num[i]){
                min = num[i];
            }
        }
        System.out.println(" phần tu mang lơn nhất là:" + max);
        System.out.printf("Phân tử mảng bé nhất là" + min);
    }
}

