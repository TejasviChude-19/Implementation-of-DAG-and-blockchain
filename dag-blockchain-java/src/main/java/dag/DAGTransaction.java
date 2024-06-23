package dag;
import java.util.List;
import java.util.UUID;
public class DAGTransaction {
	  private String id;
	    private List<String> parents;

	    public DAGTransaction(List<String> parents) {
	        this.id = UUID.randomUUID().toString();
	        this.parents = parents;
	    }                                  //constructor

	    public String getId() {
	        return id;
	    }

	    public List<String> getParents() {
	        return parents;
	    }
	}


