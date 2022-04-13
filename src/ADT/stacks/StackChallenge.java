package ADT.stacks;

import java.util.Scanner;
import java.util.Stack;

public class StackChallenge {

    static boolean isPalindrome(String str){

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(str.length());
        for(Character a:str.toCharArray())
            if(a>='a' && a<='z'){
                sb.append(a);
                stack.push(a);
            }

        for(int i = 0; i<sb.length();i++)
            if(sb.charAt(i)!=stack.pop())
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        System.out.println(isPalindrome(str));
    }
}