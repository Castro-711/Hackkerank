import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        for(int y = 0; y < T; y++)
        {
            int N = input.nextInt();
            
            // crucial variables
            String original = "" + N;
            String checkedDigs = "";
            int divisors = 0;
            int checkedLoop = original.length();
            int fullNum = N;
            
            while(N > 0)
            {
                int currentDig = N % 10;
                char currentChar = (char) currentDig;
                
                if(currentDig != 0)
                {
                    if(fullNum % currentDig == 0 && divisors < original.length())
                    {
                        divisors++;
                    } // if
                } // if                
                checkedLoop--;
                
                N = N / 10;                
            } // while N
            
            System.out.println(divisors);
            
        } // for y
    }
}
