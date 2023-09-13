package Week1;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,total = 0;

        System.out.print("Lütfen bir sayı veriniz: ");
        number = input.nextInt();

        while(number > 0) {
            total += number % 10;
            number /= 10;
        }

        System.out.println(String.format("Vermiş olduğunuz sayının basamakları toplamı: %s",total));
    }
}
