package by.common.exercise10;

public class AreaData {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public AreaData(double a,double b,double c,double d,double e,double f) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setD(d);
        this.setE(e);
        this.setF(f);
    }

    private void checkDouble(double number) {
        if(number < 0) {
            System.out.println("wrong value");
            System.exit(1);
        }
    }

    private void setA(double a) {
        checkDouble(a);
        this.a = a;
    }

    private void setB(double b) {
        checkDouble(b);
        this.b = b;
    }

    private void setC(double c) {
        checkDouble(c);
        this.c = c;
    }

    private void setD(double d) {
        checkDouble(d);
        this.d = d;
    }

    private void setE(double e) {
        checkDouble(e);
        this.e = e;
    }

    private void setF(double f) {
        checkDouble(f);
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
}
