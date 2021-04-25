package trees;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);

        TreeNode root3 = new TreeNode(1);
        root3.right = new TreeNode(2);
        root3.right.right = new TreeNode(3);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        System.out.println(balancedBinaryTree.isBalanced(root1));
        System.out.println(balancedBinaryTree.isBalanced(root2));
        System.out.println(balancedBinaryTree.isBalanced(root3));
//        System.out.println(balancedBinaryTree.isBalanced(null));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isBalanced(TreeNode root) {
        int leftDepth = 0;
        int rightDepth = 0;

        if (root == null) return true;

        leftDepth = findDepth(root.left);
        rightDepth = findDepth(root.right);

        return Math.abs(leftDepth - rightDepth) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    private int findDepth(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(findDepth(node.left), findDepth(node.right));
    }
}
