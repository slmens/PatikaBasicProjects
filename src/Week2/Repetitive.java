package Week2;

public class Repetitive {
    public static void main(String[] args) {
        int[] arr = {3,4,7,51,86,4,87,23,6,3,5,8,2,4,1,792,3,5,7,2,37,3,4,6,89};
        int[] duplicate = new int[arr.length];
        int counter = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if ((i != j) && (arr[i] == arr[j])){
                    if (isEven(arr[i])){
                        if (hasFind(duplicate,arr[i])){
                            duplicate[counter++] = arr[i];
                        }
                    }
                    break;
                }
            }
        }

        for (int k:duplicate){
            if (k != 0){
                System.out.print(k + " ");
            }
        }
    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean hasFind(int[] arr, int k){
        for (int i:arr){
            if (i == k){
                return false;
            }

        }
        return true;
    }
}
