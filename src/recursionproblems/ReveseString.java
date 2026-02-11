package recursionproblems;

public class ReveseString {
    public static void main(String[] args) {
        System.out.println("Reversed String : "+reverse("Rahul"));
    }
    public static String reverse(String s){
        return reverse(s, 0);
    }
    private static String reverse(String s, int i){
        if( i == s.length()) return "";

        return reverse(s, i+1)+s.charAt(i);
    }
}
