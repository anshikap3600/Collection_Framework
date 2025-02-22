import java.util.*;
import java.util.LinkedList;

public class Binary_Tree {
    static class  Node{
         int data;
         Node left;
         Node right;
         Node(int data){
             this.data = data;
             this.left = null;
             this.right = null;
         }
    }
    static class binaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    // PreOrder Traversal
  public static void preOrder(Node root){
      if(root == null){
          return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
  }
  // Inorder Traversal
  public static void InOrder(Node root){
        if(root == null){
            return;
        }
      InOrder(root.left);
      System.out.print(root.data+" ");
      InOrder(root.right);
  }
  // PostOrder Traversal
  public static void PostOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
      System.out.println(root.data+" ");
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
              System.out.print(currNode.data + " ");
              if (currNode.left != null) {
                  q.add(currNode.left);
              }
              if (currNode.right != null) {
                  q.add(currNode.right);
              }
          }
      }
  }
   public  static  int countOfNodes(Node root){
        if(root == null){
            return  0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
   }
   public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = heightOfTree(root.left);
        int rightNode = heightOfTree(root.left);
         int Max_Heigth = Math.max(leftNode, rightNode) + 1;
         return Max_Heigth;
   }
    public static void main(String args[]){
        int[] nodes= {1, 2, 4, -1, -1, 5, -1, -1, 3,-1, 6, -1, -1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Print the node in PreOrder");
        preOrder(root);
        System.out.println();
        System.out.println("Print the node in InOrder");
        InOrder(root);
        System.out.println();
        System.out.println("Print the node in PreOrder");
        PostOrder(root);
        System.out.println("Print the nodes in LevelOrder");
        levelOrder(root);
        System.out.println("Total Count of Nodes : "+countOfNodes(root));
        System.out.println("Total height of tree : "+heightOfTree(root));

    }
}
