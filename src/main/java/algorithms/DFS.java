package algorithms;

import tree.NodeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Archi on 04.11.2017.
 */
public class DFS implements PassStrategyInterface {
    private NodeInterface headNode;

    List<NodeInterface> nodes;

    public void setHeadNode(NodeInterface headNode) {
        this.headNode = headNode;
    }

    public List<NodeInterface> getListNodes(){
        if(headNode == null){
            System.out.println("The tree is empty");
        }else {
            dfsUtil();
        }
        return nodes;
    }

    private void dfsUtil(){
        nodes = new ArrayList<NodeInterface>();
        Stack<NodeInterface> stack = new Stack<NodeInterface>();
        stack.push(headNode);
        while (!stack.isEmpty()){
            NodeInterface current = stack.pop();
            nodes.add(current);
            if (current.getLeftNode() != null) {
                stack.push(current.getLeftNode());
            }
            if (current.getRightNode() != null) {
                stack.push(current.getRightNode());
            }
        }
    }
}
