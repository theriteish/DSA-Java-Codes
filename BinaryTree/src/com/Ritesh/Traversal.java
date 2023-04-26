package com.Ritesh;

//import javax.swing.tree.TreeNode;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Traversal {

    public static void preTraversal(TreeNode node){
        if(node == null){
            return;
        }
        //print the new node:
        System.out.print(node.val);

        //left subtree call:
        preTraversal(node.left);

        //right subtree call:
        preTraversal(node.right);
    }
}
