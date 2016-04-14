import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        for(int y = 0; y < T; y++)
        {
            int N = input.nextInt();
            int treeSize = 1;
            
            for(int x = 1; x <= N; x++)
            {
                if(x % 2 == 1)
                    treeSize = treeSize * 2;
                else 
                    treeSize += 1;
            } // for x
            
            System.out.println(treeSize);
        } // for y
    }
}
