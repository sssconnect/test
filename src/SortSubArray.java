import java.util.Scanner;

public class SortSubArray {
    int[] sortSeletctedIndex(int i, int j, int arr[]) {
//        for (int k = i; k <= j; k++)
        {
            /*int l = k;
            int tl = j;
            while(l < tl)
            {
                if (arr[l] > arr[tl])
                {
                    int temp = arr[l];
                    arr[l] = arr[tl];
                    arr[tl] = temp;
                }
                l++;
                tl--;
            }*/
            while (i < j ){
                int i1 = i+1;
                int j1 = j-1;
                if (arr[i] > arr[i1]){
                    int temp1 = arr[i];
                        arr[i1] = arr[i];
                        arr[i] = temp1;
                }
                if (arr [j] < arr[j1]){
                    int temp2 = arr[j];
                        arr[j] = arr[j1];
                        arr[j1] = temp2;
                }
                i++;
                j--;
            }
        }
        return arr;


    }

    void print(int arr[]){
        for (int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {
        SortSubArray sortSubArr = new SortSubArray();
        Scanner scn = new Scanner(System.in);
        int testCae = scn.nextInt();
        while (testCae-- > 0) {
            int arrSize = scn.nextInt();
            int arr[] = new int[arrSize];

            for (int i = 0; i < arrSize; i++) {
                arr[i] = scn.nextInt();
            }
            int endingIndex = scn.nextInt();
            int startingIndex = scn.nextInt();
            if (startingIndex > endingIndex){
                int temp = startingIndex;
                startingIndex = endingIndex;
                endingIndex = temp;
            }
            arr = sortSubArr.sortSeletctedIndex(startingIndex, endingIndex, arr);

            sortSubArr.print(arr);
            System.out.println();
        }
    }
}
