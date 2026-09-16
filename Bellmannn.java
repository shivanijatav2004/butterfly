import java.util.*;

public class Bellmannn {

    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int src, int V) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Relax all edges (V-1) times
        for (int i = 0; i < V - 1; i++) {
            for (int u = 0; u < V; u++) {
                for (Edge e : graph[u]) {
                    int v = e.dest;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                    }
                }
            }
        }

        // Check for negative weight cycles
        for (int u = 0; u < V; u++) {
            for (Edge e : graph[u]) {
                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                    System.out.println("Graph contains a negative weight cycle!");
                    return;
                }
            }
        }

        // Print shortest distances
        System.out.println("Shortest distances from source " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0, V);
    }
}