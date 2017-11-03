package tree;

/**
 * Created by Archi on 01.11.2017.
 */
public class Node implements NodeInterface, Comparable<Node> {
    private Node leftNode;
    private Node rightNode;
    private int value;

    public Node(int value){
        this.value = value;
    }

    public int compareTo(Node o) {
        if(value > o.getValue()){
            return 1;
        }else if(value < o.getValue()){
            return -1;
        }
        return 0;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(NodeInterface leftNode) {
        this.leftNode = (Node) leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(NodeInterface rightNode) {
        this.rightNode = (Node) rightNode;
    }

    public int getValue() {
        return value;
    }

    public void printInfo() {
        if(leftNode == null && rightNode == null){
            System.out.println("leaf, value " + value);
        }else {
            System.out.println("branch, value " + value);
        }
    }
}
