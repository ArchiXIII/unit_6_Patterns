package algorithms;

import tree.NodeInterface;

import java.util.List;

/**
 * Created by Archi on 04.11.2017.
 */
public interface PassStrategyInterface {
    public List<NodeInterface> getListNodes();
    void setHeadNode(NodeInterface headNode);
}
