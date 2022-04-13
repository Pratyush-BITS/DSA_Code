package Algorithms;

public class MergeSort {

    private static void merge(int[] array, int start, int mid, int end){

        if(array[mid-1] <= array[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while (i<mid && j<end)
            temp[tempIndex++] = (array[i] <= array[j]) ? array[i++] : array[j++];

        System.arraycopy(array,i,array,start+tempIndex,mid-i);
        System.arraycopy(temp,0,array,start,tempIndex);
    }

    public static void mergeSortAscending(int[] array,int start,int end){

        if(end-start < 2)
            return;

        int mid = (start + end)/2;
        mergeSortAscending(array,start,mid);
        mergeSortAscending(array,mid,end);
        merge(array, start, mid, end);
    }

    public static void main(String[] args) {
        int[] array = {20,35,15,7,55,1,-22};
        System.out.println("Original Array");
        for(int ele: array)
            System.out.print(ele+" ");

        System.out.println("\nAscending Order");
        mergeSortAscending(array,0,array.length);
        for(int ele:array )
            System.out.print(ele+" ");
    }
}
