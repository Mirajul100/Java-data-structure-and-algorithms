package Graph;

import java.util.LinkedList;

public class UnDirectedRecursionDfs {

    private int V;
    private int E;
    private LinkedList<Integer>[] adj;

    public UnDirectedRecursionDfs(int node) {
        this.V = node;
        this.E = 0;
        adj = new LinkedList[node];

        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public void recursionDfs() {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                recursionDfs(v, visited);
            }
        }
    }

    private void recursionDfs(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                recursionDfs(w, visited);
            }
        }
    }

    public static void main(String[] args) {
        UnDirectedRecursionDfs rdfs = new UnDirectedRecursionDfs(5);
        rdfs.addEdge(0, 1);
        rdfs.addEdge(1, 2);
        rdfs.addEdge(2, 3);
        rdfs.addEdge(3, 0);
        rdfs.addEdge(2, 4);

        rdfs.recursionDfs();
    }
}
