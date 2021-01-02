/* Problem Link: https://www.codechef.com/DEC20B/problems/POSPREFS/ */

package CompetitiveProgramming.CodeChef.DecemberChallenge20;

import java.io.*;

public class POSPREFS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            String in[] = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            int count = n-k;
            StringBuilder sb = new StringBuilder();
            
            for(int i = 1; i <= n; i++){
                int val = 0;
                if(k >= n/2){
                    val = i;
                    
                    if(count > 0){
                        if(i % 2 == 1){
                            val = 0 - val;
                            count--;
                        }
                    }
                }else{
                    val = 0 - i;
                
                    if(k > 0){
                        if(i % 2 == 1){
                            val = Math.abs(val);
                            k--;
                        }
                    }
                }
                
                sb.append(val + " ");
            }
            
            System.out.println(sb.toString());
        }
    }
}
