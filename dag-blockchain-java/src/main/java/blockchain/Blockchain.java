package blockchain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Blockchain {
	
	 private List<Block> chain;

	    public Blockchain() {
	        chain = new ArrayList<>();
	        // Create genesis block
	        chain.add(createGenesisBlock());
	    }

	    private Block createGenesisBlock() {
	        List<String> data = new ArrayList<>();
	        data.add("Genesis Block");
	        return new Block(0, "0", new Date().getTime(), data, calculateHash(0, "0", new Date().getTime(), data));
	    }

	    private String calculateHash(int index, String previousHash, long timestamp, List<String> data) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(index);
	        sb.append(previousHash);
	        sb.append(timestamp);
	        for (String datum : data) {
	            sb.append(datum);
	        }
	        return Integer.toString(sb.toString().hashCode());
	    }

	    public Block getLatestBlock() {
	        return chain.get(chain.size() - 1);
	    }

	    public void addBlock(List<String> data) {
	        Block previousBlock = getLatestBlock();
	        int newIndex = previousBlock.getIndex() + 1;
	        long newTimestamp = new Date().getTime();
	        String newHash = calculateHash(newIndex, previousBlock.getHash(), newTimestamp, data);
	        Block newBlock = new Block(newIndex, previousBlock.getHash(), newTimestamp, data, newHash);
	        chain.add(newBlock);
	    }

	    public List<Block> getChain() {
	        return chain;
	    }
}
