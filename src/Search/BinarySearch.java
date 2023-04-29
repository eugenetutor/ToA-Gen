package Search;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int numberToFind = 6;
        int result = binarySearch(arr, numberToFind);
        System.out.println(result);
    }

    private static int binarySearch(int[] arr, int numberToFind){
        int low = 0;
        int high = arr.length - 1;

        while (low<=high){
            int middlePosition = (low+high)/2;
            int middleNumber = arr[middlePosition];

            if(numberToFind == middlePosition){
                return middlePosition;
            }
            if(numberToFind < middleNumber){
                high = middlePosition - 1;
            }else{
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}
