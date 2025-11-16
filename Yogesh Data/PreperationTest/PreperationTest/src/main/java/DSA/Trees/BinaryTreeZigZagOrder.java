package DSA.Trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode2 {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode root;

    TreeNode2(int data) {
        this.data = data;
    }

    TreeNode2(TreeNode root) {
        this.root = root;
    }

    TreeNode2(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeZigZagOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        boolean reverse = false;
        Deque<TreeNode> queue = new LinkedList<>();
        // offer method => it remove the top of the element from the queue
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {

                if (!reverse) {
                    TreeNode currNode = queue.pollFirst();
                    if(currNode != null){
                        currentLevel.add(currNode.data);
                    }
                    if (currNode.left != null) {
                        queue.addLast(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.addLast(currNode.right);
                    }

                } else {
                    TreeNode currNode = queue.pollLast();
                    if(currNode != null){
                        currentLevel.add(currNode.data);
                    }
                    if (currNode.right != null) {
                        queue.addFirst(currNode.right);
                    }
                    if (currNode.left != null) {
                        queue.addFirst(currNode.left);
                    }

                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    public List<List<Integer>> BinaryTreeLevelOrderTraversalFromBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        boolean reverse = false;
        Deque<TreeNode> queue = new LinkedList<>();
        // offer method => it remove the top of the element from the queue
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {

                if (!reverse) {
                    TreeNode currNode = queue.pollFirst();
                    if(currNode != null){
                        currentLevel.add(currNode.data);
                    }
                    if (currNode.left != null) {
                        queue.addLast(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.addLast(currNode.right);
                    }

                } else {
                    TreeNode currNode = queue.pollLast();
                    if(currNode != null){
                        currentLevel.add(currNode.data);
                    }
                    if (currNode.right != null) {
                        queue.addFirst(currNode.right);
                    }
                    if (currNode.left != null) {
                        queue.addFirst(currNode.left);
                    }

                }
            }
            reverse = !reverse;
            result.add(0,currentLevel);
        }
        return result;
    }

}



