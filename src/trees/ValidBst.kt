package trees

fun main() {
    val bst = ValidBst()
    val root = TreeNode(-2147483648)
    root.left = TreeNode(-2147483648)
    print(bst.isValidBST(root))
}

class ValidBst {

    fun isValidBST(root: TreeNode?): Boolean {
        return validBst(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    private fun validBst(root: TreeNode?, min: Long, max: Long): Boolean {
        if (root == null) return true
        if (root.`val` < min || root.`val` > max) return false
        val minValue: Long = (root.`val`).toLong() - 1
        val maxValue: Long = (root.`val`).toLong() + 1
        return validBst(root.left, min, minValue) && validBst(root.right, maxValue, max)
    }
}