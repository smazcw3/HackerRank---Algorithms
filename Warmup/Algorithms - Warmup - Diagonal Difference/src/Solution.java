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
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int sum_prim_diag = 0;
        for(int i = 0; i < a.length; i++){
        	sum_prim_diag += a[i][i];        		
        }
        
        int sum_sec_diag = 0;
        for(int i = 0; i < a.length; i++){
        	sum_sec_diag += a[a.length - 1 - i][i];      		
        }
                
        int diff = Math.abs(sum_prim_diag - sum_sec_diag);
        System.out.println(diff);
        in.close();
    }
}

