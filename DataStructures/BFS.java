//BFS
import java.io.*; 
import java.util.*; 

class BFS4Graph {
	int V;
	LinkedList <Integer> adjListArray[];
	
	BFS4Graph(int v){
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
	
	void BFS(int s){
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s]=true;
		queue.add(s);
		
		while (queue.size()!=0) {
			s = queue.poll();
			System.out.print(s+" ");
			
			Iterator <Integer> i = adjListArray[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BFS4Graph g = new BFS4Graph(7); 
		  
			/*
			g.addEdge(0, 1); 
			g.addEdge(0, 2); 
			g.addEdge(1, 2); 
			g.addEdge(2, 0); 
			g.addEdge(2, 3); 
			g.addEdge(3, 3); 
			g.BFS(2);
			//2 0 1 3
			*/
			 
			/*
			g.addEdge(0, 1); 
			g.addEdge(0, 2);
			g.addEdge(1, 3);
			g.addEdge(1, 4);
			g.BFS(0);
			// 0 1 2 3 4 
			*/
			
			/*
			g.addEdge(0,1);
			g.addEdge(0,2);
			g.addEdge(1,3);
			g.addEdge(1,4);
			g.addEdge(1,5);
			g.addEdge(2,6);
			g.BFS(0);
			// 0 1 2 3 4 5 6 
			*/
			 
	}
}
