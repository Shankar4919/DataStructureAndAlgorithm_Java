package graphs;
import java.util.*;


public class Adj_list_graph {
	int vertex=5;
	LinkedList list[]=new LinkedList[vertex];
	
	public Adj_list_graph() {
		for(int i=0; i<vertex;i++) {
			list[i]=new LinkedList();
		}
	}
	
	public void addEdge(int source, int destination) {
		list[source].addNode(destination);
		list[destination].addNode(source);
		
	}
	public void printGraph() {
		for(int i=0; i<vertex; i++) {
			System.out.println(i+" is connected to ");
			if(list[i].size()>0) {
				for(int j=0; j<list[i].size(); j++) {
					System.out.println(list[i].get(j)+" ");
				}
			}
			System.out.println();
		}
	}
	
	public List<Integer> getAdjacentNodes(int val){
		List<Integer> adjlist=new ArrayList<>();
		for(int i=0; i<list[val].size(); i++) {
			adjlist.add(list[val].get(i));
		}
		return adjlist;
	}
	
	
	public void BFS(int rootnode) {
		System.out.println("printing BFS");
		
		boolean visited[]=new boolean[vertex];
		Queue q = new Queue();
		visited[rootnode] = true;
		q.enqueue(rootnode);
		while(q.size() != 0) {
			int val=q.dequeue();
			System.out.println(val);
			Iterator<Integer> iterator=getAdjacentNodes(val).iterator();
			
			while(iterator.hasNext()) {
				int adjval=iterator.next();
				if(!visited[adjval]) {
					q.enqueue(adjval);
					visited[adjval]=true;
				}
			}
		}
	}
	//end of BFS
	public void BFSShortestPath(int rootnode, int distance[], int prevpath[]) {
		boolean visited[] = new boolean[vertex];
		for(int i=0; i<vertex; i++) {
			distance[i] = Integer.MAX_VALUE;
			prevpath[i]=-1;
		}
		visited[rootnode]=true;
		Queue q = new Queue();
		q.enqueue(rootnode);
		distance[rootnode]=0;
		while(q.size()!=0) {
			int u=q.dequeue();
			Iterator<Integer> iterator = getAdjacentNodes(u).iterator();
			while(iterator.hasNext()) {
				int v = iterator.next();
				if(!visited[v]) {
					q.enqueue(v);
					visited[v]=true;
					distance[v]=distance[u]+1;
					prevpath[v]=u;
				}
			}
			
		}
		
	}
	
	
	public void printShortestPath(int source, int destination) {
		int distance[] = new int[vertex];
		int prevpath[] = new int[vertex];
		BFSShortestPath(source, distance, prevpath);
		
		int crawl = destination;
		LinkedList path = new LinkedList();
		path.addNode(crawl);
		while(prevpath[crawl]!=-1) {
			path.addNode(prevpath[crawl]);
		}
		System.out.println("The shortest distance is = "+distance[destination]);
		for(int i=path.size()-1; i>=0; i--) {
			System.out.println(path.get(i));
			
		}
	}
	
	//DFS recursive algorithm
	public void DepthFirstSearch(int rootnode) {
		boolean visited[]=new boolean[vertex];
		DFS(rootnode, visited);
	}
	public void DFS(int rootnode, boolean visited[]) {
		visited[rootnode]=true;
		System.out.println(rootnode);
		Iterator<Integer>interator = getAdjacentNodes(rootnode).iterator();
		while(interator.hasNext()) {
			int adjval=interator.next();
			if(!visited[adjval]) {
				DFS(adjval, visited);
			}
		}
	}
	//end of DFS
	
	
	// tasks get adjecent node and implement stack from link list
	
	public static void main(String[] args) {
		
		Adj_list_graph adj =new Adj_list_graph();
		adj.addEdge(0, 1);
		adj.addEdge(0, 2);
		adj.addEdge(1,3);
		adj.addEdge(2,4);
		adj.addEdge(3,4);
		adj.printGraph();
//		adj.BFS(0);
		adj.printShortestPath(0,4);
//		LinkedList list=new LinkedList();
//		list.addNode(10);
//		list.addNode(20);
//		list.addNode(30);
//		list.printList();
//		int a=list.size();
//		System.out.println("size of the linked list is "+a);
//		System.out.println("data is "+list.get(3));
//		adj.DepthFirstSearch(0);
		
		
	}
}

