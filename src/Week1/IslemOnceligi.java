package Week1;
import java.util.Scanner;
public class IslemOnceligi {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int a,b,c,total;

        System.out.println("Yapılacak işlem a+b*c-b");
        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();
        System.out.print("B sayısını giriniz: ");
        b = input.nextInt();
        System.out.print("C sayısını giriniz: ");
        c = input.nextInt();

        System.out.println("Teşekkürler hemen hesaplıyorum");
        Thread.sleep(2000);

        total = a + b * c - b;

        System.out.println(String.format("İşlem sonucu: %s",total));
    }
}
