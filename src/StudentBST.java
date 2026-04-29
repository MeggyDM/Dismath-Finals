import java.util.ArrayList;
import java.util.List;

/**
 * ===== TOPIC: TREES (Binary Search Tree) =====
 *
 * A simple Binary Search Tree that stores Student records
 * using the Student ID as the key.
 *
 * BST rule: for every node,
 *   - all IDs in the LEFT subtree are SMALLER than the node's ID
 *   - all IDs in the RIGHT subtree are LARGER than the node's ID
 *
 * YOUR JOB:
 *   Implement add, search, displayInOrder, and getAllStudents.
 *   The Node class below is given to you.
 */
public class StudentBST {

    // Each Node holds a Student plus references to left and right children.
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
        // TODO: Insert the given student into the BST.
        //   - If root is null, make this student the root and return true.
        //   - Otherwise, follow the BST rule:
        //       smaller ID -> go LEFT,
        //       larger  ID -> go RIGHT.
        //   - When you reach an empty spot, plant the new Node there.
        //   - If a student with the same ID already exists, return false (no duplicates).
        //   - Use a recursive helper method if it helps.
        return false;
    }

    // ---------- SEARCH ----------
    public Student search(int id) {
        // TODO: Find and return the student with the given ID.
        //   - Walk the tree using the BST rule:
        //       if id == current node's ID -> return that student
        //       if id  < current node's ID -> search the LEFT subtree
        //       if id  > current node's ID -> search the RIGHT subtree
        //   - If you reach a null spot, the student is not in the tree (return null).
        //   - Use a recursive helper method if it helps.
        return null;
    }

    // ---------- IN-ORDER DISPLAY ----------
    public void displayInOrder() {
        // TODO: Print every student using IN-ORDER traversal.
        //   - The traversal order is: LEFT subtree, then current node, then RIGHT subtree.
        //   - Because of the BST rule, this prints the students sorted by ID.
        //   - If the tree is empty, print "(no students yet)".
        //   - Print each student with System.out.println(node.student);
        //   - Use a recursive helper method if it helps.
    }

    // ---------- HELPER for the Quantifier module ----------
    public List<Student> getAllStudents() {
        // TODO: Return every student in the tree as a List<Student>.
        //   - Walk the tree the same way as displayInOrder,
        //     but instead of printing each student, ADD it to a list.
        //   - Return the list at the end.
        return new ArrayList<>();
    }

    public boolean isEmpty() {
        return root == null;
    }
}
