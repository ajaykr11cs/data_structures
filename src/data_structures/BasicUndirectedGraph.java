/**
 * 
 */
package data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author ajkumar
 *
 */
public class BasicUndirectedGraph {
	
	int numberOfNodes;
	Map<Integer, ArrayList<Integer>> adjacencyList;
	
	public BasicUndirectedGraph() {
		// TODO Auto-generated constructor stub
		this.numberOfNodes = 0;
		this.adjacencyList = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	
	public void addVertex(int node) {
		this.adjacencyList.put(node, new ArrayList<Integer>());
		this.numberOfNodes++;
	}
	
	public void addEdge(int node1, int node2) {
		if( this.adjacencyList.isEmpty()) {
			System.out.println("Empty graph!");
			return;
		}
		//The assumption here is either of the node should already be added as Vertex in the Graph
		this.adjacencyList.get(node1).add(node2);
		this.adjacencyList.get(node2).add(node1);
		
	}
	

}
