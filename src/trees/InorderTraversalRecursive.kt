package trees

class InorderTraversalRecursive {

    private val result = mutableListOf<Int>()

    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return emptyList()
        } else {
            inorderTraversal(root.left)
            result.add(root.`val`)
            inorderTraversal(root.right)
        }
        return result
    }
}