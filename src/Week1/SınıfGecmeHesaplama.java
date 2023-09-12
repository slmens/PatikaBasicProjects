package Week1;
import java.util.Scanner;
import java.util.TreeMap;


public class SınıfGecmeHesaplama {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        double total = 0,average;
        int mat,turkce,fizik,kimya,muzik,count = 0;
        int[] intArray = new int[5];

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        intArray[0] = muzik;

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        intArray[1] = fizik;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        intArray[2] = mat;

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        intArray[3] = turkce;

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        intArray[4] = kimya;

        System.out.print("Hemen hesaplıyorum...");

        Thread.sleep(2000);

        System.out.println(intArray[0]);
        for (int i = 0;i<intArray.length;i++){
            if (isBetween(intArray[i],0,100)){
                System.out.println(i);
                total = total + intArray[i];
                count++;

            }
        }

        average = total/count;

        String isPass = average>=55?"geçtiniz":"kaldınız";

        System.out.println(String.format("Ortalamanız: %s ",average) + isPass);



    }

    public static boolean isBetween(int value, int min, int max) {
        return ((value >= min) && (value <= max));
    }
}
