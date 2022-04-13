package HelpOthers;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try{
            int a = Integer.parseInt(str);
            System.out.println("True");
        }
        catch (NumberFormatException e){
            System.out.println("False");
        }
    }
}
