package HelpOthers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class permutation {


    static int findCount(int n, int k)
    {
        int count = 1;
        for (int i = 1; i <= k; i++) {
            count = (count*n)%1000000007;
        }
        return count%1000000007;
    }

    static List<String> ans = new ArrayList<>();
    static long printKLengthString(List<Character> set, String sequence, int n, int k,long count) {
        if (k == 0){
            ans.add(sequence);
            return ++count;
        }
        for (int i = 0; i < n; i++){
            String newSequence;
            newSequence=sequence+ set.get(i);
            count = printKLengthString(set, newSequence, n, k - 1,count);
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "elemente";
        int k =2;
        LinkedHashSet<Character> set= new LinkedHashSet<>();
//        for (int i = 0; i < 3; i++) {
//            set.add(str.charAt(i));
//        }
        k=9;
        for (int i = 0; i < 8; i++) {
            set.add(str.charAt(i));
        }
        long count = printKLengthString(List.copyOf(set),"",set.size(),k,0);

        try{
            FileWriter fw=new FileWriter("D:\\output.txt");
            fw.write("count using simple function : "+findCount(set.size(),k));
            fw.write("count using word generator function : "+ count +" %1000000007 = " + count%1000000007+'\n');
            fw.write("Generated words are :\n");
            for (String strq:ans)
                fw.write(strq+'\n');
            fw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Success...");
    }
}
