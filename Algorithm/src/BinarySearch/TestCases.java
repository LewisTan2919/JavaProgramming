package BinarySearch;

public class TestCases {
    public static void main(String[] args) {
        int[] a=new int[]{-1, 0, 0, 3, 3, 3, 7, 8, 9};

        System.out.println("the left most value = 3 which actual index is : "+BinarySearchImpl.getEqualValueLeftMostIndex(a,3)+ " Expect Value: 3");
        System.out.println("the right most value = 3 which actual index is : "+BinarySearchImpl.getEqualValueRightMostIndex(a,3)+ " Expect Value: 5");
        System.out.println("the right most value < 3 which actual index is : "+BinarySearchImpl.getLessValueRightMostIndex(a,3)+ " Expect Value: 2");
        System.out.println("the left most value > 3 which actual index is : "+BinarySearchImpl.getLargerValueLeftMostIndex(a,3)+ " Expect Value: 6");
    }
}
