/* Problem Link: https://www.codechef.com/DEC20B/problems/EVENPSUM/ */

package CompetitiveProgramming.CodeChef.DecemberChallenge20;

import java.io.*;

public class EVENPSUM {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- > 0){
            String in[] = br.readLine().split(" ");
            long a = Long.parseLong(in[0]);
            long b = Long.parseLong(in[1]);

            long even_a = 0;
            long even_b = 0;
            long odd_a = 0;
            long odd_b = 0;

            if(a % 2 == 0){
                even_a = a/2;
                odd_a = a/2;
            }else{
                even_a = a/2;
                odd_a = even_a + 1;
            }

            if(b % 2 == 0){
                even_b = b/2;
                odd_b = b/2;
            }else{
                even_b = b/2;
                odd_b = even_b + 1;
            }

            long count_odd = odd_a * odd_b;
            long count_even = even_a * even_b;

            System.out.println(count_odd + count_even);
        }
    }
}
