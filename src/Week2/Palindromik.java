package Week2;
import java.util.Scanner;

public class Palindromik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.print("Bir kelime giriniz: ");
        word = scan.nextLine();

        System.out.println(isPalindrome(word));

    }


    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
}
