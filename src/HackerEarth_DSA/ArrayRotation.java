package HackerEarth_DSA;

import java.util.Scanner;

public class ArrayRotation {

    //Storing the value at index (i+D)%len in another array
    //Time complexity O(n).  Direction of rotation -> right
    public static int[] RotateLeft(int d, int[] arr, int len) {
       int[] leftRotatedArray = new int[len];
        for(int i=0;i<len;i++)
            leftRotatedArray[i] = arr[(d+i)%len];
        return leftRotatedArray;
    }

    //Storing the value at index (i+D)%len in another array
    //Time complexity O(n).  Direction of rotation <- left
    public static int[] RotateRight(int d, int[] arr,int len) {
        d = len - d%len;
        int[] rightRotateRight = new int[len];
        for(int i=0;i<len;i++)
            rightRotateRight[i] = arr[(d+i)%len];
        return rightRotateRight;
    }

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int len = s.nextInt();
            int rot = len - s.nextInt()%len;
            s.nextLine();
            String[] stArr = s.nextLine().split(" ");
            StringBuffer ans = new StringBuffer();

            for(int i=0;i<len;i++)
                ans.append(stArr[(rot + i) % len]).append(" ");
            System.out.println(ans);

//            Test Case fails -> TLE
//            for (int ele : RotateRight(rot, arr, len))
//                System.out.print(ele + " ");
//            System.out.println();
        }
    }
}
