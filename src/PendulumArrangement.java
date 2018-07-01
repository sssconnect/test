import java.util.Scanner;

public class PendulumArrangement {

    public static void main(String args[]) {
        PendulumArrangement penduArrg = new PendulumArrangement();
        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();
        while (testCase-- > 0) {
            int arr_size = scn.nextInt();
            int arr[] = new int[arr_size];
            for (int i = 0; i < arr_size; i++) {
                arr[i] = scn.nextInt();
            }

            penduArrg.arrange(arr,arr_size);
        }
    }

    private void arrange(int[] arr, int arr_size) {
        for (int i = 0 ; i < arr_size ; i++){
            for (int j = i+1 ; j < arr_size ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int index = (arr_size-1)/2,j = 1,k=1;
        int arrange_arr[] = new int[arr_size];
        arrange_arr[index] = arr[0];
        for ( k = 1 ; k <= index ; k++){
            arrange_arr[index+k] = arr[j++];
            arrange_arr[index-k] = arr[j++];
        }
        if (arr_size%2 == 0)
            arrange_arr[index+k] = arr[j];
        for (int l = 0 ; l < arr_size ; l++){
            System.out.print(arrange_arr[l]+ " ");
        }
    }

}