package HelpOthers;

public class sortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {1,5,2,3,4,2};
        int f = 2;
        int a = 0;
        int b = nums.length-1;

        while(a<b){
            while(a<nums.length && (nums[a] & 1) == 0)a++;
            while(b>=0 && (nums[b] & 1) == 1)b--;
            if(a<b) {
                int tem = nums[a];
                nums[a] = nums[b];
                nums[b] = tem;
            }
        }
        for(int e: nums)
            System.out.print(e+" ");

    }
}
