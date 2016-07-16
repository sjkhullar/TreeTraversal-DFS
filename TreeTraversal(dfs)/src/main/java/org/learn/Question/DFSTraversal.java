package org.learn.Question;

public class DFSTraversal {

	public static void preOrder(Node root) {
		if (null == root) {
			return;
		}
		System.out.printf("%d ", root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(Node root) {
		if (null == root) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.printf("%d ", root.data);
	}

	public static void inOrder(Node root) {
		if (null == root)
			return;
		inOrder(root.left);
		System.out.printf("%d ", root.data);
		inOrder(root.right);
	}
}
