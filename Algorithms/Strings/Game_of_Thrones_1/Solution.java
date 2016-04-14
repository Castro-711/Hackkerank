import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                  
        String original = input.nextLine();
        String ans = "NO";
        
        // declare and initialize so char arrays 
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] string = original.toCharArray();
        
        boolean isPalindrome = true; 
        int oddCount = 0;
        
        for(int row = 0; row < alphabet.length; row++)
        {
            int count = 0;
            
            for(int col = 0; col < original.length(); col++)
            {
                if(alphabet[row] == string[col])
                    count++;
            } // col
            
            if(count % 2 != 0) // check count and increment oddCount
                oddCount++;
            
            if(oddCount > 1) // check oddCount and set bool
            {
                isPalindrome = false;
                System.out.println(ans);
                break;
            } // oddCount > 1
            
        } // row
        
        if(isPalindrome)
        {
            ans = "YES";
            System.out.println(ans);
        }
        
        input.close();
    }
}

