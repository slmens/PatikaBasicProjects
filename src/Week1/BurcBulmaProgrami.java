package Week1;
import java.util.Scanner;
public class BurcBulmaProgrami {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int month,day;

        System.out.println("Burcunuzu öğrenmek için lütfen istenen değerleri giriniz...");
        System.out.print("Hangi ay doğduğunuzu (1 => Ocak, 3 => Mart) giriniz: ");
        month = input.nextInt();
        System.out.print("Ayın kaçıncı günü doğdunuzu giriniz: ");
        day = input.nextInt();

        System.out.println("Hemen hesaplıyorum...");

        Thread.sleep(2000);

        if (month == 1){
            if (day >= 22){
                System.out.println("Siz kova burcusunuz...");
            }else {
                System.out.println("Siz oğlak burcusunuz...");
            }
        }else if (month == 2){
            if (day >= 20){
                System.out.println("Siz balık burcusunuz...");
            }else {
                System.out.println("Siz kova burcusunuz...");
            }
        }else if (month == 3){
            if (day >= 21){
                System.out.println("Siz koç burcusunuz...");
            }else {
                System.out.println("Siz balık burcusunuz...");
            }
        } else if (month == 4) {
            if (day >= 21){
                System.out.println("Siz boğa burcusunuz...");
            }else {
                System.out.println("Siz koç burcusunuz...");
            }
        } else if (month == 5) {
            if (day >= 22){
                System.out.println("Siz ikizler burcusunuz...");
            }else {
                System.out.println("Siz boğa burcusunuz...");
            }
        } else if (month == 6) {
            if (day >= 23){
                System.out.println("Siz yengeç burcusunuz...");
            }else {
                System.out.println("Siz ikizler burcusunuz...");
            }
        } else if (month == 7) {
            if (day >= 23){
                System.out.println("Siz aslan burcusunuz...");
            }else {
                System.out.println("Siz yengeç burcusunuz...");
            }
        } else if (month == 8) {
            if (day >= 23){
                System.out.println("Siz başak burcusunuz...");
            }else {
                System.out.println("Siz aslan burcusunuz...");
            }
        } else if (month == 9) {
            if (day >= 23){
                System.out.println("Siz terazi burcusunuz...");
            }else {
                System.out.println("Siz başak burcusunuz...");
            }
        } else if (month == 10) {
            if (day >= 23){
                System.out.println("Siz akrep burcusunuz...");
            }else {
                System.out.println("Siz terazi burcusunuz...");
            }
        } else if (month == 11) {
            if (day >= 22){
                System.out.println("Siz yay burcusunuz...");
            }else {
                System.out.println("Siz akrep burcusunuz...");
            }
        } else if (month == 12) {
            if (day >= 22){
                System.out.println("Siz oğlak burcusunuz...");
            }else {
                System.out.println("Siz yay burcusunuz...");
            }
        }
    }
}
