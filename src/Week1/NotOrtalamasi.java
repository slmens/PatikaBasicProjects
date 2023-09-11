package Week1;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) throws InterruptedException {
        int matematik,fizik,tarih,turkce,kimya,muzik,sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        System.out.println("Teşekkür ederim. Puanınız hesaplanıyor lütfen bekleyiniz...");
        sonuc = (matematik + fizik + tarih + turkce + kimya + muzik) / 6;
        String sonucYazisi = String.format("Not ortalamanız : %1$s", sonuc);

        Thread.sleep(2000);


        System.out.print(sonucYazisi);



    }
}
