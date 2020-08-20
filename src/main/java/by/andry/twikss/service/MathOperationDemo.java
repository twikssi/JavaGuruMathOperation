package by.andry.twikss.service;

import java.util.Objects;

public class MathOperationDemo {
    private double a;
    private double b;

    public double getDivisionAandB(){
        return getA()/getB();
    }

    public double getMultiplicationAandB(){
        return getA()*getB();
    }

    public double GetDeductionAminusB (){
        return getA() - getB();
    }

    public double getSumAandB(){
        return getA() + getB();
    }

    public MathOperationDemo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathOperationDemo that = (MathOperationDemo) o;
        return Double.compare(that.a, a) == 0 &&
                Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "MathOperationDemo{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
