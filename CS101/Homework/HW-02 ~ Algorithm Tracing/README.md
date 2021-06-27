### HW-02 ~ Algorithm Tracing

Using the (slightly modified) exam average algorithm below: 

* **determine what memory locations are required,**  
what they should be named,  
what type of information they should be allowed to hold,  
and, if they are constants, their initial value.
* **& then**, using those memory locations, **trace the algorithm,**  
assuming there are four exam papers **with grades 4, 8, 3 & 6**

    ```
    Given the set of graded exam papers, find and report the average grade.

    Set number of papers to zero
    For every paper in the set of graded exam papers
    add one to the number of papers
    Set sum of grades so far to zero
    For each paper in the set of graded exam papers
    read the grade from the paper,
    add grade to the sum of grades so far
    Set sum of all grades to sum of grades so far
    Compute average grade as sum of all grades / number of papers
    Report average grade.
    ```

Notes:

* Remember the rules:
    * information is written on piece of paper & cannot be changed,  
    * keep paper in a box (memory location) identified by name or number  
    * one piece of paper per box, replacing paper destroys original,  
    * there is always a paper in the box (initially with random/unknown information on it),  
    * you can examine/copy the contents of a box (the paper) as much as you want.

* For this homework: decide on the boxes (memory locations) you need, 
and then **form a table whose columns are:**
    * **the sequence number** ( a natural number starting from 0, 1, 2, 3, 4, 5... ), 
    * **the algorithm step number** (using the format shown on the slides with sub-steps numbered using the dot notation... ) 
        * for example, if step "3" has three sub-steps, they would be labelled "3.1", "3.2" & "3.3", and if step "3.2" had two further sub-steps, they would be labelled "3.2.1" & "3.2.2" respectively;  in the case of alternation/decision, the 'then' clause would be labelled, say "3T", while the 'else' clause would be "3F", and if "3T" had two sub-steps, they would be "3T.1" & "3T.2".
    * and a column for each of **the boxes you will use** (e.g. "radius", "pi", "number of items", "tax rate", "area"... )

**Each row of the table will show the values** of the sequence number, the current algorithm step number, and the contents of each column's box at that step.
