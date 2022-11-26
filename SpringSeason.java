package Day2Prblms;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month no");
        int m = scanner.nextInt();//month
        System.out.println("enter day no");
        int d = sc.nextInt();//day

        boolean isSpring = (m == 3 && d >= 20) || (m == 6 && d <= 20)
                || (m == 4 && d <= 30) || (m == 5 && d <= 31);
        System.out.println(isSpring);


    }

}
