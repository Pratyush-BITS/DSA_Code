package Encryption_Decryption;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.*;

public class Encryption {

    Encryption(File myObj, String key) throws NoSuchPaddingException, NoSuchAlgorithmException, IOException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        RSA_Encryption(myObj);
        AES_Encryption(key,"RSA_encFile","Final_encrypted_File");
    }

    private void RSA_Encryption(File myObj) throws NoSuchAlgorithmException, IOException, NoSuchPaddingException, InvalidKeyException {

        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(2048);
        KeyPair kp = kpg.generateKeyPair();
        PublicKey pub = kp.getPublic();
        PrivateKey pvt= kp.getPrivate();

        try (FileOutputStream out = new FileOutputStream("private" + ".key")) {
            out.write(pvt.getEncoded());
        }

        try (FileOutputStream out = new FileOutputStream("public" + ".pub")) {
            out.write(pub.getEncoded());
        }

        Cipher ci = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        ci.init(Cipher.ENCRYPT_MODE, pvt);
        try (FileInputStream in = new FileInputStream(myObj);
             FileOutputStream out = new FileOutputStream("RSA_encFile")) {
            new ProcessFile(ci, in, out);
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
    }

    private void AES_Encryption(String secretKey, String fileInputPath, String fileOutPath) throws NoSuchAlgorithmException, NoSuchPaddingException,
            InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException {

        var key = new SecretKeySpec(secretKey.getBytes(), "AES");
        var cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        var fileInput = new File(fileInputPath);
        var inputStream = new FileInputStream(fileInput);
        var inputBytes = new byte[(int) fileInput.length()];
        inputStream.read(inputBytes);

        var outputBytes = cipher.doFinal(inputBytes);

        var fileEncryptOut = new File(fileOutPath);
        var outputStream = new FileOutputStream(fileEncryptOut);
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }

}
