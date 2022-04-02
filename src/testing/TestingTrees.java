package testing;

import java.util.List;

import data_structures.BasicBinarySearchTree;

public class TestingTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicBinarySearchTree bst = new BasicBinarySearchTree();
		bst.insert(9);
		bst.insert(20);
		bst.insert(4);
		bst.insert(170);
		bst.insert(15);
		bst.insert(1);
		bst.insert(6);

		System.out.println(" Searching Tree for 5 : "+ bst.lookup(5));
		System.out.println(" Searching Tree for 1 : "+ bst.lookup(1));
		List<BasicBinarySearchTree.Node> bfs = bst.breadthFirstSearch();
		System.out.println("BFS : ");
		for( int i=0; i< bfs.size(); i++) {
			System.out.print(bfs.get(i).getValue()+ " ");
		}
		
	}

}
