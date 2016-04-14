import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        
        while(T > 0)
        {
            String A = input.nextLine();
            String B = input.nextLine();
            boolean hasSub = false;
            
            for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())  
            {
                if(A.indexOf(c) > -1 && B.indexOf(c) > -1)
                    hasSub = true;
            } 
            
            if(!hasSub)
                System.out.println("NO");
            else
                System.out.println("YES");
            
            T--;
        } // while
    } // main
}
