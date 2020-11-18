/*
 * Problem Link - https://www.codechef.com/NOV20B/problems/FEMA2
 */

package CompetitiveProgramming.CodeChef.NovemberChallenge20;

import java.util.*;
import java.io.*;

public class FEMA2 {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0){
		    String in[] = br.readLine().split(" ");
		    int n = Integer.parseInt(in[0]);
		    int k = Integer.parseInt(in[1]);
		    
		    String S = br.readLine();
		    
		    System.out.println(countMagnets(n, k, S));
		}
	}
	
	private static int countMagnets(int n, int k, String S){
	    Queue<Integer> magnet = new LinkedList<>();
	    Queue<Integer> iron = new LinkedList<>();
	    Queue<Integer> sheets = new LinkedList<>();
	    int count = 0;
	    
	    for(int i = 0; i < n; i++){
	        if(S.charAt(i) == 'M'){
	            magnet.add(i);
	        }else if(S.charAt(i) == 'I'){
	            iron.add(i);
	        }else if(S.charAt(i) == ':'){
	            sheets.add(i);
	        }else if(S.charAt(i) == 'X'){
	            magnet = new LinkedList<>();
	            iron = new LinkedList<>();
	        }
	        
	        while(magnet.size() != 0 && iron.size() != 0){
	            int mi = magnet.peek();
	            int ii = iron.peek();
	            
	            while(sheets.size() != 0 && sheets.peek() < Math.min(mi, ii)){
	                sheets.remove();
	            }
	            
	            if(k + 1 - Math.abs(mi - ii) - sheets.size() > 0){
	                count++;
	                magnet.remove();
	                iron.remove();
	            }else{
	                if(mi < ii){
	                    magnet.remove();
	                }else{
	                    iron.remove();
	                }
	            }
	        }
	    }
	    
	    return count;
	}
}
