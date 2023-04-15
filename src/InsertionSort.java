public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {1,5,12,9,7};
        int[] result = insertionSort(arr);
        outputResult(result);
    }

    static int[] insertionSort(int[] arr){
        int size = arr.length;

        for(int step = 1; step < size; step++){
            int key = arr[step];
            int j  = step-1;
            while (j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    static void outputResult(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
