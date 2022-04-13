package HelpOthers;
// Convert Decimal to Binary in reverse
public class DecBinRev {
    private static void decbinrev(int a){
        System.out.println(new StringBuffer(Integer.toBinaryString(a)).reverse());
    }

    public static void main(String[] args) {
        int a =8;
        decbinrev(a);
    }

}
