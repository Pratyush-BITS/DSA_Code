package Algorithms;

public class InsertionSort {

    /**
     * @param array > The array can have only integer array
     *
     * Sorts the array in Ascending order.
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     * @return array
     */

    public int[] insertionSortAscending(int []array){
        int len = array.length;
        for(int i = 1; i< len; i++){
            int temp = array[i];
            int j;
            for (j = i; j > 0 && temp<array[j-1]; j--)
                array[j] = array[j-1];

            array[j] = temp;
        }
        return array;
    }

    /**
     * @param array > The array can have only integer array
     *
     * Sorts the array in Descending order.
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     * @return array
     */

    public int[] insertionSortDescending(int []array){
        int len = array.length;
        for(int i = 1;i< len;i++){
            int temp = array[i];
            int j;

            for (j = i; j > 0 && temp>array[j-1]; j--)
                array[j] = array[j-1];

            array[j] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {20,35,15,7,55,1,-22};
        System.out.println("Original Array");
        for(int ele: arr)
            System.out.print(ele+" ");

        System.out.println("\nAscending Order");
        int []ascSortedArr = new InsertionSort().insertionSortAscending(arr);
        for(int ele:ascSortedArr )
            System.out.print(ele+" ");

        System.out.println("\nDescending Order");
        int []descSortedArr = new InsertionSort().insertionSortDescending(arr);
        for(int ele:descSortedArr )
            System.out.print(ele+" ");
    }

}
