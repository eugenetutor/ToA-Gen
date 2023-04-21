public class MergeSort {
    public static void main(String[] args){
        int[] arr = {3,4,6,1,5,12,9,7};
        int[] result = mergeSort(arr,0,arr.length-1);
        outputResult(result);
    }

    private static int[] mergeSort(int[] arr, int left, int right) {
        if(left<right){
            int m = (left+right)/2;

            mergeSort(arr, left, m);
            mergeSort(arr, m+1,right);

            merge(arr, left, m, right);
        }
        return arr;
    }

    private static void merge(int[] arr, int left, int m, int right) {
        int n1 = m - left + 1;
        int n2 = right - m;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];


        for(int i = 0; i<n1; i++){
            leftArray[i] = arr[left + i];
        }
        for(int j = 0; j<n2; j++){
            rightArray[j] = arr[m + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = left;


        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k]  = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }


    static void outputResult(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

