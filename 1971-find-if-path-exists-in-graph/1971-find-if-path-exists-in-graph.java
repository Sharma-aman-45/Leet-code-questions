class Solution {
    boolean[] visited;
    List<List<Integer>> gf ;

    void dfs(int node){
       if(visited[node]) return;
       visited[node]=true;
       
       for(int c: gf.get(node))
            if(!visited[c]){
             
             dfs(c);
        }
       }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        visited = new boolean[n];
        gf = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
            gf.add(new ArrayList<>());
        }

    for(int[] edge : edges){
        int u = edge[0];
        int v = edge[1];
        gf.get(u).add(v);
        gf.get(v).add(u);
    }
      dfs(source);
      return visited[destination];
    }
}