package Thuchanh_java.buoi3;

public class Fibonacin {
        public static void main(String[] args) {
            int count = 7, num1 = 0, num2 = 1;
            System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
            int i=1;
            while(i<=count)
            {
                System.out.print(num1+" ");
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
                i++;
            }
            System.out.println();
        }
    }
