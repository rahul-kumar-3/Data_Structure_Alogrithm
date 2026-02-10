/*Write a java program to calculate Factorial of number.*/

package recursionproblems;

public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println(calculateFact(5));
    }
    public static int calculateFact(int n){
        if(n == 1) return 1;
        return n * calculateFact(n-1);
    }
}
