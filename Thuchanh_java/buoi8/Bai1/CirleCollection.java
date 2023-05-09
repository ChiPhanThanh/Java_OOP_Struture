package Thuchanh_java.buoi8.Bai1;

public class CirleCollection
{
    Circle[] cir = new Circle[4];

    public CirleCollection() {
    }

    public void addCircle() {
        cir[0] = new Circle(8);
        cir[1] = new Circle(6);
        cir[2] = new Circle(7);
        cir[3] = new Circle(9);
    }

    public int getSize() {
        return cir.length;
    }

    public Circle getCircle(int i) {
        return cir[i];
    }

    public void setCircle(Circle c1, int i) {
        cir[i] = c1;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i <= cir.length; i++) {
            s = s + cir[i].toString();
        }
        return s;
    }

    public double sumArea() {
        double sum = 0;
        for (int i = 0; i < cir.length; i++) {
            sum = sum + cir[i].getArea();
        }
        return sum;
    }

    public double maxArea() {
        double max = cir[0].getArea();
        int indexMax = 0;

        for (int i = 0; i <= cir.length; i++) {
            if (cir[i].getArea() > max) {
                max = cir[i].getArea();
                indexMax = i;
            }
        }
        System.out.println("Thong tin Dien tich lon nhat");
        System.out.println(cir[indexMax].toString());

        return max;
    }
}


