package tree;

import visitor.VisitorInterface;

/**
 * Created by Archi on 01.11.2017.
 */
public interface TreeInterface extends Iterable<NodeInterface> {
    void add(int value);
    int count();
    NodeInterface getHeadNode();
    void setVisitor(VisitorInterface visitor);
}
