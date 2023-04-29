import java.util.Arrays;

public class HomeTask2804 {
    public static void main(String[] args) {
        String[] arr = {"яблуко", "банан", "груша", "апельсин", "ківі"};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static String[] mergeSort(String[] arr) {
        int inputLength = arr.length;
        if(inputLength > 1){
            int middle = inputLength / 2;
            String[] leftHalf = Arrays.copyOfRange(arr, 0, middle);
            String[] rightHalf = Arrays.copyOfRange(arr, middle, inputLength);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            //Merge
            merge(arr, leftHalf, rightHalf);
        }

        return arr;
    }

    private static void merge(String[] arr, String[] leftHalf, String[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i<leftSize && j < rightSize){
            if(leftHalf[i].length() <= rightHalf[j].length()){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<rightSize){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }




}
