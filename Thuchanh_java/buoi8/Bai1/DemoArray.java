package Thuchanh_java.buoi8.Bai1;

public class DemoArray {
        public static void main(String[] args){
            int arrayInt[] = new int[8];
            for (int i = 0; i <arrayInt.length; i++){
                arrayInt[i] = i;
            }

            for (int i = 0; i <arrayInt.length; i++){
                System.out.println(arrayInt[i]);
            }
        }
}
