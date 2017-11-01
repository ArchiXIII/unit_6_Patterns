package tree;

/**
 * Created by Archi on 01.11.2017.
 */
public interface NodeInterface {
    Node getLeftNode();

    void setLeftNode(Node leftNode);

    Node getRightNode();

    void setRightNode(Node rightNode);

    int getValue();

    void printValue();
}
