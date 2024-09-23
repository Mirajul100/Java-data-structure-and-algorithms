package Graph;

import java.util.LinkedList;

public class UnDirectedGraphConnectedComponent {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;
    private int[] con;

    public UnDirectedGraphConnectedComponent(int node) {
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

    public void dfs() {
        boolean[] visited = new boolean[V];
        con = new int[V];
        int count = 0;

        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs(visited, con, count, v);
                count++;
            }
        }
        System.out.println("Connected component is : " + count);
    }

    public void dfs(boolean[] visited, int[] con, int count, int v) {
        visited[v] = true;
        con[v] = count;
        for (int w : adj[v]) {
            if (!visited[w]) {
                dfs(visited, con, count, w);
            }
        }
    }

    public boolean getCC(int a, int b) {
        if (con[a] == con[b]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        UnDirectedGraphConnectedComponent uc = new UnDirectedGraphConnectedComponent(6);
        uc.addEdge(0, 1);
        uc.addEdge(1, 2);
        uc.addEdge(4, 3);
        uc.addEdge(5, 5);

        uc.dfs();

        boolean c = uc.getCC(0, 1);

        if (c == true) {
            System.out.println("Connected");
        } else {
            System.out.println("Not connected");
        }

    }
}