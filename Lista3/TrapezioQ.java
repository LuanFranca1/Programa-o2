
package trapezio;

public class TrapezioRetangulo {
    private double b;
    private double B;
    private double h;
    public double getb() {
        return this.b;
    }
    public void setb(double b) {
        this.b = b;
    }
    public double getB() {
        return this.B;
    }
    public void setB(double B) {
        this.B = B;
    }
    public double geth() {
        return h;
    }
    public void seth(double h) {
        this.h = h;
    }
    public double perimetro(){
        double p;
        p = this.getB()+this.getb() + this.geth() + (this.geth()+1);
        return p;
    }
    public double area(){
        double a=0;
        double somaB;
        a = (((this.getB() + this.getb()) * this.geth())/2);
        //a =((somaB * getH())/2);
        return a;
    }
}
