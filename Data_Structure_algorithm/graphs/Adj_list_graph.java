package graphs;


public class Adj_list_graph {
	int vertex=4;
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
	public static void main(String[] args) {
		
		Adj_list_graph adj =new Adj_list_graph();
		adj.addEdge(0, 1);
		adj.addEdge(0, 2);
		adj.addEdge(1, 2);
		adj.addEdge(2,3);
		adj.printGraph();
//		LinkedList list=new LinkedList();
//		list.addNode(10);
//		list.addNode(20);
//		list.addNode(30);
//		list.printList();
//		int a=list.size();
//		System.out.println("size of th linked list is "+a);
//		System.out.println("data is "+list.get(3));
		
		
	}
}
