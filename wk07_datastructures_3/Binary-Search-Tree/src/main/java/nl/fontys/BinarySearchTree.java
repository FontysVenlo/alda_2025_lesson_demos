package nl.fontys;

/**
 * Binary Search Tree.
 *
 * @param <K> Key data type
 * @param <V> Value data type
 */
public class BinarySearchTree<K extends Comparable<K>, V> {

    private class Node {

        K key;
        V value;
        Node left, right;

        Node(K k, V v) {
            key = k;
            value = v;
        }
    }

    private int n = 0;
    private Node root;

    public void put(K key, V val) {
        // uses private recursive put method:
        root = put(root, key, val);
    }

    public V get(K key) {
        // uses private recursive get method:
        return get(root, key);
    }

    private Node put(Node x, K key, V val) {

        if (x == null) {
            n++;
            return new Node(key, val);
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.value = val;
        }
        return x;
    }

    private V get(Node x, K key) {

        if (x == null) {
            return null;
        }

        int cmp = key.compareTo(x.key);

        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.value;
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void print() {
        if (root != null) {
            print(root, "", "ROOT");
        } else {
            System.out.println("Empty Tree");
        }
    }

    private void print(Node t, String indent, String side) {

        System.out.println(indent + side + " KEY " + t.key);
        indent += "|\t";

        if (t.left != null) {
            print(t.left, indent, "LEFT");
        } else {
            System.out.println(indent + "LEFT <NULL>");
        }

        if (t.right != null) {
            print(t.right, indent, "RIGHT");
        } else {
            System.out.println(indent + "RIGHT <NULL>");
        }
    }

    boolean isBST() {
        // Quiz. Still to be implemented.
        return true;
    }

    private boolean isBST(Node t) {
        // Quiz. Still to be implemented.
        return true;
    }

    // Quiz
    K findMin() {
        // Quiz. Still to be implemented.
        return null;
    }

    K findMinRecursively() {
        // Quiz. Still to be implemented.
        return null;
    }

    private K findMinRecursively(Node node) {
        // Quiz. Still to be implemented.
        return null;
    }
}
