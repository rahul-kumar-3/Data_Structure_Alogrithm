package recursionproblems;

public class CheckPrime {
    public static void main(String[] args) {
        if(isPrime(23))
            System.out.println("23 is prime number");
        else
            System.out.println("23 is not prime number");
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;

        return isPrime(n, 2);
    }
    private static boolean isPrime(int n, int d){
        if((d*d) > n) return true;

        if(n % d == 0) return false;

        return isPrime(n, d+1);
    }
}
