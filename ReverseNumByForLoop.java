package Day2Prblms;

import java.util.Scanner;

public class ReverseNumByForLoop {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int remainder = 0;
        for (int i = 0; i < num; i++) {

            remainder = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + remainder;

        }
        System.out.println(reverse);
    }
}
