package HelpOthers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Factorial {
    private static void calcFact(int a){
        List<Integer> factList = new ArrayList<>();
        factList.add(1);
        int rem = 0;
        for (int i = 2; i <=a; i++) {
            int ind = 0;
            while (ind<factList.size()){
                int ele = factList.get(ind)*i+rem;
                factList.set(ind++,ele%10);
                rem=ele/10;
            }
            while (rem > 0) {
                factList.add(rem % 10);
                rem /= 10;
            }
        }

        ListIterator<Integer> it = factList.listIterator(factList.size());
        while (it.hasPrevious()){
            System.out.print(it.previous());
        }
    }

    public static void main(String[] args) {

        int a =74;
        calcFact(a);
    }
}
