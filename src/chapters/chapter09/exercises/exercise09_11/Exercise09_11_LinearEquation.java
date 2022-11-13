package chapters.chapter09.exercises.exercise09_11;

import java.util.Scanner;

public class Exercise09_11_LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public Exercise09_11_LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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

    public boolean isSolve() {
        if (getA() * getD() - getB() * getC() != 0) {
            return true;
        } else
            return false;
    }

    public double getX() {
        return (getE() * getD() - getB() * getF()) / (getA() * getD() - getB() * getC());
    }

    public double getY() {
        return (getA() * getF() - getE() * getC()) / (getA() * getD() - getB() * getC());
    }


}
