/*Write a java program to print N to 1*/
package recursionproblems;

public class PrintNToOne {
    public static void main(String[] args) {
        printNumNToOne(10);
    }

    static void printNumNToOne(int n){
        if(n == 0) return;
        // Forword tracking
        System.out.print(n+" ");
        printNumNToOne(n-1);
    }
}
