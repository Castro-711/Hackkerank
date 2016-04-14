/*
ALGORITHM:
    create Scanner 
    declare and init an int N and two longs K, sum_K
    use a loop to determine the most amount of toys can be bought
    
    
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int K = input.nextInt();
        
        int[] nPrices = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            nPrices[i] = input.nextInt();    
        }
        
        Arrays.sort(nPrices);
        
        int sumToys = 0,
            iCount = 0;
        
        while(sumToys < K)
        {
           sumToys += nPrices[iCount];
           if(K - sumToys >= 0)
               iCount++;  
        }
        
        System.out.println(iCount);
    }
}
