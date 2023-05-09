package Phanthanhchi_Java;

import java.util.Scanner;

public class bai2hoandoiso {
    public static void main(String[] args){
        int a = 10, b = 20, temp;
        Scanner input = new Scanner (System.in);
        System.out.println("------ban hay hoan doi vi tri cho nhau------------------");
        System.out.println("So a la:");
        System.out.println("So b la:");
        temp = a;
        a = b;
        b = temp;

        System.out.println("hai so hoan doi cho nhau la:" + a +" "+ b);
    }

}
