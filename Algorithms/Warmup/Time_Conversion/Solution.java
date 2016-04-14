import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String originalTime = input.nextLine();
        String[] timeArray = originalTime.split(":");
        String am_pm = timeArray[2].substring(2);
        timeArray[2] = timeArray[2].substring(0, 2);
        
        if(am_pm.equals("PM"))
        {
            if(!timeArray[0].equals("12"))
            {
                timeArray[0] = "" + (Integer.parseInt(timeArray[0]) + 12);
                
            } // if
        } // if
        else
        {
            if(timeArray[0].equals("12"))
                timeArray[0] = "00";
        } // else
        
        for(int i = 0; i < timeArray.length; i++)
        {
            String colon = ":";
            if(i == timeArray.length - 1)
                colon = "";
            
            System.out.print(timeArray[i] + colon);
        } // for
            
    }
}
