package graphs;

public class adj_matrix {
	
	int size=4;
	int[][] matrix=new int[size][size];
	
	void addEdges(int source, int distination) {
		matrix[source][distination]=1;
		matrix[distination][source]=1;
	}
	
	void printGraph() {
		System.out.println("**Printing Graph**");
		for(int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	void printEdges() {
		System.out.println("**Printing Edges**");
		for(int i=0; i<size; i++) {
			System.out.print(i +" is connected to ");
			for(int j=0; j<size; j++) {
				if(matrix[i][j]==1) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		adj_matrix obj=new adj_matrix();
		obj.addEdges(0, 1);
		obj.addEdges(0, 2);
		obj.addEdges(0, 3);
		obj.addEdges(1, 2);
		obj.addEdges(1, 3);
		obj.printGraph();
		obj.printEdges();
	}
	
	
}
