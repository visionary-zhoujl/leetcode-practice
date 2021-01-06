package simple;

import common.TreeNode;

public class IsBalanced {
    public static void main(String[] args) {
    }
    private boolean res = true;
    public  boolean solution(TreeNode root){
        f(root);
        return res;
    }

    private  int f(TreeNode treeNode){
        if (treeNode ==null){
            return 0;
        }
        int leftHeight = f(treeNode.left);
        int rightHeight = f(treeNode.right);
        if (Math.abs(leftHeight-rightHeight)>1){
            res = false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
