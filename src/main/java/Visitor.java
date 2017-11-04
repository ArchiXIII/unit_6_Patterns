import algorithms.DFS;
import tree.NodeInterface;

import java.util.List;

/**
 * Created by Archi on 04.11.2017.
 */
public class Visitor implements VisitorInterface{
    List<NodeInterface> nodes;

    public void visitGraph(NodeInterface headNode) {
        DFS dfs = new DFS();
        dfs.setHeadNode(headNode);
        nodes = dfs.getListNodes();
        passByList();
    }

    private void passByList(){
        if(nodes.size() == 0){
            System.out.println("The tree is empty");
        }else {
            for (int i = 0; i < nodes.size(); i++){
                NodeInterface current = nodes.get(i);
                NodeInterface leftNode = current.getLeftNode();
                NodeInterface rightNode = current.getRightNode();
                if(leftNode == null && rightNode == null){
                    System.out.println("I found leaf, value " + current.getValue());
                }else {
                    System.out.println("I found branch, value " + current.getValue());
                }
            }
        }
    }
}
