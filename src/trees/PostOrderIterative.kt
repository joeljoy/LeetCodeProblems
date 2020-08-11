package trees

import java.util.*

class PostOrderIterative {

    fun postOrderTraversal(root: TreeNode?): List<Int> {
        val result = mutableListOf<Int>()
        val stack = Stack<TreeNode>()
        var current: TreeNode? = root
        var pre: TreeNode? = null
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current)
                current = current.left
            } else {
                current = stack.peek()
                if (current.right == null || current.right == pre) {
                    result.add(current!!.`val`)
                    pre = current
                    current = null
                } else {
                    current = current!!.right
                }
            }
        }
        return result
    }
}