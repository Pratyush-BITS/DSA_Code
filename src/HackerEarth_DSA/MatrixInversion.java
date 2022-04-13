package HackerEarth_DSA;

import java.util.Scanner;

public class MatrixInversion {

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

        while (t-- > 0) {
            int n = s.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = s.nextInt();

            int count = 0;
//            int[] temp = new int[n];
//            for (int i = 0; i < n; i++) {
//                System.arraycopy(arr[i], 0, temp, 0, n);
//                count += (calcInversions(temp, 0, n));
//            }
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++)
//                    temp[j] = arr[j][i];
//                System.arraycopy(arr[i], 0, temp, 0, n);
//                count += (calcInversions(temp, 0, n));
//            }

            for(int i=0;i<n;++i)
                for(int j=0;j<n;++j)
                    for(int x=i;x<n;++x)
                        for(int y=j;y<n;++y)
                            if(arr[x][y]<arr[i][j]) {
                                count++;
                                System.out.println(arr[x][y]+" "+arr[i][j]);
                            }

            System.out.println(count);

        }
    }

}
