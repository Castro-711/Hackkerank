import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int[][] matrix = new int[n][n];
        
        int toN = 0;
        int fromN = 0;
        
        // init the matrix        
        for(int y = 0; y < matrix.length; y++)
            for(int x = 0; x < matrix.length; x++)
                matrix[y][x] = input.nextInt();
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int u = 0; u < matrix.length; u++)
            {
                if(i == u)
                    toN += matrix[i][u];
            } // u
            
            fromN += matrix[i][n - 1];
            
            n--;       
        } // i
        
        System.out.println(Math.abs(toN - fromN));
    }  // main
} // {}
