package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author rajatsrivastava
 **/
public class GraphAL {
    ArrayList<LinkedList<Node>> alist;

    public GraphAL() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {

        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dest) {
        LinkedList<Node> currentList = alist.get(src);
        Node destNode = alist.get(dest).get(0);
        currentList.add(destNode);
    }

    public boolean checkEdge(int src, int dest) {
        LinkedList<Node> currentList = alist.get(src);
        Node destNode = alist.get(dest).get(0);
        for(Node node : currentList){
            if (node == destNode){
                return true;
            }
        }
        return false;
    }

    public void print() {

        for (LinkedList<Node> currentList : alist){
            for (Node node : currentList){
                System.out.print(node.data+ " -> ");
            }
            System.out.println();
        }
    }
}
