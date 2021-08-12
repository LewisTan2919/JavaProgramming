package Sort;

import java.util.Random;

public class ArrayUtil {

    public static void printArray(int[]arr){
        System.out.println("\n\n\nPrint Array below:");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }


    public static void swap(int[]arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

    }

    public static int[]subArray(int[]arr,int left,int right){
        int[]res=new int[right-left+1];
        for(int i=0;i<res.length;i++){
            res[i]=arr[i+left];
        }
        return res;
    }

    public static int[] generateRandomArray(){
        Random random=new Random();
        int length=1+random.nextInt(500);
        int[]array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=random.nextInt(1000);
        }
        return array;
    }

    public static boolean checkArrayIsNonDescending(int[]arr){
        if(arr.length<1){
            return  true;
        }
        int pre=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<pre){
                return false;
            }
            pre=arr[i];
        }
        return true;
    }

}
