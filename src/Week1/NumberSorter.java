package Week1;
import java.util.Arrays;
import java.util.Scanner;
public class NumberSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c;
        double[] myArray = new double[3];

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        a = input.nextDouble();
        myArray[0] = a;

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        b = input.nextDouble();
        myArray[1] = b;

        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        c = input.nextDouble();
        myArray[2] = c;

        Arrays.sort(myArray);

        System.out.println("Bu sayıların küçükten büyüğe sıralanışı: "+myArray[0] + "<" + myArray[1] + "<" + myArray[2]);


    }
}
