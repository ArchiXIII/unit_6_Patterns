import tree.Tree;

/**
 * Created by Черный on 02.11.2017.
 */
public class Controller {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(3);
        tree.add(9);
        tree.add(8);

        tree.dfs(5);
        tree.bfs(9);

        for (Object element : tree) {
            System.out.println(element);
        }

        tree.passByTree();
    }
}
