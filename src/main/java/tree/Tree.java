package tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Archi on 01.11.2017.
 */
public class Tree implements TreeInterface, Iterable {
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
                countNods++;
            } else {
                addTo(left, newNode);
            }
        }else {
            Node right = node.getRightNode();
            if (right == null) {
                node.setRightNode(newNode);
                countNods++;
            } else {
                addTo(right, newNode);
            }
        }
    }

    public void dfs(int value){
        if(headNode == null){
            System.out.println("The tree is empty");
        }else {
            dfsUtil(new Node(value));
        }
    }

    private void dfsUtil(Node newNod){
        Stack<Node> stack = new Stack<Node>();
        stack.push(headNode);
        while (!stack.isEmpty()){
            Node current = stack.pop();
            if(current.compareTo(newNod) == 0){
                System.out.println("Found the value!");
            }
            if (current.getLeftNode() != null) {
                stack.push(current.getLeftNode());
            }
            if (current.getRightNode() != null) {
                stack.push(current.getRightNode());
            }
        }
    }

    public void bfs(int value){
        if(headNode == null){
            System.out.println("The tree is empty");
        }else {
            bfsUtil(new Node(value));
        }
    }

    private void bfsUtil(Node newNode) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(headNode);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            if(node.compareTo(newNode) == 0){
                System.out.println("Found the value!");
            }
            if(node.getLeftNode() != null){
                queue.add(node.getLeftNode());
            }
            if(node.getRightNode() != null){
                queue.add(node.getRightNode());
            }
        }
    }

    public int count() {
        return countNods;
    }

    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<NodeInterface> {

        public boolean hasNext() {
            return false;
        }

        public NodeInterface next() {
            return null;
        }

        public void remove() {

        }
    }
}
