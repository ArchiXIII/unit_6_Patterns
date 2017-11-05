package visitor;

import algorithms.DFS;
import tree.NodeInterface;

import java.util.List;

/**
 * Created by Archi on 04.11.2017.
 */
public class Visitor implements VisitorInterface{
    public void visit(NodeInterface node) {
        NodeInterface leftNode = node.getLeftNode();
        NodeInterface rightNode = node.getRightNode();
        if(leftNode == null && rightNode == null){
            System.out.println("I found leaf, value " + node.getValue());
        }else {
            System.out.println("I found branch, value " + node.getValue());
        }
    }
}
