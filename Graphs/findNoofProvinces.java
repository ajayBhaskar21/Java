import java.util.*;
class findNoofProvinces{


    static int dfs(int[][] graph, int n, boolean[] visited, int start) {

        visited[start] = true;
        System.out.println(start);

        for (int i = 0; i < n; i++) {
            if (graph[start][i] == 1 && visited[i] == false) {
                return dfs(graph, n, visited, i);
            }
        }
        return start;
    }

    static void show(int[][] m, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean allVisited(boolean[] a){
        
        for (int i = 0; i < a.length; i++){
            if (a[i] == false)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("start");
        int n = 8;

        // 0 to 7 nodes 
        int[][] graph = {{0, 1, 0, 0, 0, 0, 0, 0},
                         {1, 0, 1, 0, 0, 0, 0, 0},
                         { 0, 1, 0, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 1, 0, 0, 0 },
                         { 0, 0, 0, 1, 0, 1, 0, 0 },
                         { 0, 0, 0, 0, 1, 0, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 1 },
                         { 0, 0, 0, 0, 0, 0, 1, 0 },               
                        };
        
        show(graph, n);
        boolean[] visited = new boolean[n];
        int start = 0;
        int c = 0;
        while (allVisited(visited)){
            start = dfs(graph, n, visited, start);
            start++;
            c++;
        }
        System.out.println("\ncounts = " + c);

    }   

}