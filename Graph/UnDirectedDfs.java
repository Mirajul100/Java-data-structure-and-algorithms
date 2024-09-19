package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class UnDirectedDfs {

    private int V;
    private int E;
    private LinkedList<Integer> adj[];

    public UnDirectedDfs(int node) {
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

    public void Dfs(int s) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        UnDirectedDfs dfs = new UnDirectedDfs(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 0);

        dfs.Dfs(0);

    }
}
