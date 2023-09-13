package Week1;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int number;
        double total = 0;

        System.out.print("Harmonik değerini bulmak istediğiniz sayıyı giriniz: ");
        number = input.nextInt();

        System.out.println("Teşekkürler hemen hesaplıyorum...");
        Thread.sleep(2000);

        for (int i = 1;i<=number; i++){
            total += (1.0/i);
        }

        System.out.println(String.format("Bu sayının harmonik değeri: %s",total));

    }
}
