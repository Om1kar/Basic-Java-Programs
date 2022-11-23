package Day2Prblms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter to Reverse Any Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + remainder;
        }
        System.out.println("Reverse Number is " + reverse);
    }
}
