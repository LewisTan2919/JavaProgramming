package Sort;

public class InsertionSort {

    /**
     * keep left as ascending order, and when iterate a value, find the correct place to insert
     * iterate from right to left to see which place is good
     * Time Complexity:
     * avg O(n^2)
     * worst O(n^2)
     * Best O(n)
     *
     **/
    public static void sort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int cur=i;
            for(int j=i-1;j>=0;j--){
                if(arr[cur]<arr[j]){
                    ArrayUtil.swap(arr, cur, j);
                    cur=j;
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
