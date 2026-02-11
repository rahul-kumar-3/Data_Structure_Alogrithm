package recursionproblems;

public class LinearSeach {
    public static void main(String[] args) {
        int[] ar = {28,35,78,88,98};
        int ele = 35;
        if(linearSearch(ar, ele) != -1)
        System.out.println(ele+" present at "+linearSearch(ar, ele));
        else
            System.out.println(ele+" not present in given array.");
    }

    static int linearSearch(int[] ar, int ele){
       return linearSearch(ar, ele, 0);
    }
    private static int linearSearch(int[] ar, int ele, int idx){
        if(idx == ar.length) return -1;



       return ar[idx] == ele ? idx : linearSearch(ar, ele, idx+1);
    }

}
