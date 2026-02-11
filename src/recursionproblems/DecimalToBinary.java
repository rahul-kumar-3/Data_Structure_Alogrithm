package recursionproblems;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(dectToBin(13));
    }
    static String dectToBin(int n){
        if(n == 0) return "";

        return dectToBin(n/2)+n%2;
    }
}
