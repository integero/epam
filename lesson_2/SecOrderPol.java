package epam.lesson_2;

public class SecOrderPol {
    public static void main(String[] args) {
        SecondOrderPolinom poly = new SecondOrderPolinom(0.0D, -1.0D, 0.0D);
        poly.calculateRoots();
        System.out.println(poly.getRoot1());
        System.out.println(poly.getRoot2());
    }
}

