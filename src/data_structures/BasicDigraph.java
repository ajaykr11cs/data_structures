/**
 * 
 */
package data_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ajkumar
 *
 */
public class BasicDigraph {
	
	Map<Integer, List<Integer>> adjacencyList;
	
	public BasicDigraph(List<Edge> edges) {
		
		if( edges.isEmpty()) {
			System.out.println("Empty Edges!! Exciting");
			return;
		}
		
		adjacencyList = new HashMap<Integer, List<Integer>>();
		//Need to find the max number of vertices
		int maxNode = 0;
		for( Edge e: edges) {
			maxNode = Integer.max(maxNode, Integer.max(e.src, e.dest));
		}
		
		//Allocate memory for all the nodes using maxNode
		for( int index = 0; index < maxNode; index++) {
			this.adjacencyList.put(index, new ArrayList<Integer>());
		}
		
		for( Edge e : edges ) {
			this.adjacencyList.get(e.src).add(e.dest);
			//this.adjacencyList.get(e.dest).add(e.src); //for Undirected Graph 
		}
	}
	
}

class Edge{
	
	int src;
	int dest;
	
	public Edge(int src, int dest) {
		this.src = src;
		this.dest = dest;
	}
	
}
