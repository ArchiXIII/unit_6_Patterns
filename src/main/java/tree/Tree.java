package tree;

import java.util.*;

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

    public Node getHeadNode(){
        return headNode;
    }

    public int count() {
        return countNods;
    }

    public Iterator<Integer> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Integer> {
        int cursor;       // index of next element to return
        int lastRet = -1;

        public boolean hasNext() {
            return cursor != countNods;
        }

        public Integer next() {
            int i = cursor;
            if (i >= countNods)
                throw new NoSuchElementException();

            Integer[] elementData = new Integer[countNods];
            fillAnArray(elementData);
            if (i >= elementData.length) {
                throw new ConcurrentModificationException();
            }
            cursor = i + 1;
            return elementData[lastRet = i];
        }

        private void fillAnArray(Integer[] elementData){
            Stack<Node> stack = new Stack<Node>();
            stack.push(headNode);
            int index = 0;
            while (!stack.isEmpty()){
                Node current = stack.pop();
                elementData[index++] = current.getValue();
                if (current.getLeftNode() != null) {
                    stack.push(current.getLeftNode());
                }
                if (current.getRightNode() != null) {
                    stack.push(current.getRightNode());
                }
            }
        }

        public void remove() {

        }
    }
}
