import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int counter = 0;
        long sum = 0;
        
        while(counter < n)
        {
            sum += input.nextLong();
            
            counter++;
        }
        
        System.out.println(sum);
        
    }
}
