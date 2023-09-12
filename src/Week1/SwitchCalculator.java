package Week1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        int secim;
        double sayi1,sayi2,sonuc = 0;

        System.out.println("Hesap makinesine hoşgeldiniz. Lütfen yapmak istediğiniz işlemi seçiniz.");
        System.out.print("Toplama için 1, çıkarma için 2, çarpma için 3, bölme için 4 yazınız: ");
        secim = input.nextInt();
        System.out.println("Teşekkürler, lütfen şimdi işlem yapmak istediğiniz sayıları veriniz.");
        System.out.print("İlk sayı: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayı:");
        sayi2 = input.nextDouble();

        switch (secim){
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 == 0){
                    System.out.print("Bölen sayı 0 olamaz. Lütfen yeni bir sayı verin: ");
                    sayi2 = input.nextDouble();
                    if (sayi2 == 0){
                        System.out.println("Bölen sayı 0 olamaz. Program kapatılıyor.");
                        System.exit(0);
                    }else {
                        sonuc = sayi1 / sayi2;
                        break;
                    }
                }else {
                    sonuc = sayi1 / sayi2;
                    break;
                }
        }

        System.out.println(String.format("Sonuç: %s",formatter.format(sonuc)));
    }
}
