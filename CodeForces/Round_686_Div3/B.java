/* 
 * Problem Link: https://codeforces.com/contest/1454/problem/B 
 */

package CompetitiveProgramming.CodeForces.Round_686_Div3;

import java.io.*;
import java.util.*;

public class B {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
 
            String in[] = br.readLine().split(" ");
 
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(in[i]);
            }
 
            HashMap<Integer, Integer> freq = new HashMap<>();
            HashMap<Integer, Integer> indexes = new HashMap<>();
            
            for(int i = 0; i < n; i++){
                if(!indexes.containsKey(arr[i])){
                    indexes.put(arr[i], i);
                }
 
                if(!freq.containsKey(arr[i])){
                    freq.put(arr[i], 0);
                }
 
                freq.put(arr[i], freq.get(arr[i]) + 1);
            }
 
            int min = Integer.MAX_VALUE;
            int minIndex = Integer.MAX_VALUE;
 
            for(int key: freq.keySet()){
                if(freq.get(key) == 1){
                    if(min > key){
                        min = key;
                        minIndex = indexes.get(key);
                    }
                }
            }
 
            if(min == Integer.MAX_VALUE){
                System.out.println("-1");
            }else{
                System.out.println(minIndex + 1);
            }
            
        }
    }
}
