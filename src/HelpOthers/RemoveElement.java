package HelpOthers;

public class RemoveElement {

    private static final int[] nums = new int[]{0,1,2,2,3,0,4,2};
    static int removeElement(int[] nums, int val) {
        int s = 0,a;
        for (int i = 0; i < nums.length; i++) {
            if((a = nums[i]) != val){
                nums[s] = a;
                s++;
            }
        }
        return s;
    }


    public static void main(String[] args) {

        int val = 2;
        System.out.println(removeElement(nums,val));
        for(int ele : nums)
            System.out.print(ele+" ");
    }

}
