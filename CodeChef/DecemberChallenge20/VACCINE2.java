/* Problem Link: https://www.codechef.com/DEC20B/problems/VACCINE2/ */

package CompetitiveProgramming.CodeChef.DecemberChallenge20;

import java.io.*;

public class VACCINE2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            String in[] = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            long d = Long.parseLong(in[1]);
            
            String input[] = br.readLine().split(" ");
            long arr[] = new long[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = Long.parseLong(input[i]);
            }
            
            long ans = 0;
            
            if(d == 1){
                ans = n;
            }else{
                long risk = 0;
                long nonRisk = 0;
                
                for(int i = 0; i < n; i++){
                    if(arr[i] > 9 && arr[i] < 80){
                        nonRisk++;
                    }else{
                        risk++;
                    }
                }
                
                if(risk != 0){
                    if(d >= risk){
                        ans++;
                    }else{
                        if(risk % d == 0){
                            ans += risk/d;
                        }else{
                            ans += risk/d;
                            ans++;
                        }
                    }
                }
                
                if(nonRisk != 0){
                    if(d >= nonRisk){
                        ans++;
                    }else{
                        if(nonRisk % d == 0){
                            ans += nonRisk/d;
                        }else{
                            ans += nonRisk/d;
                            ans++;
                        }
                    }
                }
                
            }
            
            System.out.println(ans);
        }
    }
}
