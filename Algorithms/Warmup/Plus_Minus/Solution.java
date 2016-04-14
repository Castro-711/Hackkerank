import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();
        
        int pos = 0,
            neg = 0,
            zer = 0;
        
        // calculates whether each element is +, -, 0
        for(int x: nums)
        {
            if(x > 0)
                pos++;
            else if(x < 0)
                neg++;
            else
                zer++;
        } // x
        
        // print
        System.out.printf("%.9f\n", (double) pos/n);
        System.out.printf("%.9f\n", (double) neg/n);
        System.out.printf("%.9f", (double) zer/n);       
    } // main
}
