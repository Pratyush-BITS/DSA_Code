package HelpOthers;

public class Kata {
    public static int countBits(int n){

        return Integer.bitCount(n);


    }

    public static void main(String[] args) {
        System.out.println(countBits(1234)==5);
        System.out.println(1==countBits(4));
        System.out.println(3==countBits(7));
        System.out.println(2==countBits(9));
        System.out.println(2==countBits(10));

    }
}