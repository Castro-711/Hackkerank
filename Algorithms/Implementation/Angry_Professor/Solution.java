import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int t = input.nextInt();
        
        
        
        for(int y = 0; y < t; y++)
        {
            int n = input.nextInt();
            int k = input.nextInt();
            int counter = 0;
            
            for(int x = 0; x < n; x++)
            {
                int a = input.nextInt();
                
                if(a <= 0)
                    counter++;
                
            } // for x
            
            if(counter < k)
                System.out.println("YES");
            else 
                System.out.println("NO");
            
        } // for y
        
    } // main
} // {}
