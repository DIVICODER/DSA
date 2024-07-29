import java.util.LinkedList;
import java.util.Queue;

class Tree {
    int data;
    Tree left;
    Tree right;
    Tree root;

    Tree() {
        this.root = null;
    }

    Tree(int input) {
        left = null;
        right = null;
        data = input;
    }

    Tree insert(int input) {
        root = insertelement(root, input);
        return root;
    }

    Tree insertelement(Tree root, int input) {
        if (root == null) {
            return new Tree(input);
        }
        if (root.data > input) {
            root.left = insertelement(root.left, input);
        } else if (root.data < input) {
            root.right = insertelement(root.right, input);
        }
        return root;
    }

    void levelOrder(Tree root) {
        if (root != null) {
            Queue<Tree> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Tree current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }
}

public class BST_LevelTraversal {
    public static void main(String args[]) {
        Tree t = new Tree();
        t.insert(20);
        t.insert(30);
        t.insert(40);
        t.insert(50);
        t.insert(70);
        t.levelOrder(t.root);
    }
}
