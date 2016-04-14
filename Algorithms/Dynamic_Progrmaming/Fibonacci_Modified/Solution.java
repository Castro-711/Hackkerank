import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        long A = input.nextLong();
        BigInteger AA = new BigInteger(A + "");
        long B = input.nextLong();
        BigInteger BB = new BigInteger(B + "");
        int N = input.nextInt();
        
        BigInteger next = new BigInteger("10");
        next = BB.multiply(BB).add(AA);
        int count = 3;
        
        while(count < N)
        {
            AA = BB;
            BB = next;
            next = (BB.multiply(BB).add(AA));
            
            count++;
        } // while
        
        System.out.println(next);
    } // main
}
