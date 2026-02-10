/*Write a java program to print name n times*/
package recursionproblems;

public class PrintNameNTimes {
    public static void main(String[] args) {
        printName(5);
    }
    public static void printName(int n){
        if(n == 0) return;

        System.out.println("Rahul Kumar");
        printName(n-1);
    }
}
