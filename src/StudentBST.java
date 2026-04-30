import java.util.*;

public class StudentBST {
    private static class Node {
        Student student;
        Node left;
        Node right;

        Node(Student student) {
            this.student = student;
        }
    }

    private Node root;

    // ---------- ADD ----------
    public boolean add(Student s) {
        if (root == null) {
            root = new Node(s);
            return true;
        }
        return addRecursive(root, s);
    }

    private boolean addRecursive(Node current, Student s) {
        // If ID matches, we don't allow duplicates
        if (s.getId() == current.student.getId()) {
            return false;
        }

        // If new ID is smaller, go left
        if (s.getId() < current.student.getId()) {
            if (current.left == null) {
                current.left = new Node(s);
                return true;
            }
            return addRecursive(current.left, s);
        }
        // If new ID is larger, go right
        else {
            if (current.right == null) {
                current.right = new Node(s);
                return true;
            }
            return addRecursive(current.right, s);
        }
    }

    // ---------- SEARCH ----------
    public Student search(int id) {
        return searchRecursive(root, id);
    }

    private Student searchRecursive(Node current, int id) {
        // Base case: ID not found
        if (current == null) {
            return null;
        }

        // Base case: ID found
        if (id == current.student.getId()) {
            return current.student;
        }

        // Recursive search based on BST rule
        return id < current.student.getId()
                ? searchRecursive(current.left, id)
                : searchRecursive(current.right, id);
    }

    // ---------- IN-ORDER DISPLAY ----------
    public void displayInOrder() {
        if (isEmpty()) {
            System.out.println("(no students yet)");
        } else {
            displayInOrderRecursive(root);
        }
    }

    private void displayInOrderRecursive(Node current) {
        if (current != null) {
            displayInOrderRecursive(current.left);   // 1. Visit Left
            System.out.println(current.student);     // 2. Visit Root
            displayInOrderRecursive(current.right);  // 3. Visit Right
        }
    }

    // ---------- HELPER for the Quantifier module ----------
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        collectRecursive(root, list);
        return list;
    }

    private void collectRecursive(Node current, List<Student> list) {
        if (current != null) {
            collectRecursive(current.left, list);
            list.add(current.student);
            collectRecursive(current.right, list);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }
}