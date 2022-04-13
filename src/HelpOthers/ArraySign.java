package HelpOthers;

public class ArraySign {

    static int arraySign(int[] nums) {
        int neg =0;
        for (int num : nums) {
            if (num < 0) neg--;
            else if (num == 0) return 0;
        }
        return (neg % 2 == 0) ? 1 : -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,3,-4,3,2,1};
        System.out.println(arraySign(nums));
    }
}
