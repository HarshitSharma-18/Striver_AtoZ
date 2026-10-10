class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colour = new int[n];
        
        Arrays.fill(colour , -1);

        for(int i = 0 ; i < n ; i++){
            if(colour[i] == -1){
                if (!dfs(graph, i, 0, colour)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int[][] graph , int node , int c , int[] colour){
        colour[node] = c;

        for(int j = 0 ; j < graph[node].length ; j++){
            int neigh = graph[node][j];

            if(colour[neigh] != -1 && colour[neigh] == c){
                return false;
            }

            if(colour[neigh] == -1){
                if (!dfs(graph, neigh, 1 - c, colour)) {
                    return false;
                }
            }
        }
        return true;
    }
}