package HelpOthers;

import java.util.*;

public class FrequencyQueries {
    // hash keeps the number and it's freq
    // hashFreq keeps the freq and count of how many numbers have that freq
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> res = new LinkedList<>();
        Map<Integer, Integer> hash = new HashMap<>();
        Map<Integer, Integer> hashFreq = new HashMap<>();
        for (List<Integer> q : queries) {
            int op = q.get(0);
            int val = q.get(1);
            if(op==1) {
                // insert/update
                if (hash.containsKey(val)) {
                    Integer oldCount = hash.get(val);
                    hash.put(val, oldCount + 1);
                    updateDel(hashFreq, oldCount);
                    update(hashFreq, oldCount + 1);
                } else {
                    hash.put(val, 1);
                    update(hashFreq, 1);
                }
            }
            else if(op==2) {
                // delete
                if (hash.containsKey(val)) {
                    Integer oldCount = hash.get(val);
                    if (oldCount == 1) {
                        hash.remove(val);
                        updateDel(hashFreq, 1);
                    } else {
                        hash.put(val, oldCount - 1);
                        updateDel(hashFreq, oldCount);
                        update(hashFreq, oldCount - 1);
                    }
                }
            }
            else if(op==3) {
                // check frequency
                res.add(hashFreq.containsKey(val) ? 1 : 0);
            }
        }
        return res;
    }
    //if the key exists in hashFreq it is incremented by one, else it's added with a value one
    private static void update(Map<Integer, Integer> map, int i) {
        map.put(i, map.getOrDefault(i, 0)+1);
    }
    private static void updateDel(Map<Integer, Integer> map, int i) {
        int oldCount = map.getOrDefault(i, 0);
        if (oldCount == 0)
            return;
        if (oldCount == 1)
            map.remove(i);
        else
            map.put(i, oldCount-1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> aList = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> aList1= new ArrayList<>();
            aList1.add(sc.nextInt());
            aList1.add(sc.nextInt());
            aList.add(aList1);
        }

        List<Integer>kust = freqQuery(aList);
        kust.forEach(System.out::println);
        kust.forEach(e-> System.out.println(e));

    }

}
