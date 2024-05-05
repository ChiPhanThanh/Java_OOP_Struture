package StringJava;

import java.util.Scanner;

public class StringBuffer {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ho va ten");
        String s3 = input.nextLine();
        System.out.println("do dai" + s3.length());
        //int doDai = s3.length();
//        for ( int i = 0; i < s3.length(); i++){
//            System.out.println("vi tri " + i + " =" + s3.charAt(i));
//        }
//        char [] ArrayB = new char[26];
//        s3.getChars(2,4,ArrayB,0);
//        for (int i = 0; i < ArrayB.length; i++){
//            System.out.println(" i=" + i +"la" + ArrayB[i]);
//        }
        String s1  =" chao";
        String s2  = " vang";
        String s5  = s1.concat(s2);
        System.out.print(s5);
    }
}
