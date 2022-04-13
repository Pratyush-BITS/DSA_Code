package HelpOthers;

import java.util.Scanner;

public class SumContiguousSubArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        /*reading values one by one is slow hence read all the values at once and
        then put it in an int array*/
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split("\\s");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s[i]);

        /*sol 1
         loop runs for n elements So, Time complexity-> O(n)
         element is multiplied by the it's number of occurrence = (n-i)*(i+1)*/
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i] * (n - i) * (i + 1);
        }
        System.out.println(sum1);

        /*sol 2
         loop runs for n/2 elements So, Time complexity-> O(n/2) = O(n)
         first and last element have same freq
         similarly 2nd and 2nd last elements have same frequency
         So, element at pos i and (n-1-i) has same frequency
         freq is product of position of elements at i and (n-1-i) = (n-i)*(i+1)
         for n = even, loop will run till the mid element
         for n = odd, loop will run till (mid - 1) element */
        int sum2 = 0, mid = n/2;
        for(int i = 0;i<mid;i++){
            int eleA = arr[i];
            int posA = i+1;
            int eleB = arr[n-i-1];
            int posB = n-i;
            sum2 += (eleA + eleB) * posA * posB;
        }
        if(n % 2 == 1)
            sum2 += arr[mid]*Math.pow(mid+1,2);

        System.out.println(sum2);

    }
}
