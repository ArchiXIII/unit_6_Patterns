package algorithms;

import tree.NodeInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Archi on 04.11.2017.
 */
public class BFS {
    private NodeInterface headNode;

    List<NodeInterface> nodes;

    public BFS(NodeInterface headNode){
        this.headNode = headNode;
    }

    public List<NodeInterface> getListNodes(){
        if(headNode == null){
            System.out.println("The tree is empty");
        }else {
            bfsUtil();
        }
        return nodes;
    }

    private void bfsUtil() {
        nodes = new ArrayList<NodeInterface>();
        Queue<NodeInterface> queue = new LinkedList<NodeInterface>();
        queue.add(headNode);
        while (!queue.isEmpty()){
            NodeInterface current = queue.remove();
            nodes.add(current);
            if(current.getLeftNode() != null){
                queue.add(current.getLeftNode());
            }
            if(current.getRightNode() != null){
                queue.add(current.getRightNode());
            }
        }
    }
}
