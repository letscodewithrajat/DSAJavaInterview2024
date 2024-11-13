package trees;

/**
 * @author rajatsrivastava
 **/
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);

    }
}
