import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            int N = input.nextInt();
            int C = input.nextInt();
            int M = input.nextInt();
            
            int barCount = N / C; // money / cost
            int wrapperCount = barCount;
            int barInjection = 0;
            
            // as long as wrapperCount != 0 || !> M
            while(wrapperCount > 0 && wrapperCount >= M)
            {
                barInjection = wrapperCount / M; // extra bars from wrappers
                barCount += barInjection; // add the new free bars to bar count
                wrapperCount = wrapperCount % M; // resets it value  
                wrapperCount += barInjection; // add wrappers from new free bars
            }
            
            System.out.println(barCount);
        } // for i
   } // main
}
