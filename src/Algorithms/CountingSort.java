package Algorithms;

public class CountingSort {

    public static void countingSort(int[] array, int min, int max) {

        int len = max - min +1;
        int[] tempArr = new int[len];

        for (int ele: array)
            tempArr[ele-min] = ++tempArr[ele-min];

        int k =0;
        for (int i = min; i <= max; i++)
            while (tempArr[i -min]-- >0)
                array[k++] = i;

    }


    public static void main(String[] args) {

        int[] array = {9,10,2,5,3,6,2,7,9,10};
        System.out.println("Original Array");
        for(int ele: array)
            System.out.print(ele+" ");

        System.out.println("\nAscending Order");
        countingSort(array,2,10);
        for(int ele: array)
            System.out.print(ele+" ");

    }

}
