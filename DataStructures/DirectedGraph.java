import java.util.LinkedList; 

class GraphRepresentation {
	
	static class Graph {
		int V;
		LinkedList <Integer> adjListArray[];
		
		//constructor
		Graph(int V) {
			this.V = V;
			//size of array
			adjListArray = new LinkedList[V];
			
			for (int i = 0; i < V; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}
	
	// Directed graph
	static void addEdge(Graph graph, int src, int dest){
		graph.adjListArray[src].add(dest);
	}
	
	//print graph
	static void printGraph(Graph graph){
		for (int i = 0; i < graph.V; i++) {
			System.out.print("From "+i+" ");
			for(Integer p : graph.adjListArray[i]){
				System.out.print(" -> "+p);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int V=5;
		Graph graph = new Graph(V);
		
		/*
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4); 
		addEdge(graph, 1, 2); 
		addEdge(graph, 1, 3); 
		addEdge(graph, 1, 4); 
		addEdge(graph, 2, 3); 
		addEdge(graph, 3, 4); 
		*/
		
		addEdge(graph, 0,1);
		addEdge(graph, 0,2);
		addEdge(graph, 1,2);
		addEdge(graph, 1,3);
		addEdge(graph, 2,3);
		addEdge(graph, 3,4);
		
		printGraph(graph); 
	}
}
