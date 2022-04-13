package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountEvenDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] arrS = buff.readLine().split("\\s");
        int len = arrS.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = Integer.parseInt(arrS[i]);

        for(int ele : arr){
            System.out.println((int)(Math.log10(ele)+1)%2 );
        }

    }
}
