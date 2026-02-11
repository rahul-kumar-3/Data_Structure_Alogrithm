package recursionproblems;

public class Check3DigitNumberArmstrong {
    public static void main(String[] args) {
        int n = 152;
        if(isArmstrong(n))
            System.out.println(n+" is Armstrong Number.");
        else
            System.out.println(n+" is not Armstrong Number");
    }
    static boolean isArmstrong(int n){
        return n == sumOfCubeOfDigit(n);
    }
    static int sumOfCubeOfDigit(int num){
        if(num == 0) return 0;
        int d = num%10;
        return (d*d*d)+sumOfCubeOfDigit(num/10);
    }
}
