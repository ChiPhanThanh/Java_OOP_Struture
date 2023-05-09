import java.util.Scanner;

public class Switch_day {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap vao dayNumber=");
        int dayNumber = input.nextInt();

        //cau trúc switch
        switch(dayNumber){
            case 0:
                System.out.println("Sunday"); break;
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Thursday");break;
            case 4:
                System.out.println("Fireday");break;
            case 5:
                System.out.println("Sixday");break;
            case 6:
                System.out.println("Saturday");break;
            default:
                if( dayNumber >7 ){
                    System.out.println("Invailid");
                }
        }
    }
}
