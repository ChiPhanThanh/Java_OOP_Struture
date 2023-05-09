package Thuchanh_java.buoi8.Bai1;

public class Main {
    public  static void main(String[] args){
        CirleCollection co = new CirleCollection();
        co.addCircle();
        System.out.println(" Tong dien tich" + co.sumArea());
        System.out.println(" Dien tich lin nhat " + co.maxArea());

        System.out.println("======In thông tin hình trong=====");
        System.out.print(co.toString());
    }

}
