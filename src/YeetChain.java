import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class YeetChain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>(); // Create a new array to store our blocks

    public static void main(String[] args) {

        // Add blocks to the array
        blockchain.add(new Block("A genesis block is the first block in a blockchain", "0"));
        blockchain.add(new Block("This is the second block of my blockchain", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("Tres Commas like Russ Hanneman", blockchain.get(blockchain.size()-1).hash));

        String chainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(chainJson);
    }
}
