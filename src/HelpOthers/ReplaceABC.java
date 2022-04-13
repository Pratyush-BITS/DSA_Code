package HelpOthers;

public class ReplaceABC {

    static String replace(String a){

        StringBuffer sb = new StringBuffer();
        int count=0;
        for(int i=0;i<a.length();i++){

            if(a.charAt(i)=='.') {
                count++;
                if(count % 2 == 1)
                    sb.append(".abc.");
            }
            else if(count%2==0)
                sb.append(a.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String a = "I.like.this.program.very.much";
        System.out.println(replace(a));
    }
}
