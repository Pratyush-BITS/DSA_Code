package HelpOthers;

import java.util.Arrays;
import java.util.Scanner;

public class WashingPlates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long income = 0,kgn=0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer []add = new Integer[n];
        int []pay = new int[n];
        int []ded = new int[n];

        for(int i=0;i<n;i++){
            pay[i] = sc.nextInt();
            ded[i] = sc.nextInt();
            add[i] = pay[i]+ded[i];
            income -= ded[i];
            kgn += pay[i];
        }

        if(k>=n)
            System.out.println(kgn+" "+"fd");
        else {
            //Arrays.sort(add, Collections.reverseOrder());
            Arrays.sort(add);
            for(int j = n-1;j>=n-k;j--) {
                income += add[j];
            }
            System.out.println(Math.max(income, 0));
        }


    }

}
