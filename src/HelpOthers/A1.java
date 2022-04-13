package HelpOthers;

public class A1 {

    //swapping function
    static void swap(int []arr, int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    //soring using bubble sort
    static int[] sort(int []arr){

        int len = arr.length-1;
        int[] out = new int[len +1];

        for (int i = 0; i <= len; i++)
            out[i] = arr[i];

        for (int i=len;i>0;i--)
            for (int j = 0; j < i; j++)
                if(out[j]>out[j+1])
                    swap(out,j,j+1);

        return out;
    }

    //function to print the array
    static void printArray(int[] arr){

        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println('\n');
    }

    //printing the output using element of array B as index for array A
    static void printFinalOutput(int[] A, int[] B){

        System.out.print("The output of array A based on the order specified in array B: [ ");
        for(int index : B)
            System.out.print(A[index-1]+" ");
        System.out.println("]\n");
    }

    //Algorithm 1
    static void algorithm1(int[] A, int[] B){

        int[] sortedA = sort(A);
        int[] sortedB =sort(B);

        System.out.print("Content of array A: ");
        printArray(sortedA);

        System.out.print("Content of array B: ");
        printArray(sortedB);

        printFinalOutput(sortedA,sortedB);
    }

    //algorithm2
    static void algorithm2(int[] A, int[] B){

        int[] sortedA = sort(A);

        System.out.print("Content of array A: ");
        printArray(sortedA);

        System.out.print("Content of array B: ");
        printArray(B);

        printFinalOutput(sortedA,B);
    }

    public static void main (String [] args){

            //Declare arrays
        int[] A = {7,3,8,21,5,11};
        int[] B = {3, 5, 1};

            //Display array
        System.out.println ("=== main ===");
        System.out.println ("=== readDatafile ===");
        System.out.println ("filename:TestDataForPart2.dat\n");

        System.out.print("Content of array A: ");
        printArray(A);

        System.out.print("Content of array B: ");
        printArray(B);

        System.out.println("========== Algorithm 1 ==========\n");
        algorithm1(A, B);

        System.out.println("========== Algorithm 2 ==========\n");
        algorithm2(A,B);

    }
}