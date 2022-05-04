package com.greatlearning.question2;

public class DataTransactions {

		public static Node node;
		static Node prevNode = null;
		static Node headNode = null;

		static void ConvertBTToSkewed(Node root, int order) {

			if (root == null) {
				return;
			}
			if (order > 0) {
				ConvertBTToSkewed(root.right, order);
			} else {
				ConvertBTToSkewed(root.left, order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;

			// Condition to check if the root Node of skewed tree is not defined
			
			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			if (order > 0) {
				ConvertBTToSkewed(leftNode, order);
			} else {
				ConvertBTToSkewed(rightNode, order);
			}
		}

		// Traverse the right one skewed using recursion
		static void traverseRightSkewed(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);
		}

		@SuppressWarnings("unused")
		public static void main(String args[]) {
			DataTransactions tree = new DataTransactions();
			DataTransactions.node = new Node(50);
			DataTransactions.node.left = new Node(30);
			DataTransactions.node.right = new Node(60);
			DataTransactions.node.left.left = new Node(10);
			DataTransactions.node.right.left = new Node(55);

			int order = 0;
			ConvertBTToSkewed(node, order);
			traverseRightSkewed(headNode);
		}
	}



