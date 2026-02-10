package recursionproblems;

public class CalculatePower {
    public static void main(String[] args) {
        System.out.println("2^3 is : "+getPow(2,3));
    }
    public static int getPow(int n, int p){
        if(p == 0) return 1;

        return n * getPow(n, p-1);
    }
}
