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
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int positives = 0, negatives = 0, neutrals = 0;
        for(int i = 0; i <  arr.length; i++){
        	if(arr[i] > 0){
        		positives += 1;
        	}
        	else if(arr[i] < 0){
        		negatives += 1;
        	}
        	else{
        		neutrals += 1;
        	}
        }
        
        System.out.println((float)positives / arr.length);
        System.out.println((float)negatives / arr.length);
        System.out.println((float)neutrals / arr.length);
        in.close();
    }
}

