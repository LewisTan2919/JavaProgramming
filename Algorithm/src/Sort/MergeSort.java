package Sort;

public class MergeSort {

    /**
     * Divide the arr into two part, sort each, then merge
     * Time Complexity:
     * avg O(n*logn)
     * worst O(n*logn)
     * Best O(n*logn)
     *
     * Space Complexity:
     * O(n)
     * */
    public static void sort(int[]arr){
        divide(arr,0,arr.length-1);
    }

    public static void merge(int[]arr,int l1,int r1,int l2,int r2){
        int[] leftArr=ArrayUtil.subArray(arr, l1, r1);
        int[] rightArr=ArrayUtil.subArray(arr,l2 , r2);

        int lCur=0,rCur=0;
        int start=l1;
        while(lCur<leftArr.length||rCur<rightArr.length){
            if(lCur>=leftArr.length){
                arr[start++]=rightArr[rCur++];
            }else if(rCur>=rightArr.length){
                arr[start++]=leftArr[lCur++];
            }else{
                if(leftArr[lCur]<rightArr[rCur]){
                    arr[start++]=leftArr[lCur++];
                }else{
                    arr[start++]=rightArr[rCur++];
                }
            }
        }
    }

    public static void divide(int[]arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        divide(arr,l,mid);
        divide(arr,mid+1,r);
        merge(arr,l,mid,mid+1,r);
    }

    public static void main(String[] args) {
        int[] arr=ArrayUtil.generateRandomArray();
        ArrayUtil.printArray(arr);
        sort(arr);
        ArrayUtil.printArray(arr);
        System.out.println("\n The Array is Sorted:"+ArrayUtil.checkArrayIsNonDescending(arr));
    }
}
