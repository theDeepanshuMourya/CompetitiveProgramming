/* 
 * Problem Link: https://codeforces.com/contest/1454/problem/A 
 */

package CompetitiveProgramming.CodeForces.Round_686_Div3;

import java.io.*;

public class A {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            
            int arr[] = new int[n];
            int val = n;
            
            for(int i = 0; i < n; i++){
                arr[i] = val--;    
            }
            
            if(n%2 != 0){
                int mid = n/2;
                int temp = arr[mid];
                arr[mid] = arr[n-1];
                arr[n-1] = temp;
            }
            
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            
            System.out.println();
        }
    }
}
