/*Write a java program to calculate sum of first N natural number.*/
package recursionproblems;

public class SumOfFirstNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Sum : "+getSumOf(5));
    }
    public static int getSumOf(int n){
        if(n == 0) return 0;

        return n+getSumOf(n-1);
    }
}
