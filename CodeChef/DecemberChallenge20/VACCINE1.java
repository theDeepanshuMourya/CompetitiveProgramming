/* 
 * Problem Link: https://www.codechef.com/DEC20B/problems/VACCINE1/
 */

package CompetitiveProgramming.CodeChef.DecemberChallenge20;

import java.io.*;

public class VACCINE1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int d1 = Integer.parseInt(s[0]);
        int d2 = Integer.parseInt(s[2]);
        int v1 = Integer.parseInt(s[1]);
        int v2 = Integer.parseInt(s[3]);
        int p = Integer.parseInt(s[4]);
        int day = 1;
        int min = 0;
        int count = 0;

        while(count < p){
            if(day >= d1){
                count += v1; 
            }

            if(day >= d2){
                count += v2;
            }

            min++;
            day++;
        }

        System.out.println(min);
    }
}
