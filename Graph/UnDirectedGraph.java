package Graph;

import java.util.LinkedList;

public class UnDirectedGraph {

    private LinkedList<Integer> adj[];
    private int V;
    private int E;

    public UnDirectedGraph(int node) {
        this.V = node;
        this.E = 0;
        this.adj = new LinkedList[node];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        UnDirectedGraph udg = new UnDirectedGraph(4);
        udg.addEdge(0, 1);
        udg.addEdge(1, 2);
        udg.addEdge(2, 3);
        udg.addEdge(3, 0);
        System.out.println(udg);

    }
}
