package Thuchanh_java.buoi3;

public class nghicdao {
        public static boolean ktraSoThuanNghich(int n) {
            StringBuilder xau = new StringBuilder();
            String str = "" + n;
            xau.append(str);
            String check = "" + xau.reverse();
            if (str.equals(check))
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            int n, count = 0;
            for (n = 100000; n <= 999999; n++) {
                if (ktraSoThuanNghich(n)) {
                    System.out.println(n);
                    count++;
                }
            }
            System.out.println("Có " + count + " số thuận nghịch có 6 chữ số.");
        }

    }

