package simple;

import common.TreeNode;

import java.util.*;

public class LevelOrderBottom {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        solution(root);
    }

    public static List<List<Integer>> solution(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root!=null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0;i<size;++i){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right!=null){
                    queue.add(treeNode.right);
                }

            }
            result.add(list);

        }
        Collections.reverse(result);

        return result;
    }
}
