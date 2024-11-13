package trees;

/**
 * @author rajatsrivastava
 **/
public class BinarySearchTree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(Node root) {

        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(Node root) {

        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    public void postOrder(Node root) {

        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {


            inOrder(root.left);
            inOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data < data) {
            return search(root.right, data);
        }
        return search(root.left, data);

    }

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (root.data > key) {
            insert(root.left, key);
        } else if (root.data < root.data) {
            insert(root.right, key);
        }
        return root;
    }

    Node insertIterative(int key) {

        Node newNode = new Node(key);
        Node currentNode = root;
        Node parent = null;
        while (currentNode != null) {
            parent = currentNode;
            if (key < currentNode.data) {
                currentNode = currentNode.left;
            }
            if (key > currentNode.data) {
                currentNode = currentNode.right;
            }
        }
        if (parent == null) {
            return newNode;
        } else if (key < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        return parent;


    }

    Node deleteNode(Node root, int data){
        if(root == null){
            return root;
        }
        if (data < root.data){
            root.left = deleteNode(root.left,data);
        }
        else if (data > root.data){
            root.right = deleteNode(root.right,data);
        }
        else {
            if (root.left == null ){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
               root.data =  minValue(root.right);
               root.right = deleteNode(root.right, root.data);

        }
        return root;

    }

    private int minValue(Node root) {

        int minValue =  root.data;
        while(root.left != null ){
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

}
