package HelpOthers;

public class DuplicateZeros {

    static void duplicateZeros(int[] arr) {

        int n = arr.length - 1;
        int skips = 0;

        for (int i = 0; i <= n - skips ; i++) {

            if(arr[i] == 0){
                if(i == n - skips) {
                    arr[n--] = 0;
                    break;
                }
                skips++;
            }
        }


        for(int pos = n - skips; pos>=0;){
            arr[n--] = arr[pos];

            if(arr[pos--]==0)
                arr[n--]=0;

        }

        for (int a:arr) {
            System.out.print(a+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr= {0,8,0,1,4,0,0,7,1};
        int[] arr1= {0,8,0,1,4,0,0,7,1};
        for (int a:arr) {
            System.out.print(a+" ");
        }
        System.out.println();
        duplicateZeros(arr);

    }

}
