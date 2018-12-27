import java.util.Arrays;
class TreeSort  { 
	class Node { 
		int key; 
		Node left, right; 
   
		public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 
	 
	Node root; 
	TreeSort() {  
		root = null;  
	} 
 
	// First
	void treeInsert(int arr[]) { 
		for(int i = 0; i < arr.length; i++) { 
			insert(arr[i]); 
		} 
	} 
	// Call to Insert
	void insert(int key) { 
		root = insertRec(root, key); 
	} 
	// Call to insertRec
	Node insertRec(Node root, int key) { 
		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 
   
		if (key < root.key) {
			root.left = insertRec(root.left, key); 
		} else if (key > root.key) {
			root.right = insertRec(root.right, key); 
		}
		return root; 
	}
	 
	// For inorder traversal of BST 
	void inorderTraversal(Node root) { 
		if (root != null) { 
			inorderTraversal(root.left); 
			System.out.print(root.key + " "); 
			inorderTraversal(root.right); 
		} 
	} 
 
	public static void main(String[] args) { 
		TreeSort tree = new TreeSort(); 
		int arr[] = {5, 4, 7, 2, 11}; 
		System.out.println("Before Sorting = "+Arrays.toString(arr));
		tree.treeInsert(arr); 
		System.out.print("After Sorting = ");
		tree.inorderTraversal(tree.root); 
	} 
}