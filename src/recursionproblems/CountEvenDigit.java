package recursionproblems;

public class CountEvenDigit {
    public static void main(String[] args) {
        System.out.println(countEvenDigit(65432));
    }
    public static int countEvenDigit(int n){
        if(n >= -9 && n <= 9) return n % 2 == 0 ? 1 : 0;

        return ((n%10)%2 == 0 ? 1 : 0)+countEvenDigit(n/10);
    }
}
