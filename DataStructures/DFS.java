//DFS
import java.io.*; 
import java.util.*; 

class DFS4Graph {
	int V;
	LinkedList <Integer> adjListArray[];
	
	DFS4Graph(int v){
		V = v;
		adjListArray = new LinkedList [V];
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList();
		}
	}
	
	//Add Edges to the graph
	void addEdge(int src,int dest){
		adjListArray[src].add(dest);
	}
	
	// Actual DFS
	void DFSUtil(int v, boolean visited[]){
		visited[v] = true;
		System.out.print(v+" ");
		
		Iterator <Integer> i = adjListArray[v].listIterator();
		while (i.hasNext()) {
			int n=i.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
	}
	
	// Start DFS
	void DFS(int v){
		boolean visited[] = new boolean[V];
		DFSUtil(v,visited);
	}
	
	public static void main(String[] args) {
		DFS4Graph g = new DFS4Graph(7); 
		  
			/*
			g.addEdge(0, 1); 
			g.addEdge(0, 2); 
			g.addEdge(1, 2); 
			g.addEdge(2, 0); 
			g.addEdge(2, 3); 
			g.addEdge(3, 3); 
			//2 0 1 3 
			*/
			
			/*
			g.addEdge(0, 1); 
			g.addEdge(0, 2);
			g.addEdge(1, 3);
			g.addEdge(1, 4);
			// 0 1 3 4 2 
			*/
			
			g.addEdge(0,1);
			g.addEdge(0,2);
			g.addEdge(1,3);
			g.addEdge(1,4);
			g.addEdge(1,5);
			g.addEdge(2,6);
			// 0 1 3 4 5 2 6 
			
			g.DFS(0); 
	}
}
