import java.util.*;
class Solution {
    public  static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        } 

        String doubleString = s+s;
        return doubleString.contains(goal);
        
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();

        System.out.println(rotateString(s,goal));

    }
}