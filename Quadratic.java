package Day2Prblms;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        double a = sc.nextDouble();

        System.out.println("Enter value of b");
        double b = sc.nextDouble();

        System.out.println("Enter value of c");
        double c = sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        double rootX1 = (-b + sqrt(delta)) / (2.0 * a);
        double rootX2 = (-b - sqrt(delta)) / (2.0 * a);
        System.out.println("Roots of X are " + rootX1 + "& " + rootX2);
    }
}
