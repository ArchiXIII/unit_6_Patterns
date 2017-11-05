import algorithms.DFS;
import tree.Tree;
import tree.TreeInterface;
import visitor.Visitor;

/**
 * Created by Черный on 02.11.2017.
 */
public class Controller {
    public static void main(String[] args) {
        TreeInterface tree = new Tree(new DFS());  //or without parameters
        tree.setVisitor(new Visitor());
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(3);
        tree.add(9);
        tree.add(8);

        for (Object element : tree) {
            System.out.println(element);
        }
        System.out.println();

        Client client = new Client();
        client.byPass(tree.getHeadNode());
    }
}
