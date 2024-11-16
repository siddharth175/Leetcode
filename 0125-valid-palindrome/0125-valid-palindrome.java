import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reverse);
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
    }
    
}