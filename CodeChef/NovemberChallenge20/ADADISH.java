/* 
 * Problem Link: https://www.codechef.com/NOV20B/problems/ADADISH 
 */

package CompetitiveProgramming.CodeChef.NovemberChallenge20;

import java.util.*;
import java.io.*;

public class ADADISH {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            
            String in[] = br.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(in[i]);
            }
            
            System.out.println(countMinimum(arr, n));
        }
	}
	
	private static int countMinimum(int[] arr, int n) {
        int X = 0;
        int Y = 0;
        
        Arrays.sort(arr);
        
        for(int i = n-1; i >= 0; i--){
            if(X <= Y){
                X += arr[i];
            }else{
                Y += arr[i];
            }
        }
        
        return Math.max(X, Y);
	}
}
