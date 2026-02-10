/*Write a java program to count how many digit present in the number.*/
package recursionproblems;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("Tota digit count : "+digitCount(5670));
    }
    public static int digitCount(int n){
        if(n >= -9 && n <= 9) return 1;

        return 1+digitCount(n/10);
    }
}
