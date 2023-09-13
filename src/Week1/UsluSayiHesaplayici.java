package Week1;
import java.util.Scanner;

public class UsluSayiHesaplayici {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int s,ust;
        long total = 1;

        System.out.print("Üstünün alınmasını istediğiniz sayıyı giriniz: ");
        s = input.nextInt();
        System.out.print("Üst sayısını giriniz: ");
        ust = input.nextInt();

        System.out.println("Teşekkürler hemen hesaplıyorum...");
        Thread.sleep(2000);

        for (int i = 1; i<=ust;i++){
            total *= s;
        }

        System.out.println(String.format("%s sayısının %d üssü: ",s,ust)+total);


    }
}
