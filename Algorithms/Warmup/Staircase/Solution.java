import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[][] staircase = new char[n][n];
        
        for(int y = 0; y < n; y++)
        {
            // track the number of steps
            int z = y + 1;
            
            for(int x = n - 1; x >= 0; x--)
            {
                if(z > 0)
                    staircase[y][x] = '#';
                else
                    staircase[y][x] = ' ';
                
                z--;
            } // for x
        } // for y
        
        for(int a = 0; a < staircase.length; a++)
        {
            for(int b = 0; b < staircase.length; b++)
            {
                System.out.print(staircase[a][b]);
            } // b
            
            System.out.println();
        } // a
    } // main
} // {}
