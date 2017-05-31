import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [][] s = new String[n][n];
        for(int i = 0; i < n; i++){      
        	for(int  k = 0; k < n - 1 - i; k++){
        		System.out.print(" ");
        	}
        	for(int j = n - 1 - i; j < n; j++){
        		System.out.print("#");        		
        	}
        	System.out.println();
        }       
        in.close();
    }
}
