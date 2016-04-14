import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean[] checker = new boolean[26];
        Arrays.fill(checker, false);
        
        String s = input.nextLine();
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++)
        {
            int x = 0;
            
            while(x < alphabet.length)
            {
                if(alphabet[x] == s.charAt(i) && !checker[x])
                checker[x] = true;
                
                x++;
            } // while
            
        } // for
        
        boolean isPan = true;
        
        for(int i = 0; i < checker.length; i++)
            if(!checker[i])
                isPan = false;
            
        if(isPan)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    } // main        
} // Solution
