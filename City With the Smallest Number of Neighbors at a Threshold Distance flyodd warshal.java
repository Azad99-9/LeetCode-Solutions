class Solution {
      int findCity(int n, int m, int[][] edges,int distanceThreshold)
      {
          int[][] distanceMatrix = new int[n][n];
          
          for (int[] edge: edges) {
              int u = edge[0];
              int v = edge[1];
              int wt = edge[2];
              distanceMatrix[u][v] = wt;
              distanceMatrix[v][u] = wt;
          }
          
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                  if (distanceMatrix[i][j] == 0 && i != j) distanceMatrix[i][j] = (int)(1e9);
              }
          }
          
          
          for (int k = 0; k < n; k++) {
              for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                      distanceMatrix[i][j] = Math.min(distanceMatrix[i][j], distanceMatrix[i][k]+distanceMatrix[k][j]);
                  }
               }
          }
          
          int smallNode = 0;
          int minnoofCities = (int)(1e9);
          
          for (int i = 0; i < n; i++)  {
              int noofcities = 0;
              for (int j = 0; j < n; j++) {
                  
                      if (distanceMatrix[i][j] <= distanceThreshold) noofcities++;
                 
              }
              if (noofcities <= minnoofCities)
              {
                minnoofCities = noofcities;
                smallNode = i;
              }
          }
          
          return smallNode;
      }
}