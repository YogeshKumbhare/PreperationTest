package DSA.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode1 {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode root;

    TreeNode1(int data) {
        this.data = data;
    }

    TreeNode1(TreeNode root) {
        this.root = root;
    }

    TreeNode1(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class BinaryTreeLevelOrderTranversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        // offer method => it remove the top of the element from the queue
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                assert currentNode != null;
                level.add(currentNode.data);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
            result.add(level);
        }
        return result;
    }
}
