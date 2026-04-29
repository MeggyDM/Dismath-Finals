import java.util.ArrayList;
import java.util.List;

/**
 * ===== TOPIC: GRAPH THEORY (Dijkstra's Shortest Path) =====
 *
 * The campus is modeled as a WEIGHTED, UNDIRECTED graph:
 *   - Vertices (nodes) = buildings
 *   - Edges            = walkways between buildings
 *   - Weights          = walking distance in meters
 *
 * Use an ADJACENCY MATRIX (2D array):
 *   distances[i][j] holds the distance between building i and j.
 *   If there is NO direct connection, store INF.
 *
 * YOUR JOB:
 *   Fill in the constructor, addEdge, displayMap, and shortestPath.
 *   The fields and the getBuildings method are given to you.
 */
public class CampusGraph {

    private static final int INF = Integer.MAX_VALUE;

    private String[] buildings;
    private int[][] distances;
    private int n;

    public CampusGraph() {
        // TODO: Set up the campus map.
        //   1. Initialize the buildings array with at least 5 building names.
        //        e.g. {"Main Building", "Library", "Canteen", "IT Building", "Gymnasium"}
        //   2. Set n = buildings.length;
        //   3. Create distances as a new int[n][n] and fill it:
        //        - distances[i][j] = 0   when i == j
        //        - distances[i][j] = INF when i != j
        //   4. Add at least 6 edges using addEdge(a, b, weight).
        //      Suggested edges (you may change these):
        //        addEdge(0, 1, 100);   // Main Building <-> Library
        //        addEdge(0, 2, 150);   // Main Building <-> Canteen
        //        addEdge(1, 3,  80);   // Library       <-> IT Building
        //        addEdge(2, 3, 120);   // Canteen       <-> IT Building
        //        addEdge(2, 4, 200);   // Canteen       <-> Gymnasium
        //        addEdge(3, 4,  90);   // IT Building   <-> Gymnasium
    }

    private void addEdge(int a, int b, int weight) {
        // TODO: Record an UNDIRECTED edge.
        //   - Set distances[a][b] = weight;
        //   - Set distances[b][a] = weight;  (same in both directions)
    }

    public String[] getBuildings() {
        return buildings;
    }

    public void displayMap() {
        // TODO: Print the campus map.
        //   1. Print "--- Campus Buildings ---", then list each building with its index.
        //        e.g. "[0] Main Building"
        //   2. Print "--- Direct Connections ---", then list each edge ONCE.
        //        Tip: use a nested loop with j = i + 1 so you don't print the same
        //        edge twice. Skip pairs where distances[i][j] == INF.
    }

    /**
     * Dijkstra's Algorithm - find the shortest path from source to dest.
     */
    public void shortestPath(int source, int dest) {
        // TODO: Implement Dijkstra's Algorithm.
        //
        // Step 1 - Initialize three arrays of length n:
        //   int[] dist           - shortest known distance to each vertex
        //   int[] previous       - which vertex got us there (for reconstructing the path)
        //   boolean[] visited    - whether a vertex is finalized
        //
        //   Set every dist[i] = INF and every previous[i] = -1.
        //   Then set dist[source] = 0.
        //
        // Step 2 - Repeat n times:
        //   (a) Find the UNVISITED vertex u with the smallest dist[u].
        //       If no such vertex exists, break.
        //   (b) Mark u as visited.
        //   (c) For every neighbor v of u that is NOT visited and where
        //       distances[u][v] != INF:
        //         int newDist = dist[u] + distances[u][v];
        //         if (newDist < dist[v]) {
        //             dist[v] = newDist;
        //             previous[v] = u;
        //         }
        //
        // Step 3 - Print the result:
        //   - If dist[dest] == INF, print that no path exists and return.
        //   - Otherwise, walk backwards from dest using previous[]
        //     to reconstruct the path. (Tip: insert each vertex at the
        //     front of an ArrayList<Integer> to reverse it as you go.)
        //   - Print the total shortest distance and the path,
        //     using buildings[i] to convert each index to a name.
    }
}
