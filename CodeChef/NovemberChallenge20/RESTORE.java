/* 
 * Problem Link: https://www.codechef.com/NOV20B/problems/RESTORE
 */

package CompetitiveProgramming.CodeChef.NovemberChallenge20;

import java.util.*;
import java.io.*;

public class RESTORE {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        List<Integer> primes = sieveOfEratosthenes(10000000 + 1);
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String in[] = br.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(in[i]);
            }
            
            int res[] = new int[n];
            
            int index = 0;
            
            for(; index < n; index++){
                res[index] = primes.get(arr[index]);
            }
            
            for(int i = 0; i < n; i++){
                System.out.print(res[i] + " ");
            }
            
            System.out.println();
        }
	}
	
	public static List<Integer> sieveOfEratosthenes(int n){
	    boolean prime[] = new boolean[n+1];
	    Arrays.fill(prime, true);
	    
	    for(int i = 2; i*i <= n; i++){
	        if(prime[i]){
	            for(int j = i*i; j <= n; j += i){
	                prime[j] = false;
	            }
	        }
	    }
	    
	    List<Integer> res = new ArrayList<>();
	    for(int i = 2; i <= n; i++){
	        if(prime[i]) res.add(i);
	    }
	    
	    return res;
	}
}
