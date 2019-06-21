import java.util.LinkedList;
import java.util.Queue;
class BinaryTree {
	
	static class Node {
		int key;
		Node left, right;
		Node(int item){
			this.key = item;
			left = right = null; 
		}	
	}

	static Node root;
	static Node current = root;
	
	static void inorder(Node current) { 
		if (current == null) 
			return;
		inorder(current.left); 
		System.out.print(current.key+" "); 
		inorder(current.right); 
	}
	
	static void postorder(Node current) { 
		if (current == null) 
			return;
		postorder(current.left); 
		postorder(current.right); 
		System.out.print(current.key+" "); 
	}
	
	static void preorder(Node current) { 
		if (current == null) 
			return;
		preorder(current.right); 
		preorder(current.left);
		System.out.print(current.key+" "); 
	}
	
	//Insert using queue
	static void insert(Node current,int key){
		Queue <Node> queue = new LinkedList<Node>();
		queue.add(current);
		
		while (!queue.isEmpty()) {
			current = queue.peek();
			queue.remove();
			
			if (current.left == null) {
				current.left = new Node(key); 
				break; 
			} else {
				queue.add(current.left); 
			}
			
			if (current.right == null) {
				current.right = new Node(key);
				break;
			} else {
				queue.add(current.right);
			}
		}
	}
	
	static void delete(Node current, int key){
		Queue <Node> queue = new LinkedList<Node>();
		queue.add(current);
		
		Node delete_node = null;
		
		while (!queue.isEmpty()) {
			current = queue.peek();
			System.out.println("Element removed = "+current.key);
			queue.remove();
			if (current.key==key) {
				delete_node = current;
			}
			if (current.left!=null) {
				queue.add(current.left);
				System.out.println("Left Added = "+current.left.key);
			}
			if (current.right!=null) {
				queue.add(current.right);
				System.out.println("Right added = "+current.right.key);
			}
		}
		
		Node last_node = current;
		System.out.println("Last element is = "+last_node.key);
		System.out.println("Node to be deleted = "+delete_node.key);
		delete_node = current;
		
		while (!queue.isEmpty()) {
			current = queue.peek();
			queue.remove();
			if (current.key==key) {
				current.key = last_node.key;
				break;
			}
			if (current.left!=null) {
				queue.add(current.left);
			}
			if (current.right!=null) {
				queue.add(current.right);
			}
		}

		// Create a method to replace the node needed to be deleted with the last node
		// Replace that node and return
		// then delete the last node
	}
	
	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		
		System.out.println("Inorder traversal before insertion: "); 
		inorder(root);
		insert(root,5);
		System.out.println();
		System.out.println("Inorder traversal after insertion: "); 
		inorder(root);
		System.out.println();
		delete(root,3);
		System.out.println("After Deletion");
		inorder(root);
	}
}