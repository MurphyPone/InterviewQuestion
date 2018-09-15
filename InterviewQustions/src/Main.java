//Table of Contents
	//1. Return the largest element in a BST
	//2. Return the second largest element in a BST

public class Main {
	public static void main(String[] args) {
		//Instantiate test variables
		TreeNode root = new TreeNode(0);
		
		for(int i = 1; i < 10; i++) {
			root.insert(new TreeNode((Integer) i) );
		}
		
		//Verify proper creation
		System.out.println(root);
		System.out.println("------------------");
		
		//TEST//
		//1. Return the largest element in a BST
		System.out.println(root.getBiggest(root));

		//2. Return second largest
		


	}

}
