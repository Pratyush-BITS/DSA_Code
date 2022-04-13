package HelpOthers;

class SubSequence
{
    static int countOccurrence(String checkIn, String checkFor)
    {
        int len1 = checkFor.length();
        int len2 = checkIn.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 0; i <= len2; ++i)
            dp[0][i] = 0;

        for (int i = 0; i <= len1; ++i)
            dp[i][0] = 1;

        for (int i = 1; i <= len1; i++)
            for (int j = 1; j <= len2; j++)
            {
                if (checkIn.charAt(i - 1) == checkFor.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] +
                            dp[i - 1][j];

                else
                    dp[i][j] = dp[i - 1][j];
            }


        return dp[len1][len2];
    }

    // Driver Code
    public static void main (String[] args)
    {
        String checkIn = "MOMODAAMAD";
        String[] checkFor = {"MOM","DAD"};

        int count = 0;
        for (String ele : checkFor)
            count+= countOccurrence(checkIn,ele);

        System.out.println(count);
    }
}
