package StringJava;
import java.util.Scanner;

public class TimHieuString {
    public static  void main(String [] args) {
        //String s = "chao phan thanh chi";
        //System.out.println(s);
        /*String s2 = new String("chao phan thanh chi cho qua");*/
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ho va ten");
        String s3 = input.nextLine();
        System.out.println(" xuat ki tu vua nhap la:"+ "   " + s3.toUpperCase()); // in hoa chu
        System.out.println(" xuat ki tu vua nhap la:"+ "   " + s3.startsWith("chi"));
        System.out.println(" xuat ki tu vua nhap la:"+ "   " + s3.toLowerCase()); // in chu thuong
        System.out.println(" xuat ki tu vua nhap la:"+ "   " + s3.endsWith("vang")); // kiem tra ki tu cuoi
        System.out.println(" xuat ki tu vua nhap la:"+ "   " + s3.trim()); // trim
//      System.out.println(" xuat ki tu vua nhap la:"+ "   " + s3.getBytes());
        //charAt(): vi tri cua cac ki tu
        //getChars: Lay theo vi tri
        //getByte: laay ra gia tri cua tung ki tu
        char [] ArrayB = new char[26];
        s3.getChars(2,4,ArrayB,0);
        for (int i = 0; i < ArrayB.length; i++){
            System.out.println(" i=" + i + " la" + ArrayB[i]);
        }
    }
    
}
