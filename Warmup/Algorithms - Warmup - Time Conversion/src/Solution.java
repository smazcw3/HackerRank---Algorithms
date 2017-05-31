import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();        
        String hour  = time.substring(0,2);
        if(time.contains("PM")){
        	int hh = Integer.parseInt(hour);
        	if(hh == 12){
            	String conv_time = Integer.toString(hh) + time.substring(2, time.length() - 2);
            	System.out.println(conv_time);
        	}
        	else{
            	int diff = 12 - hh;
            	int real_diff = 24 - diff;
            	String conv_time = Integer.toString(real_diff) + time.substring(2, time.length() - 2);
            	System.out.println(conv_time);
        	}

        }
        else{
        	int hh = Integer.parseInt(hour);
        	String conv_time = "";
        	if(hh == 12){
        		conv_time = "00" + time.substring(2, time.length() - 2);
        	}
        	else{
        		conv_time = time.substring(0, time.length() - 2);
        	}       	
        	System.out.println(conv_time);
        }
        in.close();
    }
}
