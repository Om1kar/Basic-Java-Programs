package Day2Prblms;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int i = 0;
        int sum = 0;
        int num = sc.nextInt();

        while (i <= num) {
            System.out.println(i);
            i++;
            sum = sum + i;
        }
        System.out.println("Sum of n natural numbers = " + sum);
    }


}
