/* 
 * Problem Link: https://www.codechef.com/COOK124B/problems/IPCCERT 
 */

package CompetitiveProgramming.CodeChef.NovemberCookOff20;

import java.io.*;

public class IPCCERT {
    public static void main (String[] args) throws Exception {
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in1[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(in1[0]);
		int m = Integer.parseInt(in1[1]);
		int k = Integer.parseInt(in1[2]);
		
		int count = 0;
		
		for(int i = 0; i < n; i++){
		    String in[] = br.readLine().split(" ");
		    long sum = 0;
		    
		    for(int j = 0; j < k; j++){
		        sum += Long.parseLong(in[j]);
		    }
		    
		    int last = Integer.parseInt(in[in.length - 1]);
		    
		    if(sum >= m && last <= 10) count++;
		}
		
		System.out.println(count);
	}    
}
