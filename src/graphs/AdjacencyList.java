package graphs;

/**
 * @author rajatsrivastava
 **/
public class AdjacencyList {
    public static void main(String[] args) {

        GraphAL graphAL = new GraphAL();
        graphAL.addNode(new Node('A'));
        graphAL.addNode(new Node('B'));
        graphAL.addNode(new Node('C'));
        graphAL.addNode(new Node('D'));
        graphAL.addNode(new Node('E'));

        graphAL.addEdge(0,1);
        graphAL.addEdge(1,2);
        graphAL.addEdge(2,3);
        graphAL.addEdge(2,4);
        graphAL.addEdge(4,0);
        graphAL.addEdge(4,2);

        graphAL.print();

    }
}
