import java.util.Scanner;

public class TracNghiem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println(" ===Trac nghiem========== ");
            System.out.println(" Cau hoi 1 :  Ai la lapj trinh vien dau tien");
            System.out.println(" 1.phan thanh chi");
            System.out.println("2.Hoang van hoa");
            System.out.println("nhan q de thoat");
            String luachon = input.nextLine();
            if(luachon.equals ("1")){
                System.out.print(" ban tra loi dung");
                break;
            }else if(luachon.equals ("2")){
                System.out.print(" ban tra loi sai");
                break;
            }else if( luachon.equals("q")){
                break;
            }else{
                System.out.print(" vui long chin lai");
            }
        }
    }
}
