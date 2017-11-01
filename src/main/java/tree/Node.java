package tree;

/**
 * Created by Archi on 01.11.2017.
 */
public class Node implements NodeInterface, Comparable {
    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value){
        this.value = value;
    }

    public int compareTo(Object o) {
        Node node = (Node)o;
        if(value > node.getValue()){
            return 1;
        }else if(value < node.getValue()){
            return -1;
        }
        return 0;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void printValue() {
        if(leftNode == null && rightNode == null){
            System.out.println("leaf, value " + value);
        }else {
            System.out.println("branch, value " + value);
        }
    }
}
