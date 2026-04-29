================================================================
  STARTER TEMPLATE - Mini Student Records & Campus Map
  Discrete Math Final Project
================================================================

WHAT'S IN THIS PROJECT
----------------------
You have FIVE Java files in src/. Two are already complete:

  Student.java        - DONE. The data class. Don't change it.
  Main.java           - DONE. The menu and helper methods.
                        Don't change it - it already calls
                        the methods you'll write.

The other three are EMPTY - you fill them in:

  StudentBST.java     - Trees topic.
                        Fill in: add, search, displayInOrder, getAllStudents.

  CampusGraph.java    - Graph Theory topic.
                        Fill in: constructor, addEdge, displayMap, shortestPath.

  QuantifierCheck.java - Quantifiers topic.
                        Fill in: ONE of the two methods (∀ or ∃) - your choice.


HOW TO OPEN IN ECLIPSE
----------------------
  1. Open Eclipse.
  2. File -> Import... -> General -> Existing Projects into Workspace -> Next
  3. Click "Select root directory" -> Browse...
  4. Choose the StarterTemplate folder.
  5. Tick "StarterTemplate" in the list -> Finish.
  6. Right-click Main.java -> Run As -> Java Application.

The program will COMPILE right away because every method has a stub.
It just won't DO anything until you fill in the TODOs.


WHERE TO START
--------------
1. Open StudentBST.java and look for "// TODO".
2. Implement add() first. Test by running Main and choosing [1] then [3].
   When [3] prints students sorted by ID, your BST is working.
3. Then implement search() and displayInOrder().
4. Move on to CampusGraph.java - constructor first, then displayMap,
   then shortestPath (the Dijkstra one).
5. Finally, pick ONE quantifier method in QuantifierCheck.java and write it.


PRE-LOADED SAMPLE DATA
----------------------
Main.java already adds 4 sample students at startup:
  ID 500  | Juan Dela Cruz | BSIT
  ID 250  | Maria Santos   | BSIT
  ID 750  | Pedro Reyes    | BSCS
  ID 1200 | Ana Garcia     | BSIT


GRADED PARTS
------------
Your grade comes from the THREE files you fill in:
  - StudentBST.java         (25 points)
  - CampusGraph.java         (25 points)
  - QuantifierCheck.java     (15 points)
  - Program runs cleanly     (10 points)
  - Comments / readability   (5 points)
  - Video walkthrough        (20 points)
  ----
  TOTAL                       100 points


JAVA VERSION
------------
Any Java 8 or newer. No external libraries needed.
