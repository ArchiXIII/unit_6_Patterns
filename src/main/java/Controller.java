import tree.Node;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

        for (Object element : tree) {
            System.out.println("444" + element.toString());
        }

        Set<Integer> integers = new TreeSet<Integer>();
        for(Integer element : integers){

        }

        List<Integer> integers1 = new ArrayList<Integer>();
        for (Integer element : integers1) {

        }
    }
}
