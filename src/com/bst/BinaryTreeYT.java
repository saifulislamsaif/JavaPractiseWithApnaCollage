package com.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeYT {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                System.out.println(-1 + " ");
                return;
            }
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                System.out.println(-1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                System.out.println(-1 + " ");
                return;
            }
            postOrder(root.right);
            postOrder(root.left);
            System.out.println(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.println(currNode.data +" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }
        public static int height(Node root){
            if (root == null)
            {
                return 0;
            }
            int leftheight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftheight,rightHeight)+1;
        }


        public static void main(String[] args) {

            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
//            System.out.println("preOrder Data are");
//            preorder(root);
//            System.out.println("Inorder Data are");
//            inOrder(root);
//            System.out.println("PostOrder Data are");
//            postOrder(root);
            System.out.println("Level Order traversal are" + " ");
            levelOrder(root);

            System.out.println("max height"+" ");
            height(root);
        }
    }
}