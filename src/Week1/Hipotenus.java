package Week1;
import java.util.Scanner;
// iki dik kenarı al hipotenüsü bul
// bunları kullanarak alanı bul
public class Hipotenus {
    public static void main(String[] args) {
        double alan,c,a,b;

        Scanner input = new Scanner(System.in);

        System.out.println("Alan Hesaplayıcıya Hoşgeldiniz...");
        System.out.println("Lütfen alanının hesaplanmasını istediğiniz dik üçgenin iki dik kenar uzunluğunu veriniz...");
        System.out.print("Birinci dik kenar: ");
        a = input.nextDouble();
        System.out.print("İkinci dik kenar: ");
        b = input.nextDouble();

        c = Math.pow(a,2) + Math.pow(b,2);

        double hipotenus = Math.sqrt(c);

        double u = (a+b+hipotenus)/2;

        double alanKare = u*(u-a)*(u-b)*(u-hipotenus);
        alan = Math.sqrt(alanKare);

        System.out.println("Üçgeninizin alanı: " + alan);
    }

}
