package HelpOthers;

import java.util.Scanner;


public class CoinProblem {

    public static long getWays(int[] coinList, int n) {
        long[] dp = new long[n+1];
        dp[0]=1;

        for (int i = 1; i < coinList.length; i++)
            for (int j = coinList[i]; j <= n; j++)
                dp[j] += dp[j-coinList[i]];

        return dp[n];
    }

	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int[] coinList = new int[51];
	      for (int i = 0; i <= 50; i++)
	          coinList[i]= (int) Math.pow(i,2);

	      System.out.println(getWays(coinList,n));
	}
}
