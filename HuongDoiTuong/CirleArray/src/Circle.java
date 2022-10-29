/*Bài 3. (1) Viết lớp Circle, biết lớp có một thuộc tính là radius (bán kính). Viết hàm getArea() tính diện
tích hình tròn, và hàm toString()  trả về chuỗi gồm bán kính và diện tích hình tròn. Kiểm tra lớp Circle.
(2) Viết lớp CircleCollection, trong đó viết các hàm:
+ addCircle: thêm 1 hình tròn vào mảng;
+getSize: lấy số lượng hình tròn trong mảng;
+getCircle/setCircle: lấy/gán hình tròn tại vị trí xác định trong mảng;
+toString: trả về thông tin của tập các hình tròn trong mảng;
+ Hàm tính tổng diện tích hình tròn;
+ Hàm tìm diện tích lớn nhất;
+ Hàm lấy hình tròn có diện tích nhỏ nhất.
(3) Viết chương trình tạo một mảng N hình tròn, với bán kính được phát sinh ngẫu nhiên. Thực hiện các yêu cầu sau:
•	Xuất thông tin của các hình tròn đã nhập.
•	Xuất tổng diện tích của chúng.
•	Xuất diện tích lớn nhất.
•	Xuất thông tin hình tròn có diện tích nhỏ nhất.
*/

public class Circle {
    float radius;
    final double P = 3.14;
    CircleColection circleColection;

    public Circle(float radius, CircleColection circleColection) {
        this.radius = radius;
        this.circleColection = circleColection;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 2*P*radius;
    }

    @Override
    public String toString(){
        return (" Ban kinh hinh trong Radius" + radius + " \n" + "Dien tich hinh tron: "  + getArea());
    }
}
