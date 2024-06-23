package network;
import java.util.List;
import blockchain.Block;
import blockchain.Blockchain;
public class NetworkNode {

	 private Blockchain blockchain;

	    public NetworkNode() {
	        this.blockchain = new Blockchain();
	    }

	    public Blockchain getBlockchain() {
	        return blockchain;
	    }

	    public void broadcastBlock(Block block, List<NetworkNode> nodes) {
	        for (NetworkNode node : nodes) {
	            node.getBlockchain().addBlock(block.getData());
	        }
	    }
}
