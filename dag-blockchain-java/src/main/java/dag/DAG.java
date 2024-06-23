package dag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DAG {
	
	private Map<String, DAGTransaction> transactions = new HashMap<>();
    private List<String> transactionOrder = new ArrayList<>();

    public void addTransaction(DAGTransaction transaction) {
        transactions.put(transaction.getId(), transaction);
        transactionOrder.add(transaction.getId());
    }

    public DAGTransaction getTransaction(String id) {
        return transactions.get(id);
    }

    public Map<String, DAGTransaction> getTransactions() {
        return transactions;
    }

    public List<String> getTransactionOrder() {
        return transactionOrder;
    }
}



