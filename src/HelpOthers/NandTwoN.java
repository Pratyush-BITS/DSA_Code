package HelpOthers;

public class NandTwoN {

    static int[] replaceElements(int[] arr) {
        int temp, max = -1;

        for (int i = arr.length-1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            if(temp > max)
                max = temp;
        }

        return arr;
    }

    static boolean valley(int[] arr){

        int i =1;
        boolean change = false;
        if(arr.length != 2) {
            for (; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    change = true;
                    break;
                }
            }
            for (; change && i < arr.length; i++) {
                if (arr[i] >= arr[i - 1]) {
                    change = false;
                    break;
                }
            }
        }

        return change && i == arr.length;
    }

    static boolean checkIfExist(int[] arr) {

        boolean[] chk = new boolean[2001];
        for(int i : arr){
            if(2*i>-1001 && 2*i<1001 && chk[(2*i) + 1000]) return true;
            if(i%2==0 && chk[(i/2) + 1000]) return true;
            chk[i+1000]=true;
        }
        return false;
    }

    public static void main(String[] args) {
        int []arr = {17,18,5,4,6,1};
        for(int ele : (replaceElements(arr)))
            System.out.print(ele+" ");
    }

}
