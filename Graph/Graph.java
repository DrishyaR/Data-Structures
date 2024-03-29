public class Graph {
	GraphNode[] node;
	int size;
	
	public Graph(int s) {
		size = s;
		node = new GraphNode[size];
		
		for(int i=0; i<size; i++)
			node[i] = new GraphNode(i);
	}
	
	public void addEdge(int from, int to) {
		node[from].adjList.add(node[to]);
	}
	
	public void print() {
		for(int i=0; i<size; i++) {
			System.out.print(i + ":");
			node[i].print();
			System.out.println();
		}
	}
	
	public void dfs() {
		int visitCount=0;
		for(int i=0; i<size; i++)
			if(!node[i].visited)
				visitCount = node[i].dfs(++visitCount);
		System.out.println();
	}
	
	public void printOrder() {
		for(int i=0; i<size; i++)
			System.out.print(node[i].label + " (" + node[i].preorder + "," + node[i].postorder + ") ");
	}
}

