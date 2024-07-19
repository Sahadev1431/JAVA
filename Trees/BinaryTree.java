import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinaryTree {


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> preList = preOrderTraverse(root);
        System.out.println("Pre order traverse :");
        for (Integer ele : preList) {
            System.out.print(ele + " ");
        }


        ArrayList<Integer> postList = postOrderTraverse(root);
        System.out.println("\nPost order traverse");
        for (Integer ele : postList) {
            System.out.print(ele + " ");
        }


        ArrayList<Integer> inList = inOrderTraverse(root);
        System.out.println("\nIn order traverse");
        for (Integer ele : inList) {
            System.out.print(ele + " ");
        }
        
    }


    static void preOrder(Node root,ArrayList<Integer>list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    static ArrayList<Integer> preOrderTraverse(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        preOrder(root, list);
        return list;
    }

    static void postOrder(Node root,ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
    static ArrayList<Integer> postOrderTraverse(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        postOrder(root, list);
        return list;
    }

    static void inOrder(Node root,ArrayList<Integer> list) {
        if (root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    static ArrayList<Integer> inOrderTraverse(Node root) {
        ArrayList<Integer>list = new ArrayList<>();

        inOrder(root, list);
        return list;
    }
   
}
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }

}