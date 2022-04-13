package HelpOthers;

public class mergeTwoSortedArrays {

    static void mergeArrays(int []nums1, int []nums2,int m, int n){

        if(n>0) {
            if (m==0)
                System.arraycopy(nums2, 0, nums1, 0, n);

            int p1 = m-1;
            int p2 = n - 1;
            m+=n;

            while (p2 >= 0 && p1 >=0) {
                if (nums2[p2] >= nums1[p1]) {
                    nums1[--m] = nums2[p2--];
                } else
                    nums1[--m] = nums1[p1--];
            }
            while (p2>=0){
                nums1[--m] = nums2[p2--];
            }
        }

    }

    public static void main(String[] args) {

        final int []arr1 = {0,0,3,0,0,0,0,0,0};
        int m = 3;
        final int []arr2 = {-1,1,1,1,2,3};
        int n = 6;
        mergeArrays(arr1,arr2, m, n);
        for(int ele : arr1)
            System.out.print(ele+" ");
    }
}
