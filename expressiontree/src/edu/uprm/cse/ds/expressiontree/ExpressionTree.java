package edu.uprm.cse.ds.expressiontree;

public class ExpressionTree {

	private BinaryTreeNode<Integer> root;

	public ExpressionTree(BinaryTreeNode<Integer> root) {
		super();
		this.root = root;
	}

	public Integer getValue() {
		return this.root.getValue();
	}

	@Override
	public String toString() {
		return this.root.toString();
	}
	// poor intent of verifying BST

	public boolean validateBST() {
		return check(this.root);
	}

	public boolean check(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return true;
		}
		//check current
		
		if(root.getLeftChild().getValue() > root.getValue() || root.getRightChild().getValue() < root.getValue()) {
			return false;
		}
		
		if(!check(root.getLeftChild())) return false;
		
		
		if(!check(root.getRightChild()))  return false;


		return true;

	}
	//Do later
	///

}

