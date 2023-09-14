package Week1;
import java.util.Scanner;
import java.util.TreeMap;

public class EbobEkok {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int x,y,EBOB = 0,EKOK;

        System.out.println("EBOK ve EKOK'unu öğrenmek istediğiniz iki sayıyı giriniz...");
        System.out.print("Sayı bir: ");
        x = input.nextInt();
        System.out.print("Sayı iki: ");
        y = input.nextInt();

        System.out.println("Teşekkürler hemen hesaplıyorum...");
        Thread.sleep(2000);

        // Hangi sayı daha küçükçe onu baz alacağım için küçük sayıyı buluyorum

        int min = Math.min(x, y);
        int max = Math.max(x,y);

        int i = 1;
        while (i <= min){
            if ((x % i == 0) && y % i == 0){
                EBOB = i;
            }
            i++;
        }
        // EKOK formülünden EKOK'u buluyorum
        EKOK= (x*y)/EBOB;

        System.out.println(String.format("Vermiş olduğunuz sayıların EBOB'u %s, EKOK'u %d",EBOB,EKOK));






    }
}
