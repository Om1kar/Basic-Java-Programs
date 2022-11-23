package Day2Prblms;

import java.util.Scanner;

public class MaxAndMin {
    static void toCheckMaxAndMinNUm(int a, int b, int c) {
        int num1 = a + b * c;
        int num2 = c + a / b;
        int num3 = a % b + c;
        int num4 = a * b + c;

        if (num1 > num2 && num1 > num3 && num1 > num4)
            System.out.println(num1 + " a + b * c is Greater");
        else if (num2 > num1 && num2 > num3 && num2 > num4)
            System.out.println(num2 + " c + a / b is Greater");
        else if (num3 > num1 && num3 > num2 && num3 > num4)
            System.out.println(num3 + " a % b + c is Greater");
        else
            System.out.println(num4 + " a * b + c is Greater");


    }

    public static void main(String[] args) {
        System.out.println("Enter Numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        toCheckMaxAndMinNUm(a,b,c);

    }
}
