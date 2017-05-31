import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

@SuppressWarnings("unused")
public class Solution {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Implemented/Completed this function
    	int a = 0;
    	int b = 0;
    	int res[] = new int[2];
    	ArrayList<Integer> arr1 = new ArrayList<Integer>();
    	arr1.add(a0);
    	arr1.add(a1);
    	arr1.add(a2);
    	arr1.add(b0);
    	arr1.add(b1);
    	arr1.add(b2);
    	for(int i = 0; i < arr1.size() - 3; i++){
    		if(arr1.get(i) > arr1.get(i+3)){
    			a = a + 1;
    		}
    		else if(arr1.get(i) < arr1.get(i+3)){
    			b = b + 1;
    		}
    		else{
    			a = a + 0;
    			b = b + 0;
    		}
    	}
    	res[0] = a;
    	res[1] = b;
    	return res;    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }
}
