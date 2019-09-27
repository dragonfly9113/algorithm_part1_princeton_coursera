/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class MyQuickUnionUF {
    private int[] id;

    public MyQuickUnionUF(int N) {
        id = new int[];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    // Chase parent pointers until reach root (depth of i array accesses)
    private int root(int i) {
        while (i != id[i]) i = id[i];
        return i;
    }

    // Check if p and q have same root (depth of p and q array accesses)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // Change root of p to point to root of q (depth of p and q array accesses)
    public void union(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        id[rp] = rq;
    }
}
