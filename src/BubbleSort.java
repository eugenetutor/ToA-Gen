public class BubbleSort{
    public static void main(String[] args){
        int[] arr = {1,5,12,9,7};
        int[] result = bubbleSort(arr);
        outputResult(result);

        String[] arrString = {"Bob", "Nick", "Michael", "Oleg", "Alex"};
        String[] strResult = bubbleSort(arrString);
        outputResult(strResult);


    }

    //bubble sorting algorithm
    static int[] bubbleSort(int[] arr){
        int size = arr.length;

        for(int step = 0; step < size - 1; step++) {

            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        return arr;
    }

    static String[] bubbleSort(String[] arr){
        int size = arr.length;

        for(int step = 0; step < size - 1; step++) {

            for (int i = 0; i < size - step - 1; i++) {
                if (arr[i].compareTo(arr[i + 1])<0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
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
