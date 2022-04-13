package HelpOthers;

import java.util.Arrays;
import java.util.Scanner;

public class VowelGame {

    //checking if the character is vowel or not
    private static boolean isVowel(char ch){
        return ch == 'a' || ch =='e' || ch == 'i' || ch== 'o' || ch== 'u';
    }


    static int start = 1;
    private static int findCorrespondingDigit(int i, int lastSum){

        boolean[] primes = new boolean[i-start +1];
        Arrays.fill(primes,true);

        int sq;
        for (int j = 2; (sq = j*j) <= i ; j++)
            if(primes[j-1])
                for (int k = sq; k <= i ; k+=j)
                    if(k >= start)
                        primes[k - start] = false;

        System.out.println("\nBetween"+start+" and "+ i);
        for(int j = 0;j< primes.length;j++)
            if(primes[j]) {
                System.out.print((j+start)+" ");
                lastSum += j + start;
            }
        start = i+1;
        return lastSum+1;
    }


    private static char flattenSum(int sum){
        if(sum==0)
            return '0';
        if(sum %9 == 0)
            return '9';
        return (char)((sum%9)+48);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        int lastSum = 0;
        for ( int i=0; i<a.length() ; i++ ) {
            char ch = a.charAt(i);
            boolean needsReplacement = isVowel(ch);
            if(needsReplacement) {
                lastSum = findCorrespondingDigit(i * 100,lastSum);
                ch = flattenSum(lastSum);
            }
            sb.append(ch);
        }
        System.out.println(sb);
        sc.close();
    }

}
