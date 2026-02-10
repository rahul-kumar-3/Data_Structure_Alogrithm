/*Write a java program to calculate sum of array element*/
package recursionproblems;

public class SumOfArrayElement {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        System.out.println(getSum(ar));
    }
    public static int getSum(int[] ar){
        return getSum(ar, 0);
    }
    private static int getSum(int[] ar, int i){
        if(i == ar.length-1) return ar[i];

        return ar[i] + getSum(ar, i+1);
    }
}
