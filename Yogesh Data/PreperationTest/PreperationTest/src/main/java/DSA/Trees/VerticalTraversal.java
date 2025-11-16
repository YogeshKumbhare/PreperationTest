package DSA.Trees;

import java.util.*;

public class VerticalTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode node) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if(node == null){
            return ans;
        }

        int col = 0;
        int min = 0;
        int max = 0;

        Queue<Map.Entry<TreeNode, Integer>> queue = new ArrayDeque<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        queue.add(new AbstractMap.SimpleEntry<>(node, col));

        while(!queue.isEmpty()){
            Map.Entry<TreeNode, Integer> entry = queue.remove();
            TreeNode currNode = entry.getKey();
            int currCol = entry.getValue();

            if(currNode.left != null){
                queue.add(new AbstractMap.SimpleEntry<>(currNode.left, currCol - 1));
            }

            if(currNode.right != null){
                queue.add(new AbstractMap.SimpleEntry<>(currNode.right, currCol + 1));
            }

            map.put(currCol, map.getOrDefault(currCol, new ArrayList<Integer>()));
            map.get(currCol).add(currNode.data);
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;



    }

    public static void main(String[] args) {

    }

}
