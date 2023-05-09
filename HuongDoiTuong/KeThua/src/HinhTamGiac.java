public class HinhTamGiac extends HCN {
   private int c;
   public void HCN(int c){
       this.c  =c;
   }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public HinhTamGiac(int a, int b, int c) {
        super(a, b);
    }

    @Override
    public void Nhap() {
        super.Nhap();
    }

    @Override
    void Xuat() {
        super.Xuat();
    }

    @Override
    public int getA() {
        return super.getA();
    }
    @Override
    public void setA(int a) {
        super.setA(a);
    }

    @Override
    public int getB() {
        return super.getB();
    }

    @Override
    public void setB(int b) {
        super.setB(b);
    }

    public float dientichtamgiac(int a, int b){
        return this.S = (a * b)+c;
    }

}
