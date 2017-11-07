import algorithms.DFS;
import algorithms.PassStrategyInterface;
import tree.NodeInterface;
import tree.TreeInterface;
import visitor.Visitor;

import java.util.List;

/**
 * Created by Archi on 05.11.2017.
 */
public class Client {
    public void byPass(TreeInterface tree){
        tree.setVisitor(new Visitor());

        PassStrategyInterface dfs = new DFS();
        dfs.setHeadNode(tree.getHeadNode());
        List<NodeInterface> nodes = dfs.getListNodes();
        for (NodeInterface node : nodes) {
            node.visit();
        }
    }
}
