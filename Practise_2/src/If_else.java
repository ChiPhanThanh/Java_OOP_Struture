import java.util.Scanner;

public class If_else {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao n=");
        int n = input.nextInt();

        //cau dieu kien
        if(n % 2==0){
            System.out.println("So do chia het");
        }
            else{
                System.out.println(" So đó không chia het");
            }

        }
    }

