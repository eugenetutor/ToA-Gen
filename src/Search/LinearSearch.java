package Search;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,5,12,9,7};
        int numberToFind = 14;
        int result = linearSearch(arr, numberToFind);
        System.out.println(result);
    }

    private static int linearSearch(int[] arr, int numberToFind) {
        for (int i = 0; i < arr.length; i++) {
            if(numberToFind == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
