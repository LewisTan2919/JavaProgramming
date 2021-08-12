package Sort;

public class QuickSort {

    public static void sort(int[]arr){
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[]arr,int left,int right){
        if(left>=right){
            return;
        }

        int pivotIndex=partition(arr,left,right);
        quickSort(arr,left,pivotIndex-1);
        quickSort(arr, pivotIndex+1, right);
    }

    public static int partition(int[]arr,int left,int right){
        int pivotVal=arr[right];

        // two pointers, divide the array on the left of pivotValue, then find a right place for pivotVal to insert
        int smallerThanPivotIndex=left-1;
        for(int i=left;i<right;i++){
            if(arr[i]<pivotVal){
                smallerThanPivotIndex++;
                ArrayUtil.swap(arr,smallerThanPivotIndex,i);
            }
        }

        //find the right place
        int pivotIndex=smallerThanPivotIndex+1;
        ArrayUtil.swap(arr, pivotIndex, right);
        return pivotIndex;
    }


    public static void main(String[] args) {
        int[] arr=ArrayUtil.generateRandomArray();
        ArrayUtil.printArray(arr);
        sort(arr);
        ArrayUtil.printArray(arr);
        System.out.println("\n The Array is Sorted:"+ArrayUtil.checkArrayIsNonDescending(arr));
    }
}
