package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class AashiAndIntrovertFriends {

    /**
     * Say b = 10000 and a = 1 so, n = 9999 = 10000(approx)
     *
     *  Method 0 :  Outer for loop runs for n times, inner for loop runs for n/2 times
     *              Degrades very quickly (Not included in this file).
     *              Time Complexity = n*n, Space complexity : O(1)
     *
     *  Method 1 : Uses simple for loops. As the values of n is increases the time
     *             required to find the ans also increases.
     *             Time Complexity = n*√n, , Space complexity : O(1)
     *             For n = 10000, Number of computations are approximately -> 1000000
     *

     * Method 2 : Uses simple for loops. As the values of n is increases the time
     *            required to find the ans also increases.
     *            But is a much less than time required in method 1.
     *            Time Complexity = n*log(√n), Space complexity : O(1)
     *            Say n = 10000, so computations are approximately -> 40000
     *
     *
     *  Method 3 : Uses modified Sieve of Eratosthenes for calculating prime in a range.
     *             The sieve of Eratosthenes is one of the most efficient ways to find
     *             all primes smaller than n when n is smaller than 10 million.
     *             Time Complexity = n*log(log(√n)) which is approximately linear.
     *             Space complexity : O(n)
     *             Say n = 10000, so computations are approximately -> 3010
     *             This modified version helps in calculating the prime numbers in a given range.
     *
     *             There is another method called as Segmented Sieve (Time Complexity : O(n))
     *             which out performs Sieve of Eratosthenes for n > 10^10 but requires lot more memory.
     *
     */


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        while (n-- > 0) {
            String[] range = bf.readLine().split("\\s");
            int a = Integer.parseInt(range[0]);
            int b = Integer.parseInt(range[1]);
            introvertFriends_method1(a, b);
            introvertFriends_method2(a, b);
            introvertFriends_method3(a, b);
        }
    }

    static int visibleDollsCount_method2 (int[]arr,int n){

        Deque<Integer> dollQue = new LinkedList<>();
        for(int a : arr){
            if(dollQue.size()>0 && dollQue.peekFirst() < a)
                dollQue.pop();
            dollQue.push(a);
        }

        return dollQue.size();
    }


    //Method 1
    private static void introvertFriends_method1(int a, int b) {

        StringBuilder introvertRollNumbs = new StringBuilder();
        int count = 0;

        for (int i = a; i <= b; i++) {
            int root = (int) Math.sqrt(i);
            if (i != 1) {
                boolean flag = true;
                for (int j = 2; j <= root; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                    introvertRollNumbs.append(i).append(" ");
                }
            }
        }
        System.out.println("\nUsing method 1:\n"
                + count + "\n" + introvertRollNumbs);
    }


    //Method 2
    private static void introvertFriends_method2(int a, int b) {

        int count = 0;
        StringBuilder introvertRollNumbs = new StringBuilder();
        for (int i = a; i <= b; i++) {

            boolean flag = (i > 1); // boolean expression

            if (i > 2 && i % 2 == 0)
                flag = false;

            for (int j = 3; flag && j <= (int) Math.sqrt(i); j += 2)
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            if (flag) {
                count++;
                introvertRollNumbs.append(i).append(" ");
            }
        }

        System.out.println("\n\nUsing method 2:\n"
                + count + "\n" + introvertRollNumbs);

    }


    //Method 3
    private static void introvertFriends_method3(int a, int b) {

        int n = b - a;
        boolean[] introvert = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            introvert[i] = true;

        int sq;
        for (int p = 2; (sq = p * p) <= b; p++)
            if (introvert[p - 1])
                for (int i = sq; i <= b; i += p)
                    if (i >= a)
                        introvert[i - a] = false;


        StringBuilder introvertRollNumbs = new StringBuilder();
        int count = 0;
        for (int i = 0; i <= n; i++)
            if (i + a > 1 && introvert[i]) {
                count++;
                introvertRollNumbs.append(i + a).append(" ");
            }

        System.out.println("\n\nUsing method 3:\n"
                + count + "\n" + introvertRollNumbs);
    }
}