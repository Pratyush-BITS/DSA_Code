package Algorithms;

public class BubbleSort {

    private void swap(int []arr, int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public int[] bubbleSortAscending(int []arr){
        
        int len = arr.length-1;
        for (int i=len;i>0;i--)
            for (int j = 0; j < len; j++)
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);

        return arr;
    }

    public int[] bubbleSortDescending(int []arr){

        int len = arr.length-1;
        for (int i=len;i>0;i--)
            for (int j = 0; j < len; j++)
                if(arr[j]<arr[j+1])
                    swap(arr,j,j+1);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {20,35,15,7,55,1,-22};
        System.out.println("Original Array");
        for(int ele: arr)
            System.out.print(ele+" ");

        System.out.println("\nAscending Order");
        int []ascSortedArr = new BubbleSort().bubbleSortAscending(arr);
        for(int ele:ascSortedArr )
            System.out.print(ele+" ");

        System.out.println("\nDescending Order");
        int []descSortedArr = new BubbleSort().bubbleSortDescending(arr);
        for(int ele: descSortedArr)
            System.out.print(ele+" ");

    }
}