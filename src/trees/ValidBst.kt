package trees

fun main() {
    val bst = ValidBst()
    val root = TreeNode(-2147483648)
    root.left = TreeNode(-2147483648)
    print(bst.isValidBST(root))
}

class ValidBst {

    fun isValidBST(root: TreeNode?): Boolean {
        return validBst(root, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    private fun validBst(root: TreeNode?, min: Int, max: Int): Boolean {
        if (root == null) return true
        if (root.`val` < min || root.`val` > max) return false
        return validBst(root.left, min, (root.`val` - 1)) && validBst(root.right, (root.`val` + 1), max)
    }
}