import java.util.*;

public class CampusGraph {

    private static final int INF = Integer.MAX_VALUE;

    private String[] buildings;
    private int[][] distances;
    private int n;

    public CampusGraph() {
        // Initialize building names
        buildings = new String[]{"Main Building", "Library", "Canteen", "IT Building", "Gymnasium"};
        n = buildings.length;

        // Initialize adjacency matrix
        distances = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) distances[i][j] = 0;
                else distances[i][j] = INF;
            }
        }

        // Add at least 6 edges (weights in meters)
        addEdge(0, 1, 100); // Main <-> Library
        addEdge(0, 2, 150); // Main <-> Canteen
        addEdge(1, 3, 80);  // Library <-> IT
        addEdge(2, 3, 120); // Canteen <-> IT
        addEdge(2, 4, 200); // Canteen <-> Gymnasium
        addEdge(3, 4, 90);  // IT <-> Gymnasium
    }

    private void addEdge(int a, int b, int weight) {
        distances[a][b] = weight;
        distances[b][a] = weight; // Undirected graph
    }

    public String[] getBuildings() {
        return buildings;
    }

    public void displayMap() {
        System.out.println("--- Campus Buildings ---");
        for (int i = 0; i < n; i++) {
            System.out.println("[" + i + "] " + buildings[i]);
        }

        System.out.println("\n--- Direct Connections ---");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (distances[i][j] != INF) {
                    System.out.println(buildings[i] + " <-> " + buildings[j] + " (" + distances[i][j] + "m)");
                }
            }
        }
    }

    public void shortestPath(int source, int dest) {
        // Step 1 - Initialization
        int[] dist = new int[n];
        int[] previous = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = INF;
            previous[i] = -1;
            visited[i] = false;
        }
        dist[source] = 0;

        // Step 2 - Dijkstra's Logic
        for (int count = 0; count < n; count++) {
            // (a) Find unvisited vertex with smallest distance
            int u = -1;
            int minDistance = INF;
            for (int i = 0; i < n; i++) {
                if (!visited[i] && dist[i] < minDistance) {
                    minDistance = dist[i];
                    u = i;
                }
            }

            if (u == -1) break; // All reachable vertices visited
            visited[u] = true;

            // (b) Update neighbors
            for (int v = 0; v < n; v++) {
                if (!visited[v] && distances[u][v] != INF) {
                    int newDist = dist[u] + distances[u][v];
                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                        previous[v] = u;
                    }
                }
            }
        }

        // Step 3 - Print Result
        if (dist[dest] == INF) {
            System.out.println("No path exists between " + buildings[source] + " and " + buildings[dest]);
            return;
        }

        System.out.println("Total distance: " + dist[dest] + " meters");

        // Reconstruct path
        List<String> path = new ArrayList<>();
        for (int at = dest; at != -1; at = previous[at]) {
            path.add(buildings[at]);
        }
        Collections.reverse(path);

        System.out.println("Path: " + String.join(" -> ", path));
    }
}