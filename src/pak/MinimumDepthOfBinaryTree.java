package pak;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode three = new TreeNode(3);
        TreeNode three2 = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode four2 = new TreeNode(4, five, null);
        TreeNode two = new TreeNode(2, three, four);
        TreeNode two2 = new TreeNode(2, four2, three2);
        TreeNode root = new TreeNode(1, two, two2);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0){
            return right + 1;
        } else if (right == 0){
            return left +1;
        } else {
            return Math.min(left, right) + 1;
        }
    }

}