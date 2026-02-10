/*Write a java program to calculate digit sum of a number.*/

package recursionproblems;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Digit sum : "+calculateDigitSum(456));
    }
    public static int calculateDigitSum(int n){
        if(n >= -9 && n <= 9) return n;

        return (n%10)+calculateDigitSum(n/10);
    }
}
