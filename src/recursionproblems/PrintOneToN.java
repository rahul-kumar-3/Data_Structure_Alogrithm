/*Write a java program to print number 1 to N*/

package recursionproblems;

public class PrintOneToN {
    public static void main(String[] args) {
        printOneToN(10);
    }
    static void printOneToN(int n){
        if(n == 0) return;
        printOneToN(n-1);
        System.out.print(n+" ");
    }
}
