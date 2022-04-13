package HelpOthers;

public class SpecialPair {

    private static int findPair(int sum,int num1){

        int num2 = num1;
        int sum2;
        do{
            num2++;
            sum2 = findSum(num2);
            System.out.println(num2 +" "+sum2);
        }while (sum != sum2);

        return num2;
    }

    private static int findSum(int a){
        int temp=0;
        while(a>0){
            temp+=a%10;
            a=a/10;
        }
        return temp;
    }

    public static void main(String[] args) {

        int num1 = 10;
        int sumVal = 2*findSum(num1);
        System.out.println(sumVal);
        System.out.println(findPair(sumVal, num1));

    }

}
