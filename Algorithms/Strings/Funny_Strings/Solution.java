import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        
        while(T > 0)
        {
            String orig = input.nextLine();
            String reverse = "";
            
            for(int i = orig.length() - 1; i >= 0; i--)
                reverse = reverse + orig.charAt(i);
            
            boolean isFunny = true;
            
            for(int i = 1; i < orig.length(); i++)
            {
                int forward = Math.abs((int) orig.charAt(i) - (int) orig.charAt(i - 1));    
                int backward = Math.abs((int) reverse.charAt(i) - (int) reverse.charAt(i - 1));
                
                if(forward != backward)
                {
                    isFunny = false;
                    break;
                } // if
            } // for
            
            if(isFunny)
                System.out.println("Funny");
            else 
                System.out.println("Not Funny");
            
            T--;
        } // while
    }
}
