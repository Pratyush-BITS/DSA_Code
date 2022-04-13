package HackerEarth_DSA;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CyclicShift {

    public static int Values(List<Integer> alist)
    {
        int ans=0;
        int x=alist.size()-1;
        for (Integer integer : alist)
            ans += Math.pow(2, x--) * integer;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> alist= Stream.of(sc.nextLine().split("")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(Values(alist));


    }




//    private static Long findMax(String binString,long K){
//
//        String temp = binString;
//        BigInteger maxVal = new BigInteger("0");
//        BigInteger tempVal;
//        int i = 0, mvIndex = 0;
//        Set<BigInteger>set = new HashSet<>();
//        while(true){
//            tempVal = Values(temp);
//            if(set.contains(tempVal))
//                break;
//            set.add(tempVal);
//            if(maxVal.compareTo(tempVal)<0){
//                mvIndex = i;
//                maxVal = tempVal;
//            }
//            temp = binString.substring(++i)+binString.substring(0,i);
//        }
//        return (K-1)*i+mvIndex;
//    }
//
//    private static BigInteger Values(String tempBinStr)
//    {
//        BigInteger biggie = BigInteger.ZERO;
//        int x=tempBinStr.length()-1,lim = x;
//        for (int i=0; i<= lim; i++) {
//            char ch = tempBinStr.charAt(i);
//            biggie = biggie.add(BigInteger.valueOf((long)(Math.pow(2, x--)*(ch-48))));
//        }
//        return biggie;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- >0) {
//            Long n = sc.nextLong();
//            long K = sc.nextLong();
//            sc.nextLine();
//            String binString = sc.nextLine();
//            System.out.println(findMax(binString, K));
//        }
//    }



//    private static Long findMax(String binString,long K){
//
//        String temp = binString;
//        long maxVal = 0;
//        int i = 0, mvIndex = 0;
//
//        do{
//            long tempVal = Long.parseLong(temp,2);
//            if(maxVal<tempVal){
//                mvIndex = i;
//                maxVal = tempVal;
//            }
//            temp = binString.substring(++i)+binString.substring(0,i);
//        }while(temp.compareTo(binString)!=0);
//
//        return (K-1)*i+mvIndex;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t= sc.nextInt();
//        while (t-- > 0) {
//            int len = sc.nextInt();
//            long K = sc.nextLong();
//            sc.nextLine();
//            String binString = sc.nextLine();
//            System.out.println(binString.length());
//            System.out.println(findMax(binString, K));
//        }
//    }



}
