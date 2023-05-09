import java.util.Scanner;


//Dem cac phan tu âm dương
public class demmang {
    public static void main(String[] args){
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println(" nhap vao so phan tu mang=");
        int n = input.nextInt();
        int []arr = new int[n];

        for(i = 0; i< arr.length;i++){
            System.out.println("a[" + i + "]");
            arr[i] = input.nextInt();
        }


       /* int dem  = 0;
        for( i = 0; i <arr.length ; i++){
            if( arr[i] < 0){
                dem++;
            }
        }
        System.out.println("Có phân tu am la"+ dem);*/

        //dem so phan tu chia het cho 2
       int dem =0;
        for( i = 0; i <arr.length ; i++){
            if( arr[i] % 2==0){
                dem++;
            }
        }
        System.out.println("Có so phan tu chia het cho 2  la:=" + dem);
    }

}
