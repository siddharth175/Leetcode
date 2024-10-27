import java.math.BigInteger;

public class Solution {
    public static String addBinary(String a, String b) {
        
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        
        BigInteger sum = num1.add(num2);

        
        return sum.toString(2);
    }

    public static void main(String[] args) {
        
        System.out.println(addBinary("11", "1"));    
        System.out.println(addBinary("1010", "1011")); 
        
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", 
                                     "110101101001101111001111000011111110111001110001011111111100101011000111000111101100000001001"));
    }
}
