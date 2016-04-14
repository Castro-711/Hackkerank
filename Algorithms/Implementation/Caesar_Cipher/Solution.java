import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N = Integer.parseInt(input.nextLine());
        String S = input.nextLine();
        int K = Integer.parseInt(input.nextLine());
        String crypto = "";
        int currentChar = 0;
        
        if(K > 26)
            K = K % 26;
        
        for(int i = 0; i < N; i++)
        {
            currentChar = (int) S.charAt(i);
            
            if(currentChar >= 65 && currentChar <= 90)
            {
                if((currentChar + K) > 90)
                     currentChar = ((currentChar - 90) + 64);

                crypto = crypto + (char) (currentChar + K);
            }   
            else if(currentChar >= 97 && currentChar <= 122)
            {
                if((currentChar + K) > 122)
                     currentChar = ((currentChar - 122) + 96);
                
                crypto = crypto + (char) (currentChar + K);
            }           
            else
                crypto = crypto + (char) currentChar;
        } // for i
        
        System.out.println(crypto);
    } // main
}
