package Week1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) throws InterruptedException {
        double kilo,boy,sonuc;

        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.print("Lütfen boyunuzu giriniz (metre cinsinde): ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.println("Teşekkürler hemen hesaplıyorum...");

        Thread.sleep(2000);

        sonuc = kilo/Math.pow(boy,2);

        System.out.println("Vücut kitle endeksiniz: "+formatter.format(sonuc));

    }
}
