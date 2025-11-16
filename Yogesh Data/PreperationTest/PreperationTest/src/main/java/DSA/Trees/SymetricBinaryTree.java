package DSA.Trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode10 {
    int val;
    TreeNode10 left;
    TreeNode10 right;
    TreeNode10 next;

    public TreeNode10(int val) {
        this.val = val;
    }

    public TreeNode10(int val, TreeNode10 left, TreeNode10 right, TreeNode10 next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}


public class SymetricBinaryTree {

//     1
//2     3
//4  5  6  7

   public boolean SymetricBinaryTree(TreeNode10 root) {
       if(root == null){
           return false;
       }
       Queue<TreeNode10> queue = new LinkedList<>();
               queue.add(root.left);
               queue.add(root.right);

       while (!queue.isEmpty()) {
           TreeNode10 left = queue.poll();
           TreeNode10 right = queue.poll();


           if(left == null && right == null){
              continue;
           }

           if(left == null || right == null){
               return false;
           }

           if(left.val != right.val){
               return false;
           }

                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
           }
       return true;
   }


   int diameter = 0;
   public int diameter(TreeNode10 root) {
       height(root);
       return diameter -1;
   }
       int height(TreeNode10 node) {
           if (node != null) {
               return 0;
           }
           int heightleft = height(node.left);
           int rightheight = height(node.right);

           int dia = heightleft + rightheight + 1;
           diameter = Math.max(diameter, dia);
           return  Math.max(heightleft, rightheight) + 1;

   }


    public TreeNode10 invertTree(TreeNode10 root) {

        if (root == null) {
            return null;
        }

        TreeNode10 leftNode = invertTree(root.left);
        TreeNode10 rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }

    public int maxDepth(TreeNode10 root) {

        if (root == null) {
            return 0;
        }

        int heightleft = maxDepth(root.left);
        int rightheight = maxDepth(root.right);


        return Math.max(heightleft, rightheight) + 1;
    }


    public void flattern(TreeNode10 root){

       TreeNode10  current = root;
       while(current != null){
           if(current.left != null){
               TreeNode10 temp  = current.left;

               while(temp.right != null){
                   temp = temp.right;
               }
              temp.right = current.right;
               current.right = current.left;
               current.left = null;
           }
           current = current.right;
       }


    }

    public boolean isValidBSTTree(TreeNode10 root) {
       return helperRecuriveCalls(root, null , null);

    }

    boolean helperRecuriveCalls(TreeNode10 root, Integer low, Integer high) {

        if (root != null) {
            return true;
        }
        if (low != null && root.val <= low) {
            return false;
        }
        if (high != null && root.val >= high) {
            return false;
        }
        boolean left = helperRecuriveCalls(root.left, low, high);
        boolean right = helperRecuriveCalls(root.right, low, high);
        return left && right;
    }

    public TreeNode10 lowestCommonAncestor(TreeNode10 root, TreeNode10 p, TreeNode10 q) {
       if(root == null){
           return null;
       }
       if(root == p || root == q){
           return root;
       }

        TreeNode10 left = lowestCommonAncestor(root.left, p, q);
        TreeNode10 right = lowestCommonAncestor(root.right, p, q);

       if(left != null && right != null){
           return root;
       }
       return left != null ? left : right;

    }

    public int KthElement(TreeNode10 root, int k) {
      return helperKthElement(root, k).val;
    }

    public TreeNode10 helperKthElement(TreeNode10 root, int k){
       int count =0;

       if(root == null){
           return null;
       }

       TreeNode10 left = helperKthElement(root.left, k);

       if(left != null){
           return left;
       }

        count++;

       if(count == k){
           return root;
       }
       return helperKthElement(root.right, k);
    }

    // Encodes a tree to a single string.
    public List<String>  serialize(TreeNode10 root) {
        List<String> list = new LinkedList<>();
        helperSerialized(root, list);
        return list;
    }

    public void helperSerialized(TreeNode10 root, List<String> list) {

        if (root == null) {
            list.add("null");
            return;
        }

        list.add(String.valueOf(root.val));
        helperSerialized(root.left, list);
        helperSerialized(root.right, list);

    }
    // Decodes your encoded data to tree.
    public TreeNode10 deserialize(List<String> list) {

        Collections.reverse(list);
        TreeNode10 node = helperDeserialized(list);
       return node;
    }

    public TreeNode10 helperDeserialized(List<String> list){
       if(list.isEmpty()){
           return null;
       }

       String val = list.remove(list.size() - 1);

       if(val.charAt(0) == 'n'){
           return null;
       }

        TreeNode10 node = new TreeNode10(Integer.parseInt(val));
       node.left =  helperDeserialized(list);
       node.right = helperDeserialized(list);

return node;
    }

public boolean hasPathSum(TreeNode10 root, int sum){
       if(root == null){
           return false;
       }

       if(root.val == sum  && root.left == null && root.right == null){
           return true;
       }

       return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);

}

    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    public int helper(TreeNode root, int sum){

        if(root == null){
            return 0;
        }
        sum = sum * 10 + root.data;
        if(root.left == null && root.right == null){
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
    }


    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode10 root){

       helperMaxPath(root);
       return ans;
    }

    private int helperMaxPath(TreeNode10 root) {
        if(root == null){
            return 0;
        }

        int left = helperMaxPath(root.left);
        int right = helperMaxPath(root.right);

        left = Math.max(0,left);
        right =Math.max(0,right);

        int pathSum = left + right + root.val;

        ans = Math.max(ans, pathSum);

        return Math.max(left, right) + root.val;
    }


    boolean findpath(TreeNode10 node, int[] arr) {
        if (node == null) {
            return arr.length == 0;
        }
        return helperFindPath(node, arr, 0);

    }

    public boolean helperFindPath(TreeNode10 node,int[] arr, int index) {

        if (node == null) {
            return false;
        }
        if (index >= arr.length || node.val != arr[index]) {
            return false;
        }

        if (node.left == null && node.right == null && index == arr.length - 1) {
            return true;
        }
        return helperFindPath(node.left, arr, index + 1) || helperFindPath(node.right, arr, index + 1);

    }
}
