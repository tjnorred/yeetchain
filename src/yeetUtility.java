import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/*
 * Class to generate a secure hash
 * using the SHA256 algorithm.
 * https://www.baeldung.com/sha-256-hashing-java
 */
public class yeetUtility {

    // Apply SHA-256 to a string and return the result
    public static String hashIt(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            //byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer(); // hash in hex
            for(int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString(); // return hash as a string
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
