package recursionproblems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,4,5,6,7};
        if(binarySearch(ar, 6) != -1)
            System.out.println("present at - "+binarySearch(ar, 6));
        else
            System.out.println("Element is not present");
    }

    static int binarySearch(int[] ar , int ele){
        return binarySearch(ar, ele, 0, ar.length-1);
    }
    private static int binarySearch(int[] ar, int ele, int low, int high){
        if(low >= high) return -1;
        int mid = low+(high-low)/2;

        if(ar[mid] == ele)
            return mid;
        else if(ar[mid] > ele){
            return binarySearch(ar, ele, low, mid-1);
        }

            return binarySearch(ar, ele, mid+1, high);

    }
}
