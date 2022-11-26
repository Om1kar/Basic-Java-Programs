package Day2Prblms;

import java.util.Scanner;

public class ReverseNumByForLoop {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        int remainder = 0;
        for (int i = 0; i < number; i++) {
            remainder = num % 10;
            number = number / 10;
            reverse = (reverse * 10) + remainder;

        }
        System.out.println(reverse);
    }
}
