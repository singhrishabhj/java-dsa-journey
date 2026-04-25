# Marks Grade Flowchart 

## Problem

Assign grade based on marks.

---

## Conditions

* Marks > 75 → Grade A
* Marks ≥ 65 and < 75 → Grade B
* Marks ≥ 55 and < 65 → Grade C
* Marks ≥ 45 and < 55 → Grade D
* Marks < 45 → Fail

---

## Steps (Algorithm Thinking)

1. Start
2. Input marks M
3. Check M > 75

   * Yes → Print "A"
   * No → Next condition
4. Check M ≥ 65

   * Yes → Print "B"
   * No → Next condition
5. Check M ≥ 55

   * Yes → Print "C"
   * No → Next condition
6. Check M ≥ 45

   * Yes → Print "D"
   * No → Print "Fail"
7. End

---

## Flowchart Diagram

![Marks Grade Flowchart](https://www.programiz.com/sites/tutorial2program/files/flowchart-if-else-if.png)

*Reference: Flowchart representing multiple conditions using if-else-if logic.*

---

## Flowchart (Text Representation)

Start
↓
Input M
↓
M > 75 ?
→ Yes → A → End
→ No ↓
M ≥ 65 ?
→ Yes → B → End
→ No ↓
M ≥ 55 ?
→ Yes → C → End
→ No ↓
M ≥ 45 ?
→ Yes → D → End
→ No → Fail → End

---

## Understanding

* Uses **multiple decision checks (if-else ladder)**
* Order of conditions matters
* First true condition executes

---

## Mistakes I made

* Wrong condition order
* Overlapping ranges
* Forgot boundary values

---

## Key Takeaway

Complex problems are solved using **multiple conditional checks in sequence**.
