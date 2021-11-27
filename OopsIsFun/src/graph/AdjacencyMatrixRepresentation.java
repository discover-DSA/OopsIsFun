package graph;

public class AdjacencyMatrixRepresentation {
	
	static  void addEdge(int graph[][], int u, int v)
	{
		graph[u][v] = 1;
	}
	
	public static void main(String[] args) {
		 int V = 5;
		//int graph[V][V] = {0};
		
		int[][] graph = new int [V][V];
		
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 1);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 3, 2);
		addEdge(graph, 3, 4);
//		addEdge(graph, 0, 1);
//		addEdge(graph, 0, 1);
//		addEdge(graph, 0, 1);

		System.out.println("Adjacency Matrix : ");
		for(int i=0; i<V; i++)
		{
			for(int j=0; j<V; j++)
			{
				System.out.print(graph[i][j] + " ");
			}
			
			System.out.println();
		}
		
		}

}
