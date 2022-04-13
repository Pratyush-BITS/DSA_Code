package HelpOthers;

public class ArrayPermutation {

    static String findMax(int[] arr){

        java.util.ArrayList<String> ch = new java.util.ArrayList<>();
        for(int a:arr){
            while (a>0){
                ch.add(Integer.toString(a%10));
                a=a/10;
            }
        }

        java.util.Collections.sort(ch);

        StringBuffer sb = new StringBuffer();
        for (int i = ch.size()-1; i >=0; i--) {
            sb.append(ch.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(findMax(new int[]{21,90,23}));

    }

}
