package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicPermutation {

    static boolean isPermutationOfPalindrome(String str){
        int bitVector = createBitVector(str);
        return bitVector == 0 || onlyOneBitSet(bitVector);
    }

    static int createBitVector(String str){
        int bitVector = 0;
        for(char ch : str.toCharArray()){
            int index = ch -'a';
            bitVector = bitToggle(bitVector,index);
        }
        return bitVector;
    }

    static int bitToggle(int bitVector, int index){
        if(index>=0){
            int mask = 1 << index;
            if((bitVector & mask)==0)
                bitVector |= mask;
            else
                bitVector &= ~mask;
        }
        return bitVector;
    }

    static boolean onlyOneBitSet(int bitVector){
        return (bitVector & (bitVector - 1)) == 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String str1 = buff.readLine();
        System.out.println( isPermutationOfPalindrome(str1));
    }
}
