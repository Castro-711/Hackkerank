import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt(); // segments
        int T = input.nextInt(); // testCases
        
        int[] segWidth = new int[N];
        
        // pop the lane with segment widths
        for(int i = 0; i < segWidth.length; i++)
        {
            segWidth[i] = input.nextInt();
        } // for
        
        while(T > 0)
        {
            int i = input.nextInt();
            int j = input.nextInt();
            int smallest = 3;
            
            while(i <= j)
            {
                if(segWidth[i] < smallest)
                    smallest = segWidth[i];
                
                i++;
            }
                        
            System.out.println(smallest);
            
            T--; // next TestCase
        } // T
    } // main
} // {}
