import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int counter = 0;
        int total = 0;
        int[] array = new int[n];
        
        while(counter < n)
        {
            array[counter] = input.nextInt();
            total += array[counter];
            counter++;
        }
        
        System.out.println(total);
        
    }
}
