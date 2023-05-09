import java.util.Arrays;
import java.util.Scanner;

//nhập vào danh sách sinh vien họ tên sinh viên bao gồm : họ tên, tuôi, môn , diem ,sắp xếp điểm từ cao đến thấp
// tìm điểm lớn nhất trong danh sách, 
public class QuanLySinhVien {

//     void nhap(String Sinhvien[],int n, String hoTen, int diem, int tuoi){
//        for( int i = 0; i <= Sinhvien.length; i++){
//            Scanner input = new Scanner(System.in);
//            System.out.println("Nhap vao ho ten sinh vien");
//            hoTen = input.nextLine();
//            System.out.println("Nhap vao tuoi sinh vien");
//            tuoi = input.nextByte();
//            System.out.println("Nhap vao diem sinh vien");
//            diem = input.nextInt();
//        }
//    }
//
//      void xuat(int n, String hoTen, int diem, int tuoi, String Sinhvien[]){
//         for( int i = 0; i <= Sinhvien.length; i++){
//             System.out.println(" ho ten sinh vien" + hoTen);
//             System.out.println(" tuoi sinh vien" + tuoi);
//             System.out.println("diem sinh vien" + diem);
//         }
//     }


    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        String name [] = new String [5];
        float diem [] = new float[5];
        for( int i = 0; i < 5; i++){
            System.out.print(" nhap vao ten: " + i + ":");
            name[i] = input.nextLine();
            System.out.print(" nhap  diem: " + i + ":");
            diem[i] = input.nextFloat();
        }

        //lay sanh sch ra
        for(int i = 0; i < 5; i++){
            System.out.print(" ten" + name[i]);
            System.out.print(" diem" + diem[i]);
        }
     }
}


