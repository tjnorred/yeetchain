import java.util.Date;

public class Block {
    public String hash; // Digital signature
    public String prevHash; // previous block's digital signature
    private String data; // the data of the block
    private long timeStamp; // Track the time

    // Constructor
    public Block(String data, String prevHash) {
        this.data = data;
        this.prevHash = prevHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = yeetUtility.hashIt(
                prevHash + Long.toString(timeStamp) + data);
        return calculatedhash;
    }
}

