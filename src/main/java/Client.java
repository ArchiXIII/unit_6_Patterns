import algorithms.DFS;
import algorithms.PassStrategyInterface;
import tree.NodeInterface;

import java.util.List;

/**
 * Created by Archi on 05.11.2017.
 */
public class Client {
    public void byPass(NodeInterface headNode){
        PassStrategyInterface dfs = new DFS();
        dfs.setHeadNode(headNode);
        List<NodeInterface> nodes = dfs.getListNodes();
        for (NodeInterface node : nodes) {
            node.visit();
        }
    }
}
