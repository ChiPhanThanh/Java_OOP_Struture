package Thuchanh_java.buoi8.Bai1;

public class Circle {
  private double radius;
  public Circle(){

  }

  public Circle(double radius){
      this.radius = radius;
  }

  public double getArea(){
      return 3.14 * radius*radius;
  }

  @Override
    public String toString(){
      return " Ban kinh " + radius + "; Dien tich; " + getArea() + "\n";
  }

    public double getRadius(){
      return radius;
    }

    public void setRadius(double radius){
      this.radius = radius;
    }
}
