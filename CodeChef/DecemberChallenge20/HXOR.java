/* Problem Link: https://www.codechef.com/DEC20B/problems/HXOR/ */

package CompetitiveProgramming.CodeChef.DecemberChallenge20;

import java.io.*;

public class HXOR {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String in[] = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            long x = Long.parseLong(in[1]);

            long arr[] = new long[n];
            String s[] = br.readLine().split(" ");

            for(int i = 0; i < n; i++){
                arr[i] = Long.parseLong(s[i]);
            }

            int i = 0;
            int j = n-1;

            if(x < n){
                j = 1;
                boolean flag = true;

                while(x > 0 && j < n){
                    long bit = setBitNumber(arr[i]);
                    arr[i] ^= bit;
                    flag = true;

                    int index = j;
                    
                    while(index < n){
                        long val = arr[index] ^ bit;

                        if(val < arr[index]){
                            arr[index] = val;
                            flag = false;
                            break;
                        }else{
                            index++;
                        }
                    }

                    if(flag){
                        arr[n-1] ^= bit;
                    }

                    if(arr[i] == 0){
                        while(arr[i] == 0 && i < n-1){
                            i++;
                        }
                        j = i+1;
                    }

                    x--;
                }
            }else{
                while(x > 0 && i < j){
                    long bit = setBitNumber(arr[i]);
                    arr[i] ^= bit;
                    arr[j] ^= bit;
    
                    if(arr[i] == 0){
                        i++;
                    }
    
                    if(arr[j] == 0){
                        j--;
                    }
    
                    x--;
                }
            }

            if(x > 0){
                if(n == 2){
                    if(x % 2 == 1){
                        if(i == j){
                            i--;
                        }
        
                        if(x % 2 != 0){
                            arr[i] ^= 1;
                            arr[j] ^= 1;
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int index = 0; index < n; index++){
                sb.append(arr[index]);
                sb.append(" ");
            }

            System.out.println(sb.toString());
        }
    }
    
    public static long setBitNumber(long n) {
        n |= n >> 1; 
        n |= n >> 2; 
  
        n |= n >> 4; 
        n |= n >> 8; 
        n |= n >> 16; 
        n = n + 1; 
        return (n >> 1); 
    }
}
