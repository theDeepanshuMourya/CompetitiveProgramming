/* 
 * Problem Link: https://codeforces.com/contest/1454/problem/C 
 */

package CompetitiveProgramming.CodeForces.Round_686_Div3;

import java.io.*;
import java.util.*;

public class C {
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

            List<Integer> list = new ArrayList<>();
            int i = 0;

            for(int j = 0; j < n; j++){
                list.add(arr[i]);

                while(j < n && arr[i] == arr[j]){
                    j++;
                }
                i = j;
            }

            if(n > 1 && arr[n-1] != arr[n-2]){
                list.add(arr[n-1]);
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            int moves = Integer.MAX_VALUE;

            for(int val: list){
                if(!map.containsKey(val)){
                    map.put(val, 0);
                }

                map.put(val, map.get(val) + 1);
            }

            for(int val: map.keySet()){
                int move = map.get(val) + 1;

                if(list.get(0) == val){
                    move--;
                }

                if(list.get(list.size() - 1) == val){
                    move--;
                }

                moves = Math.min(move, moves);
            }                       
        
            System.out.println(moves);            
        }
    }
}
