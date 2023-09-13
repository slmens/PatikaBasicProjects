package Week1;
import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamakSayisi,counter = 0;


        System.out.print("Yapmak istediğiniz yıldızın kaç basamaklı olacağını giriniz: ");
        basamakSayisi = input.nextInt();

        for (int i = 0; i <= basamakSayisi ; i++) {

            for (int j = 0; j < (basamakSayisi - i); j++) {
                System.out.print(" ");
            }
            // ilk üçgenin sonuna geldiğimizde burası devreye giricek ve son basamağı yazmasını engelleyip son basamağı kendisi yazıp başlayacak
            // böylelikle iki tane aynı sayıda satırın arka arkaya olmasını engellemiş olucaz
            if (counter == basamakSayisi){
                for (int t = basamakSayisi; t >= 0 ; t--) {
                    for (int j = 0; j < (basamakSayisi - t); j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * t + 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.exit(0);
            }
                
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");

            }
            counter++;
            System.out.println(" ");
        }
    }
}
