package Week1;
import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        double hesaplanacakTutar,kdvDahilFiyat = 0,KDVTutari = 0,KDV = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen KDV'sini hesaplamak istediğiniz tutarı giriniz: ");
        hesaplanacakTutar = input.nextDouble();

        if (hesaplanacakTutar <= 1000){
            KDV = 0.18;
            
            KDVTutari = hesaplanacakTutar * KDV;

            kdvDahilFiyat = hesaplanacakTutar + KDVTutari;
            
        }else if (hesaplanacakTutar > 1000){
            KDV = 0.08;
            
            KDVTutari = hesaplanacakTutar * KDV;
            
            kdvDahilFiyat = hesaplanacakTutar + KDVTutari;
        }

        System.out.println(String.format("KDV oranınız: %1$s",KDV));
        System.out.println(String.format("KDV'siz tutar: %1$s",hesaplanacakTutar));
        System.out.println(String.format("KDV Dahil Fiyat: %1$s",kdvDahilFiyat));
        System.out.println(String.format("KDV tutarı: %1$s",KDVTutari));

    }
}
