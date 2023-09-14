package Week1;
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int x;
        double y;

        System.out.print("Bir tam sayı giriniz: ");
        x = input.nextInt();

        // Ondalıklı sayı girerken lütfen virgül kullanın. 16,7 18,5 5,4 gibi
        System.out.print("Bir ondalık sayı giriniz: ");
        y = input.nextDouble();

        System.out.println("Teşekkürler...");
        Thread.sleep(1000);

        System.out.println("Casting öncesi değerler: X:"+ x + ", Y: " + y);

        double dX = (double)x;
        int iY = (int)y;

        Thread.sleep(1000);

        System.out.println("Casting sonrası değerler X:"+ dX + ", Y: " + iY);

    }
}
