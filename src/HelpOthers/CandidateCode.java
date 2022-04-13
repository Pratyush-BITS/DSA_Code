package HelpOthers;

import java.util.Scanner;

public class CandidateCode{

    private static boolean isPrime(int ele){
        if(ele<=1)
            return false;

        if(ele==2)
            return true;

        int root = (int)Math.sqrt(ele);
        for (int i = 2; i <= root; i++)
            if(ele % i == 0)
                return false;

        return true;
    }

    public static int primeGame (int[] arr) {
        int count = 0;
        int lowPrime = 0, highPrime =0;

        for (int ele:arr)
            if(isPrime(ele)){
                count++;
                if(lowPrime > 0)
                    highPrime = ele;
                else
                    lowPrime = ele;
            }

        if(count==0)
            return -1;
        if (count == 1)
            return 0;

        return Math.abs(lowPrime-highPrime);
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int n = L+R-1;
        int []arr = new int[n];
        for(int i=0;i<n && L<=R;i++)
            arr[i]=L++;

        System.out.println(primeGame(arr));

    }

}
//import java.util.*;
//
//public class HelpOthers.CandidateCode{
//
//    static String personTest(String big, String person){
//        boolean present = false;
//
//        int len = big.length();
//        int len2 = person.length();
//        int curr = 0;
//        int j =0;
//        for (int i = curr; i < len; i++) {
//            if(person.charAt(j) == big.charAt(i) ){
//                j++;
//            }
//            if(j == len2){
//                present = true;
//                break;
//            }
//        }
//
//        return present?"POSITIVE":"NEGATIVE";
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        String big = sc.nextLine();
//        int num = sc.nextInt();
//        sc.nextLine();
//        String []person = new String[num];
//
//        for (int i = 0; i < num; i++)
//            person[i]= sc.nextLine();
//
//
//        for(String p: person)
//            System.out.println(personTest(big,p));
//    }
//
//}
//
