package HelpOthers;

import java.util.ArrayList;

public class ProductSum {

    static int productSum(ArrayList<Object> arr, Integer m){
        int sum = 0;

        for(Object ele : arr)
            sum += ele.getClass()==Integer.class ? (Integer) ele:
                productSum((ArrayList<Object>) ele, m + 1);

        return sum * m;
    }

    public static void main(String[] args) {

        ArrayList<Integer> temp1 = new ArrayList<>();
        temp1.add(7);
        temp1.add(-1);

        ArrayList<Integer> temp2 = new ArrayList<>();
        temp2.add(-13);
        temp2.add(8);

        ArrayList<Object> temp3 = new ArrayList<>();
        temp3.add(6);
        temp3.add(temp2);
        temp3.add(4);

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(temp1);
        arr.add(3);
        arr.add(temp3);

        System.out.println(productSum(arr,1));
    }

}
