package Algorithms;

public class QuickSort {

    private static int partition(int[] array,int start,int end){
        //using the first element as pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i<j){
            while (i<j && array[--j]>=pivot);
            if(i<j)
                array[i] = array[j];

            while (i<j && array[++i]<=pivot);
            if(i<j)
                array[j] = array[i];
        }
        array[j] = pivot;
        return j;
    }

    public static void quickSortAscending(int[] array, int start,int end){

        if(end-start < 2)
            return;
        int pivot = partition(array,start,end);
        quickSortAscending(array,start,pivot);
        quickSortAscending(array,pivot+1,end);
    }

    public static void main(String[] args) {

        int[] array = {20,35,15,7,55,1,-22};
        System.out.println("Original Array");
        for(int ele: array)
            System.out.print(ele+" ");

        System.out.println("\nAscending Order");
        quickSortAscending(array,0,array.length);
        for(int ele:array )
            System.out.print(ele+" ");


    }
}
