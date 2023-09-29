package Week5;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        try {
            System.out.print("Kontrol etmek istediğiniz index değerini giriniz: ");
            int indeks = scan.nextInt();
            int number = numberByIndex(arr,indeks);
            System.out.println("Girdiğiniz indexteki sayı: " + number);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Lütfen 0 ila 9 arası bir index değeri giriniz!");
        }
    }

    public static int numberByIndex(int[] arr, int index){

        return arr[index];
    }
}
