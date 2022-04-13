package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *   Part 1:
 *   reading the profit of stalls and sorting them in Ascending order.
 *   We need the array in descending order, so will keep a variable 'i' to track the last element
 *
 *
 *   Part 2:
 *   calculating the frequency of visits for each stall in an array of length = no of shops
 *   Sorting the map in ascending order
 *
 *   Note:
 *   If two stalls have same number of visits then their order won't matter
 *   Profit earned from person1: 4+6+7 = 17 = 4+7+6
 *   profit earned from person2: 6+7 = 13 = 7+6
 *   i.e. order of stall with profit 6 & 7 won't matter as their visited by same no of people
 *
 *   Part 3:
 *   Calculating the sum based on the number of that are visited.
 *   As the freq are sorted, we iterate it in reverse.
 *   when the value in freq reaches 0 break from the loop
 *   'i' was declared (in part 1) as the last element in stallProfit.
 *   for a shop the profit earned is : (number ot times visited * profit for that stall)
 *
 */

public class JethalalAndProfit {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        //Part 1
        int stallsCount = Integer.parseInt(buff.readLine());
        String[] stalls = buff.readLine().split("\\s");
        int[] stallsProfit = new int[stallsCount];
        for (int i = 0; i < stallsCount; i++)
            stallsProfit[i] = Integer.parseInt(stalls[i]);
        Arrays.sort(stallsProfit);
        int i=stallsCount-1;

        //Part 2
        int m = Integer.parseInt(buff.readLine());
        int []freqVisit = new int[stallsCount];
        for (int j = 0; j < m; j++) {
            String[] visited = buff.readLine().split("\\s");
            int l = Integer.parseInt(visited[0]);
            int r = Integer.parseInt(visited[1]);
            for (int k = l; k <= r ; k++)
                freqVisit[k]++;
        }
        Arrays.sort(freqVisit);

        //Part 3
        int sum=0;
        for (int k = i; k >= 0; k--) {
            if(freqVisit[k]==0)
                break;
            sum += freqVisit[k]*stallsProfit[k];
            System.out.println(freqVisit[k]+" "+stallsProfit[k]);
        }

        System.out.println("\nsum = "+sum);

    }
}