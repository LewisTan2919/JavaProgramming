package BinarySearch;

public class BinarySearchImpl {
    public static int getEqualValueLeftMostIndex(int[]a,int target){
        int left=0,right=a.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(a[mid]<target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }

    public static int getEqualValueRightMostIndex(int[]a,int target){
        int left=0,right=a.length-1;
        while(left<right){
            int mid=right-(right-left)/2;
            if(a[mid]>target){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        return left;
    }

    public static int getLessValueRightMostIndex(int[]a,int target){
        int left=0,right=a.length-1;
        while(left<right){
            int mid=right-(right-left)/2;
            if(a[mid]>=target){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        return left;
    }

    public static int getLargerValueLeftMostIndex(int[]a,int target){
        int left=0,right=a.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(a[mid]<=target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}
