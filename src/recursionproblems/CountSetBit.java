package recursionproblems;

public class CountSetBit {
    public static void main(String[] args) {
        System.out.println(countSetBit(13));
    }
    static int countSetBit(int n){
        if(n == 0) return 0;

        return (n%2)+countSetBit(n/2);
    }
}
