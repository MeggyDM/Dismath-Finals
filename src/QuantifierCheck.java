import java.util.List;

/**
 * ===== TOPIC: QUANTIFIERS =====
 *
 * Two checks are provided. You only need to FULLY IMPLEMENT ONE for the
 * project (per the brief), but both signatures are given so you can choose.
 *
 *   checkAllBSIT          -> Universal Quantifier   (∀ "for all")
 *   checkAnyIdAbove1000   -> Existential Quantifier (∃ "there exists")
 *
 * Reminder:
 *   - A ∀ check loops through the list and returns FALSE the moment
 *     it finds ONE student that does NOT satisfy the condition
 *     (that student is the COUNTER-EXAMPLE).
 *   - A ∃ check loops through the list and returns TRUE the moment
 *     it finds ONE student that DOES satisfy the condition
 *     (that student is the EXAMPLE).
 */
public class QuantifierCheck {

    public static void checkAllBSIT(List<Student> students) {
        // TODO: Implement the UNIVERSAL quantifier check (∀).
        //   Statement: ∀x (Course(x) = "BSIT")
        //   Meaning  : "For ALL students, the course is BSIT."
        //
        //   Steps:
        //     1. Print the symbolic statement and the English translation.
        //     2. Handle the empty list case (vacuously TRUE - no students to check).
        //     3. Loop through every student.
        //          - If you find ONE student whose course is NOT "BSIT",
        //            print "Result: FALSE" and that student as the COUNTER-EXAMPLE,
        //            then stop (return).
        //     4. If the loop finishes without finding a counter-example,
        //        print "Result: TRUE".
        //
        //   Tip: use s.getCourse().equalsIgnoreCase("BSIT") for the comparison.
    }

    public static void checkAnyIdAbove1000(List<Student> students) {
        // TODO: Implement the EXISTENTIAL quantifier check (∃).
        //   Statement: ∃x (ID(x) > 1000)
        //   Meaning  : "THERE EXISTS a student whose ID is greater than 1000."
        //
        //   Steps:
        //     1. Print the symbolic statement and the English translation.
        //     2. Loop through every student.
        //          - If you find ONE student whose ID is greater than 1000,
        //            print "Result: TRUE" and that student as the EXAMPLE,
        //            then stop (return).
        //     3. If the loop finishes without finding a match,
        //        print "Result: FALSE".
    }
}
