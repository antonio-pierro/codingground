import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String []args){
        
        String[] genesisTransaction = {"Satoshi sent 1_000 bitcoin to Antoino"};
        Block genesisBlock = new Block(0, genesisTransaction);
        
        String[] block2Transaction = {"Antoino sent 1 bitcoin to Satoshi"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transaction);
        
        System.out.print("Hash of genesis block: ");
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.print("Hash of block1: ");
        System.out.println(block2.getBlockHash());
    }
}
