package HelpOthers;

public class MoveZeros {

    static void moveZeros(int[] nums){

        int a = 0;
        int b = 1;

        for(; a < nums.length; a++,b++){
            if(nums[a]==0) {
                while (b <nums.length && nums[b] == 0) b++;
                if(b < nums.length) {
                    nums[a] = nums[b];
                    nums[b] = 0;
                }
            }
        }

        for(int e: nums)
            System.out.print(e+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int []arr1 = {2,0,4,0,5,6,0,0};
        moveZeros(arr);
        moveZeros(arr1);
        System.out.println(4 & 1);
    }

}
