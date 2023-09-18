package Week2;
import java.util.Arrays;
import java.util.Scanner;

public class Closest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = { 143, 142, -334, 15, 65, -46, 28, 833, -19 };

        int number;

        System.out.print("Bir sayı giriniz: ");
        number = scan.nextInt();

        Arrays.sort(arr);

        System.out.println(findClosest(arr, arr.length, number));

    }

    public static int findClosest(int[] arr, int n,int target)
    {
        int left = 0, right = n - 1;
        while (left < right) {
            if (Math.abs(arr[left] - target) <= Math.abs(arr[right] - target)) {
                right--;
            }
            else {
                left++;
            }
        }
        return arr[left];
    }
}
