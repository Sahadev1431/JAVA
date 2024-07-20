import java.lang.reflect.Array;
import java.util.*;

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
        
        List<List<Integer>>list = new LinkedList<List<Integer>>();
        list = levelOrderTraveres(root);

        System.out.println("\nLevel order traverse");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Integer> itereativePreList = new ArrayList<>();
        itereativePreList = iterativePreOrder(root);
        System.out.println("\nIterative preorder traverse");
        for (Integer integer : itereativePreList) {
            System.out.print(integer+ " ");
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

    static List<List<Integer>> levelOrderTraveres(Node root) {
        Queue<Node>queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        if (root == null) return wrapList;
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    static List<Integer> iterativePreOrder(Node root) {
        List<Integer>list = new ArrayList<>();
        if (root == null) return list;
        Stack<Node>stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }
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