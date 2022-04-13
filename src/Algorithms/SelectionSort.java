package Algorithms;

public class SelectionSort {

    private void swap(int []arr, int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public int[] selectionSortAscending(int[]arr){

        int len = arr.length-1;

        for (int i = len; i > 0 ; i--) {
            int largestIndex = 0;
            for (int j = 1; j <= i ; j++) {
                if(arr[j] > arr[largestIndex] )
                    largestIndex = j;
            }
            swap(arr,largestIndex,i);
        }
        return arr;
    }
    
    public int[] selectionSortDescending(int[]arr){

        int len = arr.length-1;

        for (int i = len; i > 0 ; i--) {
            int largestIndex = 0;
            for (int j = 1; j <= i ; j++) {
                if(arr[j] < arr[largestIndex])
                    largestIndex = j;
            }
            swap(arr,largestIndex,i);
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {20,35,15,7,55,1,-22};
        System.out.println("Original Array");
        for(int ele: arr)
            System.out.print(ele+" ");

        System.out.println("\nDescending Order");
        int []ascSortedArr = new SelectionSort().selectionSortAscending(arr);
        for(int ele:ascSortedArr )
            System.out.print(ele+" ");

        System.out.println("\nDescending Order");
        int []descSortedArr = new SelectionSort().selectionSortDescending(arr);
        for(int ele:descSortedArr )
            System.out.print(ele+" ");

    }
}