package Week1;
import java.util.ArrayList;
import java.util.Scanner;

public class KatBulucu {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int limit,counter = 0;

        System.out.print("Lütfen bir sayı giriniz. Girdiğiniz sayıya kadar olan 4 ve 5 in kuvvetlerini bulucam: ");
        limit = input.nextInt();
        System.out.println("Hemen hesaplıyorum...");

        Thread.sleep(2000);

        // ArrayListleri oluşturdum
        ArrayList<String> dordunKuvvetleri = new ArrayList<String>();
        ArrayList<String> besinKuvvetleri = new ArrayList<String>();

        // Burda 4'ün kuvvetlerini arrayine yazıyoruz.
        for (int i = 1;i < limit; i*=4){
            dordunKuvvetleri.add(counter, String.valueOf(i));

            counter++;
        }

        counter = 0;

        // Burda 5'in kuvvetlerini bulup yerine yazıyoruz ama üsttekinden daha farklı bir yol denedim ve o yolla buldum

        for (double j = 0; j < limit; j++){
            double result = Math.pow(5,j);
            if (result < limit){
                besinKuvvetleri.add(counter, String.valueOf((int)result));
            }else {
                break;
            }
            counter++;
        }

        // Burda 4'ün kuvvetleri arrayini okuyup yazdırıyoruz
        System.out.println("Vermiş olduğunuz sayıya kadar olan 4'ün kuvvetleri: ");
        Thread.sleep(2000);
        for (int i = 1; i < dordunKuvvetleri.size(); i++){
            System.out.print(dordunKuvvetleri.get(i) +" ");
        }

        // boşluk bırakması için
        System.out.println();

        // Burda 5'in kuvvetleri arrayini okuyup yazdırıyoruz

        System.out.println("Vermiş olduğunuz sayıya kadar olan 5'in kuvvetleri: ");
        Thread.sleep(2000);
        for (int i = 1; i < besinKuvvetleri.size(); i++){
            System.out.print(besinKuvvetleri.get(i) +" ");
        }
    }
}
