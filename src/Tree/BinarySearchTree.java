package Tree;

import com.sun.source.tree.Tree;

public class BinarySearchTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            left = null;
            right = null;
        }
    }
    private TreeNode root;

    public BinarySearchTree(){
        root = null;
    }
    public void insert(int val){
        root = insertRecursive(root,val);
    }

    private TreeNode insertRecursive(TreeNode root, int val){
        if (root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertRecursive(root.left,val);
        }
        else if (val > root.val){
            root.right = insertRecursive(root.right, val);
        }
        return root;
    }

    // Method to perform an inorder traversal of the BST
    public void inorderTraversal() {
        inorderTraversalRecursive(root);
    }
    // Method to search for a value in the BST
    public boolean search(int val) {
        return searchRecursive(root, val);
    }
    // Recursive method to search for a value in the BST
    private boolean searchRecursive(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        } else if (val < root.val) {
            return searchRecursive(root.left, val);
        } else {
            return searchRecursive(root.right, val);
        }
    }
    // Recursive method to perform an inorder traversal of the BST
    private void inorderTraversalRecursive(TreeNode root) {
        if (root != null) {
            inorderTraversalRecursive(root.left);
            System.out.print(STR."\{root.val} ");
            inorderTraversalRecursive(root.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);

        System.out.println("Inorder traversal of the BST:");
        bst.inorderTraversal(); // Output: 1 3 4 5 7

        System.out.println("\nSearch for value 4:");
        System.out.println(bst.search(4)); // Output: true

        System.out.println("Search for value 6:");
        System.out.println(bst.search(6)); // Output: false
    }

}
