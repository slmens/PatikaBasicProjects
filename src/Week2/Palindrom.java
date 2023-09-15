package Week2;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();

        boolean result = isPalindrom(number);
        System.out.println(result);
    }


    static boolean isPalindrom(int number){
        int newNumber = number, reverseNumber = 0, lastNumber;

        while (newNumber != 0){
            lastNumber = newNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            newNumber /= 10;
        }

        boolean result = (newNumber == number);

        return result;

    }
}
