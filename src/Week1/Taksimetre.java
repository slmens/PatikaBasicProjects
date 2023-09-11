package Week1;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) throws InterruptedException {
        double priceKM = 2.20,sonuc = 0,mesafe;
        int acılısUcreti = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen gideceğiniz mesafeyi giriniz (km): ");
        mesafe = input.nextDouble();

        System.out.println("Teşekkürler. Hemen ücreti hesaplıyorum.");

        Thread.sleep(2000);

        sonuc = (priceKM*mesafe) + acılısUcreti;

        sonuc = (sonuc < 20)? 20:sonuc;

        System.out.printf("Borcunuz %1$s TL'dir%n",sonuc);

    }
}
