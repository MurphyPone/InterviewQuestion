public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	
	//No Args constructor
	TreeNode() {
		this.value = (Integer) null;
		this.left = null;
		this.right = null;
	}
	
	TreeNode(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}
	
	TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	//GETTERS//
	TreeNode getLeft() { return this.left; }
	TreeNode getRight() { return this.right; }
	int getValue() { return this.value; }
	//SETTERS//
	void setLeft(TreeNode left) { this.left = left; }
	void setRight(TreeNode left) { this.left = left; }
	void setValue(int value) { this.value = value; }
	
	int compareTo(TreeNode other) {
		return (this.getValue() - other.getValue());
	}
	
	//HELPER METHODS
	
	//Insert
	boolean insert(TreeNode other) {
		if (this.getValue() == other.getValue() ) { return false; }	//If it already exists in the BST
		else if ( other.compareTo(this) < 0) { //if the other is smaller, go left
			if (this.left == null) {
				this.left = other;
				return true;
			} else return left.insert(other); } 
			else if ( other.compareTo(this) > 0 ) {
         		if (right == null) {
         			right = other;
         			return true;
         		} else { return right.insert(other); } 
         }

         return false;
	}
	
	//toString
	
	public String toString() {
		return preOrder(this, "");
	}
	private String preOrder(TreeNode root, String soFar) {	//V L R 
		String result = soFar;
		if(root != null) {
			result += root.getValue() + " ";
			result += preOrder(root.getLeft(), soFar );
			result += preOrder(root.getRight(), soFar+"\t" );
		} 
		return result;
	}
	
	//Answers
	
	//1. return the biggest element in the tree
	TreeNode getBiggest(TreeNode root) {
		if(root.getRight() == null) { return root; } //base case, root is farthest right/ only node  
		return getBiggest( root.getRight() ); //else recurse right
	}
	
	//2. return the 2nd biggest element in an array

 
}
