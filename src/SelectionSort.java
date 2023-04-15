
public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {1,5,12,9,7};
        int[] result = selectionSort(arr);
        outputResult(result);

        String[] arrayString = {"Bob", "Alex", "Michael", "Nick"};
        String[] resultString = selectionSort(arrayString);
        outputResult(resultString);
    }

    //selection sorting algorithm
    static int[] selectionSort(int[] arr){
        int size = arr.length;

        for(int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i] < arr[min_idx]) {
                    min_idx = i;
                }
            }

            int temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }

        return arr;
    }

    static String[] selectionSort(String[] arr){
        int size = arr.length;

        for(int step = 0; step < size - 1; step++) {
            int min_idx = step;
            for (int i = step+1; i < size; i++) {
                if (arr[i].compareTo(arr[min_idx]) < 0) {
                    min_idx = i;
                }
            }

            String temp = arr[step];
            arr[step] = arr[min_idx];
            arr[min_idx] = temp;
        }

        return arr;
    }

    // function for displaying a message about the result
    static void outputResult(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void outputResult(String[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
