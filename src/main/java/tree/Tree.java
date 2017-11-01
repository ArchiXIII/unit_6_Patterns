package tree;

import javafx.util.Pair;

import java.util.Stack;

/**
 * Created by Archi on 01.11.2017.
 */
public class Tree implements TreeInterface {
    private Node headNode;

    private int countNods = 0;

    public void add(int value) {
        if(headNode == null){
            headNode = new Node(value);
            countNods++;
        }else {
            addTo(headNode, new Node(value));
        }
    }

    private void addTo(Node node, Node newNode){
        if(newNode.compareTo(node) < 0){
            Node left = node.getLeftNode();
            if (left == null) {
                node.setLeftNode(newNode);
            } else {
                addTo(left, newNode);
            }
        }else {
            Node right = node.getRightNode();
            if (right == null) {
                node.setRightNode(newNode);
            } else {
                addTo(right, newNode);
            }
        }
    }

    /*public void dfs(int value){
        dfsUtil(headNode, new Node(value));
    }

    private void dfsUtil(Node headNode, Node node){
        Stack<Pair<Boolean, Node>> path = new Stack<Pair<Boolean, Node>>();

        path.push(new Pair<Boolean, Node>(true, headNode));
        while (!path.isEmpty()){
            Pair<Boolean, Node> element = path.pop();
        }
    }*/

    public int count() {
        return countNods;
    }
}
