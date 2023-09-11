package Week1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DaireDilimiAlanı {
    public static void main(String[] args) throws InterruptedException {
        double pi=3.14,r,alfa,sonuc;
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        System.out.print("Lütfen alanını bulmak istediğiniz daire diliminin yarıçapını veriniz: ");
        r = input.nextDouble();
        System.out.print("Lütfen alfa açısını veriniz: ");
        alfa = input.nextDouble();

        System.out.println("Teşekkürler hemen hesaplıyorum...");
        Thread.sleep(2000);

        sonuc = (pi * (Math.pow(r,2) * alfa)/360);

        System.out.println("Daire diliminizin alanı: " + formatter.format(sonuc));

    }
}
