package com.example.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewOfBinaryTree {
    Node root;
    static int max_level = 0;

    public static void main(String[] args) {
        PrintLeftViewOfBinaryTree tree = new PrintLeftViewOfBinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(5);
        tree.root.right = new Node(2);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(1);
        tree.root.right.left.left = new Node(6);
        tree.root.right.left.right = new Node(7);

        tree.leftView(tree.root);
    }

    public void leftView(Node root){
        if(root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();

            for (int i = 1; i <= n; i++) {
                Node node = queue.poll();
                if(i==1){
                    System.out.println(node.data+" ");
                }
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
        }
    }


}

class Node{
    int data;
    Node left,right;
    public Node(int a){
        this.data = a;
    }
}