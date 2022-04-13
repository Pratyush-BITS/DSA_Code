package Encryption_Decryption;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException {

        try {
            var myObj = new File("webex.txt");
            Scanner myReader = new Scanner(myObj);
            String key = "5363456357842357";

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                new Encryption(myObj,key);

            }
            System.out.println("Encryption Done");

            var encObj = new File("Final_encrypted_File");
            myReader = new Scanner(encObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println("data"+data);
                new Decryption(key);

            }
            System.out.println("Decryption done");

            myReader.close();
        }
        catch (FileNotFoundException | InvalidKeySpecException e) {
            System.out.println(e.getMessage());
        }

    }

}
