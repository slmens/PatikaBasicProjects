package Week1;
import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int degree;

        System.out.print("Hava Sıcaklığını Giriniz: ");
        degree = input.nextInt();


        // saçma derecede uç noktalardaki sıcaklıkları girerek mantıksız cevaplar vermesin diye bunu koydum
        // hava sıcaklığını 100 derece girerse ona yüzmeye gitmeyi önermek saçma
        if ((degree >= -50)&&(degree < 55)){
            if (degree <= 5) {
                System.out.println("Kayak yapabilirsiniz.");
            }
            else if (degree < 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            else if (degree < 25) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
            else{
                System.out.println("Yüzmeye gidebilirsiniz.");
            }
        }else {
            System.out.println("Lütfen makul sıcaklıklar giriniz...");
        }
    }
}
