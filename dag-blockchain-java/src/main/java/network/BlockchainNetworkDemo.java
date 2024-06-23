package network;
import java.util.ArrayList;
import java.util.List;

import blockchain.Block;
public class BlockchainNetworkDemo {
	 public static void main(String[] args) {
	        // Create nodes
	        NetworkNode node1 = new NetworkNode();
	        NetworkNode node2 = new NetworkNode();
	        NetworkNode node3 = new NetworkNode();

	        // Add nodes to the network
	        List<NetworkNode> nodes = new ArrayList<>();
	        nodes.add(node1);
	        nodes.add(node2);
	        nodes.add(node3);

	        // Create and add a block to the blockchain of node1
	        List<String> data1 = new ArrayList<>();
	        data1.add("First Block Data");
	        node1.getBlockchain().addBlock(data1);

	        // Broadcast the block to other nodes
	        Block latestBlock = node1.getBlockchain().getLatestBlock();
	        node1.broadcastBlock(latestBlock, nodes);

	        // Print the blockchains of all nodes
	        for (NetworkNode node : nodes) {
	            System.out.println("Blockchain of node: ");
	            for (Block block : node.getBlockchain().getChain()) {
	                System.out.println("Block Index: " + block.getIndex());
	                System.out.println("Previous Hash: " + block.getPreviousHash());
	                System.out.println("Timestamp: " + block.getTimestamp());
	                System.out.println("Data: " + block.getData());
	                System.out.println("Hash: " + block.getHash());
	                System.out.println();
	            }
	        }
	    } 
}
