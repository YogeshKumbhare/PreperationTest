package DSA.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode root;

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(TreeNode root) {
        this.root = root;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class AverageBinaryTreeLevelOrderTranversal {

    public double levelOrder(TreeNode root) {
        List<List<Double>> result = new ArrayList<>();
        if (root == null) {
            return -1;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        // offer method => it remove the top of the element from the queue

        queue.offer(root);

        double averageLevel = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Double> level = new ArrayList<>(levelSize);
            averageLevel = 0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                averageLevel += currentNode.data;
                level.add((double) currentNode.data);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
            averageLevel = averageLevel / level.size();
            result.add(level);
        }
        return averageLevel;
    }
}
