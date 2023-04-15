public class QuickSort {
    public static void main(String[] args){
        int[] arr = {1,5,12,9,7};
        int[] result = quickSort(arr,0,arr.length-1);
        outputResult(result);
    }

    static int[] quickSort(int[] arr, int start, int end){
        if(start<end){
            int pi = partition(arr,start,end);
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }
        return arr;
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i =(start-1);

        for(int j = start; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]  = arr[end];
        arr[end] = temp;

        return (i+1);
    }


    static void outputResult(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
