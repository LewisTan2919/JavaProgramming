package Sort;

public class SelectionSort {

    /**
     * keep left as ordered ascending array, then get the most min value from right, and swap
     * then left go left
     * Time Complexity:
     * avg: O(n^2)
     * worst O(n^2)
     *
     * */
    public static void  sort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    ArrayUtil.swap(arr, i, j);
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
