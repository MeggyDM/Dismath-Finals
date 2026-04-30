import java.util.*;

/**
 * ===== TOPIC: QUANTIFIERS =====
 *
 * Implemented: Universal Quantifier (∀ "for all")
 * * Logic:
 * - A ∀ check returns FALSE the moment it finds ONE element
 * that does NOT satisfy the condition (the COUNTER-EXAMPLE).
 */
public class QuantifierCheck {

    public static void checkAllBSIT(List<Student> students) {
        // 1. Print symbolic and English statements
        System.out.println("Symbolic Statement: ∀x (Course(x) = \"BSIT\")");
        System.out.println("English Translation: \"For ALL students in the records, the course is BSIT.\"");

        // 2. Handle empty list (Vacuously True)
        if (students.isEmpty()) {
            System.out.println("Result: TRUE (Vacuously true because there are no students to check).");
            return;
        }

        // 3. Loop through every student to find a counter-example
        for (Student s : students) {
            // If we find ONE student NOT in BSIT, the "For All" statement is False
            if (!s.getCourse().equalsIgnoreCase("BSIT")) {
                System.out.println("Result: FALSE");
                System.out.println("Counter-Example Found: " + s);
                return; // Stop immediately
            }
        }

        // 4. If we reached here, no counter-example was found
        System.out.println("Result: TRUE");
        System.out.println("Every student in the system is currently enrolled in BSIT.");
    }

    // This method is left empty as only one implementation was required for the project.
    public static void checkAnyIdAbove1000(List<Student> students) {
        System.out.println("Existential check not implemented (Option A chosen).");
    }
}