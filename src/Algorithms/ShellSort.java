package Algorithms;

public class ShellSort {

    public int[] shellSortAscending(int[]array){
        int len = array.length;
        for( int gap = len/2; gap >0;gap/=2){
            for (int i = gap; i <len ; i++) {
                int temp = array[i];
                int j =i;
                while(j>=gap && array[j-gap]>temp){
                    array[j]= array[j-gap];
                    j-=gap;
                }
                array[j] = temp;
            }
        }
        return array;
    }

    public int[] shellSortDescending(int[]array){
        int len = array.length;
        for( int gap = len/2; gap >0;gap/=2){
            for (int i = gap; i <len ; i++) {
                int temp = array[i];
                int j =i;
                while(j>=gap && array[j-gap]<temp){
                    array[j]= array[j-gap];
                    j-=gap;
                }
                array[j] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] arr = {20,35,15,7,55,1,-22};
        System.out.println("Original Array");
        for(int ele: arr)
            System.out.print(ele+" ");

        System.out.println("\nAscending Order");
        int []ascSortedArr = new ShellSort().shellSortAscending(arr);
        for(int ele:ascSortedArr )
            System.out.print(ele+" ");

        System.out.println("\nDescending Order");
        int []descSortedArr = new ShellSort().shellSortDescending(arr);
        for(int ele:descSortedArr )
            System.out.print(ele+" ");
    }
}
