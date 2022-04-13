package HelpOthers;

public class UniqueAlphabets {

    static boolean isUnique(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = 1 << (str.charAt(i)-'a');
            if((checker & val) > 0) {
                System.out.println(str.charAt(i));
                return false;
            }
            checker |= val;
            System.out.println("updated checker ="+ checker);
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "zyxabcdefghijklmnopqrstuvw";
        System.out.println(isUnique(str));
        int val =1;
    }
}