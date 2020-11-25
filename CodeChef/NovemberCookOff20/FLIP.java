/* 
 * Problem Link: https://www.codechef.com/COOK124B/problems/FLIP 
 */

package CompetitiveProgramming.CodeChef.NovemberCookOff20;

import java.io.*;

public class FLIP {
    public static void main (String[] args) throws java.lang.Exception {
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0){
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    int ans = 0;
		    
		    for(int i = 0; i < s1.length(); i += 2){
		        if(s1.charAt(i) != s2.charAt(i)){
		            while(i < s1.length() && s1.charAt(i) != s2.charAt(i)) i += 2;
		            
		            ans++;
		        }
		    }
		    
		    for(int i = 1; i < s1.length(); i += 2){
		        if(s1.charAt(i) != s2.charAt(i)){
		            while(i < s1.length() && s1.charAt(i) != s2.charAt(i)) i += 2;
		            
		            ans++;
		        }
		    }
		    
		    System.out.println(ans);
		}
	}
}
