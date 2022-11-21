package Day2Prblms;

import java.util.Scanner;

public class CheckVowel {
    static void checkVowelOrConsonant(char ch) {
        switch (ch) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered Word is Vowel");
                break;
            default:
                System.out.println("Entered Word is Consonant");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word to Check");
        char ch = sc.next().charAt(0);
        checkVowelOrConsonant(ch);

    }
}

