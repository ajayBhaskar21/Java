
import java.util.*;

import javax.lang.model.element.TypeElement;


public class dfs1 {

    static void show(int[][] m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void dfs(int[][] graph, int n, boolean[] visited, int start){

        visited[start] = true;
        System.out.println(start);

        for (int i = 0; i < n; i++){
            if (graph[start][i] == 1 && visited[i] == false){
                dfs(graph, n, visited, i);

            }
        }
    }

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int nodes = in.nextInt();
        System.out.print("Enter no. of edges: ");
        int edges = in.nextInt();

        int[][] graph = new int[nodes][nodes];
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter edge nodes : ");
            int at = in.nextInt();
            int bt = in.nextInt();
            graph[at][bt] = 1;

        }

        show(graph, nodes);

        boolean[] visited = new boolean[nodes];

        dfs(graph, nodes, visited, 1);

    }
    
}
