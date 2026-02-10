/*Write a java program to check string is palinrome or not*/
package recursionproblems;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        if(isPalindrome(str))
            System.out.println(str+" is palindrome.");
        else
            System.out.println(str+" is not palindrome.");
    }

    public static boolean isPalindrome(String str){
        return isPalindrome(str, 0, str.length()-1);
    }

    private static boolean isPalindrome(String s, int low, int high){
        if(low > high) return true;

        if(s.charAt(low) != s.charAt(high))
            return false;

        return isPalindrome(s, low+1, high-1);
    }
}
