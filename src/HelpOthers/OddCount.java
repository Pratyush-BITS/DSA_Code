package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculating the number of integer values whose length is odd
 */

public class OddCount {
    //int terms of complexity both the codes are O(n)
    //but when they're run method 2 is a few ms faster than method 1

    //method 1
    static int oddCount1(int n, int[] nums){
        int lenOddCount = 0;
        //write your code here
        for(int a : nums){
            if( ((int)Math.log10(a)+1)%2 == 1)
                lenOddCount++;
        }
        return lenOddCount;
    }

    //method 2
    static int oddCount2(int n, int[] nums){
        int lenOddCount = 0;
        //write your code here
        for(int a : nums){
            if(a <10 || (a>99 && a<1000) || (a>9999 && a<100000))
                lenOddCount++;
        }
        return lenOddCount;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        String[] arrS = buff.readLine().split("\\s");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(arrS[i]);
        System.out.println(oddCount1(n,nums));
        System.out.println(oddCount2(n,nums));
    }
}
