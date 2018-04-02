import java.util.Arrays;

/**
 *
 * @author antonio
 */
public class Block {
    
    private int previousHash;
    private int blockHash;
    private String[] transactions;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        
        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }    
}
