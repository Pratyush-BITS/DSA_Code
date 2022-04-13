package HackerEarth_DSA;

import java.util.Scanner;

public class ArrayInversion {

    private static int mergeCountSwaps(int[] array, int start, int mid, int end){

        if(array[mid-1] <= array[mid])
            return 0;

        int i = start;
        int j = mid;
        int tempIndex = 0, swaps =0;

        int[] temp = new int[end-start];
        while (i<mid && j<end) {
            if(array[i] <= array[j])
                temp[tempIndex++] = array[i++];
            else {
                System.out.println(array[i]+" "+array[j]);
                temp[tempIndex++] = array[j++];
                swaps++;
            }
        }

        System.arraycopy(array,i,array,start+tempIndex,mid-i);
        System.arraycopy(temp,0,array,start,tempIndex);
        return swaps;
    }


    public static int calcInversions(int[] array,int start,int end){

        if(end-start < 2)
            return 0;

        int count = 0;
        int mid = (start + end)/2;
        count += calcInversions(array,start,mid);
        count += calcInversions(array,mid,end);
        count += mergeCountSwaps(array, start, mid, end);

        return count;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            System.out.println(calcInversions(arr, 0, n));
        }
//        for (int e : arr)
//            System.out.print(e + " ");

    }

}
