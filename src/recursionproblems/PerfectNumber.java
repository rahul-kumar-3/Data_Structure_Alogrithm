/*Write a java program to check number is perfect number or not*/
package recursionproblems;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        String res = (n == sumOfFactors(n))?"Perfect Number":"Not Perfect Number";
        System.out.println(n+" "+res);
    }
    public static int sumOfFactors(int n){
        return sumOfFactors(n, 1);
    }
    private static int sumOfFactors(int n, int d){
        if(d > n/2) return 0;

        return ((n%d == 0) ? d : 0)+(sumOfFactors(n, d+1));
    }
}
