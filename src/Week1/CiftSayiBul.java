package Week1;
import java.util.Scanner;

public class CiftSayiBul {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int number,counter = 0;

        // programa 1000000 gibi bir sayı girince total değişkeninin int olması hata vereceği için long yaptım
        long total = 0,average;

        System.out.print("Lütfen üst sınırı belirleyecek sayıyı giriniz: ");
        number = input.nextInt();

        System.out.println("Hemen hesaplıyorum...");
        Thread.sleep(2000);

        for (int i = 0;i<number;i++){
            if ((i % 3 == 0) && i % 4 == 0){
                counter++;
                total += i;
            }
        }
        average = total/counter;
        System.out.println("Girdiğini sayıya kadar olan sayılar arasından 3'e ve 4'e tam bölünen sayıların toplamının ortalaması: " + average);
    }
}
