import java.util.Scanner;

public class lonthuhai {

    //Viết chương trình nhập vào mảng 1 chiều có n phần tử kiểu nguyên
    // (n được nhập từ bàn phím). Tìm phần tử lớn thứ hai (second largest element) của mảng. Ví dụ:
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

//        System.out.println(" nhap vao so phan tu mang=");
//        int n = input.nextInt();

        int[] arr = {1,2,3,4,5,6,7,8,10,20};


//        for (i = 0; i < arr.length; i++) {
//            System.out.println("a[" + i + "]");
//            arr[i] = input.nextInt();
//        }

        int max =arr[0] ;
        int min = arr[0];
        for(i =1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        //kiem tra dieu kien
        for(i =1; i<arr.length; i++){
            if(min < arr[i]  && arr[i] < max ){
                min = arr[i];
            }

        }

        System.out.println("phan tu lon thu hai mang la:="+min);
    }

}
