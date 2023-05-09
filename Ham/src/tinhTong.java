public class tinhTong {
    public static void main(String[] args){
        int a = 20;
        int b = 60;
        System.out.print(" Tong cua hai so a  va b :" + tinhTongHieu());
        System.out.print(" Tong cua hai so a  va b :" + tinhHieu(a,b));
        System.out.print("dien tich " +dientich(a,b));

    }
    public static int tinhTongHieu(){
        int a = 10;
        int b  = 11;
        int c = a + b;
        return c;
    }
    public static int tinhHieu(int a, int b){
        int d = a - b;
        return d;

    }
    public static float dientich(int a, int b){
        int s = a * b;
        return s;
    }
}
