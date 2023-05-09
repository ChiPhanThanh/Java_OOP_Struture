import java.util.Scanner;

public class tro_choi_fizzbuzz {
    public static void main(String[] args) {

        int n =100,i;
        for(i=1; i<=100;i++){
            //System.out.print("\t"+i);
            if((i % 3==0) &&(i%5==0)){
                System.out.print(" FizzBuz"+i);

            }else if( i % 5 == 0){
                System.out.print(" Buzz"+i);

            }else if(i %3==0) {
                System.out.print(" FizzBuz");
            }else{
                System.out.print("\t"+i);
            }
        }

   }
}
