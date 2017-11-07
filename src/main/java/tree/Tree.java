package tree;

import algorithms.BFS;
import algorithms.PassStrategyInterface;
import visitor.VisitorInterface;

import java.util.*;

/**
 * Created by Archi on 01.11.2017.
 */
public class Tree implements TreeInterface {
    private Node headNode;

    private int countNods = 0;

    private PassStrategyInterface strategy;

    public Tree(){
        this.strategy = new BFS();
    }

    public Tree(PassStrategyInterface strategy){
        this.strategy = strategy;
    }

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

    public Node getHeadNode(){
        return headNode;
    }

    public int count() {
        return countNods;
    }

    public Iterator<NodeInterface> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<NodeInterface> {
        int cursor;
        int lastRet = -1;

        public boolean hasNext() {
            return cursor != countNods;
        }

        public NodeInterface next() {
            int i = cursor;
            if (i >= countNods)
                throw new NoSuchElementException();

            List<NodeInterface> elementData = new ArrayList<NodeInterface>();
            fillAnList(elementData);
            if (i >= elementData.size()) {
                throw new ConcurrentModificationException();
            }
            cursor = i + 1;
            return elementData.get(lastRet = i);
        }

        private void fillAnList(List<NodeInterface> elementData){
            strategy.setHeadNode(headNode);
            elementData.addAll(strategy.getListNodes());
        }

        public void remove() {

        }
    }

    public void setVisitor(VisitorInterface visitor) {
        for (NodeInterface element : this) {
            element.setVisitor(visitor);
        }
    }
}
