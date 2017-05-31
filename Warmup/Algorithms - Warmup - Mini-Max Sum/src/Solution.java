import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long[] res = new long[arr.length];
        for(int i = 0; i < arr.length; i++){
        	long sum = 0;
        	for(int j = 0; j < arr.length; j++){
        		if(i == j){
        			continue;
        		}
        		sum += (long)arr[j];
        	}
        	res[i] = sum;
        }
        long smallest = res[0];
        long largest = res[0];
        for(int i = 0; i < res.length; i++){
        	if(res[i] < smallest){
        		smallest = res[i];
        	}
        	if(res[i] > largest){
        		largest = res[i];
        	}
        }      
        System.out.println(smallest + " " + largest);        
        in.close();
    }
}
