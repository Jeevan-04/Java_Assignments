package Assignment2.Question7;

public class Complex {
    private double real;
    private double imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex n) {
        return new Complex(this.real + n.real, this.imag + n.imag);
    }

    public Complex subtract(Complex n) {
        return new Complex(this.real - n.real, this.imag - n.imag);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imag + "i";
    }
}
