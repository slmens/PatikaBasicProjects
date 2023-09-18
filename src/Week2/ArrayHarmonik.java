package Week2;

public class ArrayHarmonik {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,432,32,53,67,12,34,56,43,766,34,1,342,5324,75,4324,544,85,84,7,4}; // Harmonik değeri bulunacak sayılar
        double[] harmonikNumbers = new double[numbers.length]; // Sayıların harmonik değerleri

        double average = 0;
        double total = 0;


        // Alttaki döngüde sayıların harmonik değerini alıp topluyoruz

        for (int i = 0; i < numbers.length; i++){
            total += (double) 1 /numbers[i];
        }

        // Eleman sayısını toplanmış değere bölüyoruz ve ortalama çıkıyor
        average = harmonikNumbers.length/total;

        System.out.println("Bu sayıların harmonik ortalaması: " + average);
    }
}

