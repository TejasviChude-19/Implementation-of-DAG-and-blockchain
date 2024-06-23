package blockchain;
import java.util.List;
public class Block {
	 private int index;
	    private String previousHash;
	    private long timestamp;
	    private List<String> data;
	    private String hash;

	    public Block(int index, String previousHash, long timestamp, List<String> data, String hash) {
	        this.index = index;
	        this.previousHash = previousHash;
	        this.timestamp = timestamp;
	        this.data = data;
	        this.hash = hash;
	    }

	    public int getIndex() {
	        return index;
	    }

	    public String getPreviousHash() {
	        return previousHash;
	    }

	    public long getTimestamp() {
	        return timestamp;
	    }

	    public List<String> getData() {
	        return data;
	    }

	    public String getHash() {
	        return hash;
	    }
}
