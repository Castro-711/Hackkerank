import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();  // original stick count
        int[] array = new int[N];
        
        // pop array
        for(int i = 0; i < N; i++)
            array[i] = input.nextInt(); 
        
        int smallest = array[0];
        
        // find smallest
        for(int x = 0; x < N - 1; x++)
        {
            if(array[x] > 0 && array[x] <= smallest)
                smallest = array[x];
            
            //System.out.println(smallest);
        } // for x
        
        int cutCount = 1; // track number of cuts
        int notCut = 0;
        
        while(cutCount > 0)
        {
            cutCount = 0; // each turn must go back to zero
            // cut by smallest
            for(int y = 0; y < N; y++)
            {             
                if(array[y] > 0)
                {
                    array[y] -= smallest;
                    cutCount++;
                }
                else if(array[y] == 0)
                    notCut++;
             } // for y
            
            if(cutCount > 0)
                System.out.println(cutCount);
        } // while   
            
            
        
    }
}
