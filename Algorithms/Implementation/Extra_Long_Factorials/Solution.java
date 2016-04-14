import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        BigInteger bigInt = new BigInteger("1");
        
        int n = input.nextInt();
        
        BigInteger bigN = new BigInteger("1");
        
        while(n > 0)
        {
            bigInt = bigInt.multiply(BigInteger.valueOf(n));
            n--;
        } // while
        
        System.out.println(bigInt);
            
    } // main
} // {}
