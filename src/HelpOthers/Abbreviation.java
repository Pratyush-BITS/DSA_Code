package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abbreviation {


    static String abbreviation(String a, String b) {
        int lenA = a.length(), lenB=b.length();
        boolean[][] checker = new boolean[lenA+1][lenB+1];

        checker[0][0] = true;
        for (int i=1; i<=lenA; i++)
            checker[i][0] = (checker[i-1][0] && Character.isLowerCase(a.charAt(i-1)));

        for (int i=1; i<=lenA; i++) {
            for (int j = 1; j <= lenB; j++) {
                boolean check1 = checker[i - 1][j - 1] && Character.toUpperCase(a.charAt(i - 1)) == b.charAt(j - 1);
                boolean check2 = checker[i - 1][j] && Character.isLowerCase(a.charAt(i - 1));
                checker[i][j] = (check1 || check2);
            }
        }
        return (checker[lenA][lenB]) ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String a = buff.readLine();
        String b = buff.readLine();
        System.out.println(abbreviation(a,b));

    }

}
