package tree;

/**
 * Created by Archi on 01.11.2017.
 */
public interface NodeInterface {
    NodeInterface getLeftNode();

    void setLeftNode(NodeInterface leftNode);

    NodeInterface getRightNode();

    void setRightNode(NodeInterface rightNode);

    int getValue();

    void printInfo();
}
