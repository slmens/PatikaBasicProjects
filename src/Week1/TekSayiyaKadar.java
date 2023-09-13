package Week1;
import java.util.Scanner;

public class TekSayiyaKadar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0,total = 0;

        do {
            System.out.print("Lütfen çift bir sayı giriniz: ");
            number = input.nextInt();

            if (number % 4 == 0){
                total += number;
                System.out.println("Girdiğiniz çift ve 4'ün katları olan sayıların toplamı "+total+" oldu.");
            }else {
                System.out.println("Girdiğiniz çift sayı 4'ün katı değil. Bu yüzden toplamaya eklemiyoruz.");
            }

        }while (number % 2 == 0);

    }
}
