package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class UnDirectedGraphBfs {

    private int V;
    private int E;
    LinkedList<Integer>[] adj;

    public UnDirectedGraphBfs(int node) {
        V = node;
        E = 0;
        adj = new LinkedList[node];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public void Bfs(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
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
        UnDirectedGraphBfs bfs = new UnDirectedGraphBfs(5);
        bfs.addEdge(0, 1);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 0);
        bfs.addEdge(2, 4);
        System.out.println(bfs);
        System.out.println();
        bfs.Bfs(0);
    }
}
