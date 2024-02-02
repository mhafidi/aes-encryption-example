package org.example;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class AES128Encryption
{
    public static void main(String[] args) {
        try {
            // Convert hexadecimal key and plaintext to byte arrays
            String hexKey = args[0]; // Replace with your hexadecimal key
            String hexValueToEncrypt = args[1]; // Replace with your hexadecimal value

            byte[] keyBytes = DatatypeConverter.parseHexBinary(hexKey);
            byte[] valueToEncryptBytes = DatatypeConverter.parseHexBinary(hexValueToEncrypt);

            // Create a SecretKeySpec for the AES key
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");

            // Initialize the AES cipher in encryption mode
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding"); // You can change the mode and padding as needed

            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            // Perform the encryption
            byte[] encryptedBytes = cipher.doFinal(valueToEncryptBytes);

            // Convert the encrypted bytes to hexadecimal
            String encryptedHex = DatatypeConverter.printHexBinary(encryptedBytes);

            System.out.println("AES-128 Encryption Result: " + encryptedHex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

