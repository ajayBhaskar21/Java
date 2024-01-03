
//  BFS Traversal for a Graph and Adjacency Matrix Form.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class test1 {
    

    static void showMatrix(int[][] m, int x, int y){
        for (int i = 1; i < x; i++){
            for (int j = 1; j < y; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of nodes: ");
        int nodes = in.nextInt();
        System.out.print("Enter no. of edges: ");
        int edges = in.nextInt();

        int[][] m = new int[nodes + 1][nodes + 1];
        for (int i = 0; i < edges; i++){
            System.out.println("Enter edge nodes : ");
            int at = in.nextInt();
            int bt = in.nextInt();
            m[at][bt] = m[bt][at] = 1;

        }
        showMatrix(m, edges, edges);

        int[] visited = new int[nodes + 1];
        Queue<Integer> q = new LinkedList<Integer>();
        int startVertex = 1;
        
        q.add(startVertex);
        visited[startVertex] = 1;
        while (!q.isEmpty()){
            int t = q.remove();

            System.out.print(t + " ");
            for (int j = 1; j <= nodes; j++){
                if (m[t][j] == 1){
                    if (visited[j] == 0){
                        q.add(j);
                        visited[j] = 1;
                    }
                }
            }


        }


        System.out.println("done");
        



    }
}
