package tree;

/**
 * Created by Archi on 01.11.2017.
 */
public interface TreeInterface extends Iterable {
    void add(int value);
    int count();
    NodeInterface getHeadNode();
}
