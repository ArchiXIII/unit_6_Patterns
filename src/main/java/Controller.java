import tree.Tree;
import tree.TreeInterface;

/**
 * Created by Черный on 02.11.2017.
 */
public class Controller {
    public static void main(String[] args) {
        TreeInterface tree = new Tree();
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(3);
        tree.add(9);
        tree.add(8);

        for (Object element : tree) {
            System.out.println(element);
        }

        Visitor visitor = new Visitor();
        visitor.visitWithDFS(tree.getHeadNode());
        System.out.println();
        visitor.visitWithBFS(tree.getHeadNode());
    }
}
