package ru.epam.lessons.lesson_2;

import static java.lang.Math.sqrt;

public class SecondOrderPolinom {
    //    a*x^2 + b*x + c
    private double a;
    private double b;
    private double c;
    private Double root1;
    private Double root2;

    SecondOrderPolinom(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calculateRoots() {
        double discriminant = calculateDiscriminant();
        if (a != 0) {
            if (discriminant < 0) {
                root1 = null;
                root2 = null;
            } else {
                if (discriminant == 0) {
                    root1 = -b / (2 * a);
                    root2 = root1;
                } else {
                    root1 = (-b + sqrt(discriminant)) / (2 * a);
                    root2 = (-b - sqrt(discriminant)) / (2 * a);
                }
            }
        } else {
            if (b != 0) {
                root1 = -c / b;
                root2 = null;
            } else {
                if (c != 0) {
                    root1 = null;
                    root2 = null;
                } else{
                    root1=Double.NEGATIVE_INFINITY;
                    root2=Double.POSITIVE_INFINITY;
                }
            }
        }

    }

    private double calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    Double getRoot1() {
        return root1;
    }

    Double getRoot2() {
        return root2;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
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

}
