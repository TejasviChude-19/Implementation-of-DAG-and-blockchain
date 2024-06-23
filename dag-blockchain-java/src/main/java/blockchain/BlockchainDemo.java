package blockchain;
import java.util.ArrayList;
import java.util.List;
public class BlockchainDemo {
	
	public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();

        // Add blocks to the blockchain
        List<String> data1 = new ArrayList<>();
        data1.add("First Block Data");
        blockchain.addBlock(data1);

        List<String> data2 = new ArrayList<>();
        data2.add("Second Block Data");
        blockchain.addBlock(data2);

        // Print the blockchain
        for (Block block : blockchain.getChain()) {
            System.out.println("Block Index: " + block.getIndex());
            System.out.println("Previous Hash: " + block.getPreviousHash());
            System.out.println("Timestamp: " + block.getTimestamp());
            System.out.println("Data: " + block.getData());
            System.out.println("Hash: " + block.getHash());
            System.out.println();
        }
    }

}
