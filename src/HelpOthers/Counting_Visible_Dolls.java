package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Deque;
import java.util.LinkedList;

public class Counting_Visible_Dolls {

    /**
     * Method 1 : Uses Doubly ended queue. Dolls that will be visible in the end will 
     *            remain in the queue after iterating through the whole dollArray
     * 
     * Method 2 : uses hashmap to calculate the max value of a particular size of doll.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        String[] doll= buff.readLine().split(" ");
        int[] dollArray = new int[n];
        for (int i = 0; i < dollArray.length; i++)
            dollArray[i] = Integer.parseInt(doll[i]);

        System.out.println(visibleDollsCount_method1(dollArray));
        System.out.println(visibleDollsCount_method2(dollArray));

    }

    static int visibleDollsCount_method2 (int[]arr){

        int count =0;
        Map<Integer,Integer> dollMap= new HashMap<>();

        for(int a: arr){
            dollMap.put(a,dollMap.getOrDefault(a,0)+1);
            int val = dollMap.get(a);
            count = Math.max(count,val);
        }

        return count;
    }

    static int visibleDollsCount_method1 (int[]arr){

        Deque<Integer> dollQue = new LinkedList<>();

        for(int a : arr){
            if(dollQue.size() > 0 && dollQue.peekFirst() < a)
                dollQue.pop();
            dollQue.addLast(a);
        }

        return dollQue.size();
    }

}