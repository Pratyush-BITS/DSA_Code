package HelpOthers;

import java.util.Scanner;

public class coinChange {

    public static long calcCount(int n,int m,int[] coin){

        long dp[] = new long[n+1];
        dp[0] = 1;
        for (int i = 0; i < m; i++)
            for (int j = coin[i]; j < n+1; j++)
                dp[j] += dp[(j-coin[i])];

        return dp[n];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int []coin = new int[m+1];
        for (int i = 0; i <m ; i++)
            coin[i] = sc.nextInt();

        System.out.println(calcCount(n,m,coin));
    }

}
