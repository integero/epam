package epam;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        sqEq(1, -4, 3);
        sqEq(1, -4, 4);
        sqEq(5, -4, 4);
        sqEq(0, -4, 4);
        sqEq(0, 0, 4);
        sqEq(0, 0, 0);
    }

    public static void sqEq(double a, double b, double c) {
//        solution of square equation
        if (a != 0) {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < 0)
                System.out.println("The solution lies in the complex plane");
            else {
                if (discriminant == 0)
                    System.out.println("Multiple root  " + (-b / (2 * a)));
                else {
                    System.out.println("First  root:  " + (-b + sqrt(discriminant)) / (2 * a));
                    System.out.println("Second root:  " + (-b - sqrt(discriminant)) / (2 * a));
                }
            }
        } else {
            if (b != 0) {
                System.out.println("Single root:  " + -c / b);
            } else {
                if (c != 0)
                    System.out.println("There are no roots at all");
                else
                    System.out.println("Any value from real number set");
            }
        }
    }
}
