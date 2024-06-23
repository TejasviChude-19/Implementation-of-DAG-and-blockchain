package dag;
import java.util.ArrayList;
import java.util.List;
public class DAGConsensus {
	 public static void main(String[] args) {
	        DAG dag = new DAG();

	        // Genesis transaction
	        DAGTransaction genesis = new DAGTransaction(new ArrayList<>());
	        dag.addTransaction(genesis);

	        // New transaction pointing to genesis
	        List<String> parents1 = new ArrayList<>();
	        parents1.add(genesis.getId());
	        DAGTransaction tx1 = new DAGTransaction(parents1);
	        dag.addTransaction(tx1);

	        // New transaction pointing to tx1
	        List<String> parents2 = new ArrayList<>();
	        parents2.add(tx1.getId());
	        DAGTransaction tx2 = new DAGTransaction(parents2);
	        dag.addTransaction(tx2);

	        // Print the DAG in order of addition
	        for (String transactionId : dag.getTransactionOrder()) {
	            DAGTransaction transaction = dag.getTransaction(transactionId);
	            System.out.println("Transaction ID: " + transaction.getId() + ", Parents: " + transaction.getParents());
	        }
	    }
}
