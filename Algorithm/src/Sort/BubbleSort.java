package Sort;



public class BubbleSort {

    /**
     * at most swap neighbor n time, make larger value to the next
     * Time Complexity:
     * avg: O(n^2)
     * worst O(n^2)
     *
    * */
    public static void sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j]<arr[j-1]){
                    ArrayUtil.swap(arr, j, j-1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr=ArrayUtil.generateRandomArray();
        ArrayUtil.printArray(arr);
        sort(arr);
        ArrayUtil.printArray(arr);
        System.out.println("\n The Array is Sorted:"+ArrayUtil.checkArrayIsNonDescending(arr));
    }
}
