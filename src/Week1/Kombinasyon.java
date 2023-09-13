package Week1;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int n,r,nFaktoriyel = 1,rFaktoriyel = 1,nEksiRFaktoriyel = 1;
        double kombinasyon;

        System.out.print("N (eleman sayısı) sayısını veriniz: ");
        n = input.nextInt();
        System.out.print("R (oluşturulacak grupların sayısı) sayısını veriniz: ");
        r = input.nextInt();

        System.out.println("Teşekkürler hemen hesaplıyorum...");
        Thread.sleep(2000);

        // n sayısının faktöriyelini buluyoruz
        for (int i = 1; i<=n;i++){
            nFaktoriyel = nFaktoriyel * i;
        }

        // r sayısının faktöriyelini buluyoruz
        for (int i = 1; i<=r ;i++){
            rFaktoriyel = rFaktoriyel * i;
        }

        // n-r sayısının faktöriyelini buluyoruz
        for (int i = 1; i<=n-r ;i++){
            nEksiRFaktoriyel = nEksiRFaktoriyel * i;
        }


        kombinasyon = (double) nFaktoriyel / (rFaktoriyel * (nEksiRFaktoriyel));

        System.out.println("C(4,5) = "+ (int)kombinasyon);



        System.out.println();


    }
}
