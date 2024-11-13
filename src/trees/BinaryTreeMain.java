package trees;

import java.util.*;

/**
 * @author rajatsrivastava
 **/
public class BinaryTreeMain {
    public static void main(String[] args) {


        Node root = createTree();
        System.out.println("root of the tree: " + root.data);
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println("height : " + height(root));
        System.out.println();
        printLevelOrder(root);

    }

    private static Node createTree() {
        Node root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new Node(data);
        System.out.println("Enter the value for left of " + data);
        root.left = createTree();
        System.out.println("Enter the value for right of " + data);
        root.right = createTree();
        return root;


    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    private static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    private static int maxNode(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    private static int minNode(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minNode(root.left), minNode(root.right)));
    }

    private static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        //logic to print at different level
        queue.add(null);
        //logic to print at different level

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            //logic to print at different level
            if (currentNode == null) {
                if (queue.isEmpty()) {
                    return;
                }
                queue.add(null);
                System.out.println();
                continue;
            }
//logic to print at different level

            System.out.print(currentNode.data + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    private static void printLeftView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printLeftViewRec( list, root, 0 );

        for (Node node : list){
            System.out.print(node.data + " ");
        }
    }

    private static void printLeftViewRec(ArrayList<Node> list, Node root, int level) {
        if (root == null ){
            return;
        }
        if (list.get(level) == null){
            list.add(root);
        }
        printLeftViewRec(list, root.left, level+1);
        printLeftViewRec(list, root.right, level+1);
    }

    private static void printRightView(Node root){
        ArrayList<Node> list = new ArrayList<>();
        printRightViewRec( list, root, 0 );

        for (Node node : list){
            System.out.print(node.data + " ");
        }
    }

    private static void printRightViewRec(ArrayList<Node> list, Node root, int level) {
        if (root == null ){
            return;
        }
        if (list.get(level) == null){
            list.add(root);
        }
       printLeftViewRec(list, root.right, level+1);
        printLeftViewRec(list, root.left, level+1);
    }


    private static ArrayList<Integer> printTopView(Node root) {


        Queue<Pair> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();

        if (root == null ) return null;
        queue.add(new Pair(root, 0));
        while(! queue.isEmpty()){
            Pair currentNode = queue.poll();
            if (! map.containsKey(currentNode.hd)){
                map.put(currentNode.hd, currentNode.node.data);
            }
            if (currentNode.node.left !=null){
                queue.add(new Pair(currentNode.node.left, currentNode.hd-1));
            }
            if (currentNode.node.right !=null){
                queue.add(new Pair(currentNode.node.right, currentNode.hd+1));
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            list.add(entry.getValue());
        }

        return list;

    }

    static class Pair{
        Node node;
        int hd;

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

}
