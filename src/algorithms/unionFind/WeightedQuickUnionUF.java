package algorithms.unionFind;

/**
 * @author rajatsrivastava
 **/
public class WeightedQuickUnionUF {
    private int[] id;
    private int[] size;

    public WeightedQuickUnionUF(int n) {
        id = new int[n];
        size = new int[n];
        for (int i=0; i < n ; i++){
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i){
        while (id[i] != i){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p , int q){
        return root(p) == root(q);
    }
    public void union(int p , int q){
        int rootP = root(p);
        int rootQ = root(q);

        if (rootP == rootQ) return;

        if (size[rootP] < size[rootQ] ){
            id[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }else {
            id[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }


    }
}
