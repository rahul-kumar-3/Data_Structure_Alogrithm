package recursionproblems;

public class ReveseNumber {
    public static void main(String[] args) {
        System.out.println("Revesed number is "+reverseNumber(98765));
    }
    public static int reverseNumber(int num){
        return reverseNumber(num, 0);
    }
    private static int reverseNumber(int num, int rev){
        if(num == 0) return rev;

        return reverseNumber(num/10, rev*10+num%10);
    }
}
