import tree.NodeInterface;

/**
 * Created by Archi on 04.11.2017.
 */
public interface VisitorInterface {
    void visitWithDFS(NodeInterface node);
    void visitWithBFS(NodeInterface node);
}
