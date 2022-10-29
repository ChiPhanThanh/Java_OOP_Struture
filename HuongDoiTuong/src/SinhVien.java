import java.util.Scanner;

//Mô tả sinh vien bao gồm họ tên, điểm, các phương thức nhạp xuat xep trung binh diem
public class SinhVien {
    //tao con biến khởi tạo
    String Ten;
    float Diem;

    public void Nhap(){
        Scanner s  = new Scanner(System.in);
        System.out.println("Nhap vao Ten Sinh Vien");
        Ten = s.nextLine();
        System.out.println("Nhap vao Diem:");
        Diem = s.nextFloat();
    }

    public void Xuat(){
        System.out.print("Ten Sinh vien: " + Ten + "\n");
        System.out.print("Diem " + Diem);
    }

    public void xepLoai(){
        if(Diem < 8){
            System.out.print(" Xep loai trung binh duwois 8" );
        }else{
            System.out.print(" Xep loai gioi");
        }
    }

}
