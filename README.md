# 🧮 Java Console Projects

## ✅ Task 1: Basic Calculator

**Objective:**  
Create a Java program that works as a simple calculator in the console.

### Requirements:
- Ask the user to input:
  - First number
  - Operator (`+`, `-`, `*`, `/`, or `exit`)
  - Second number
- Use `switch-case` to perform the correct operation
- Repeat until user types `exit` as the operator
- Handle:
  - Invalid number input using `try-catch`
  - Division by zero using `try-catch`
- Use separate `static` methods for each operation

---

## ✅ Task 2: Number Guessing Game

**Objective:**  
Create a Java console application where the user tries to guess a randomly generated number.

### Requirements:
- Generate a random number between **1 and 20**
- Ask the user to guess the number
- Allow a **maximum of 5 attempts**
- Provide feedback for each guess:
  - “Too high”
  - “Too low”
  - “You won” (if guessed correctly)
- After 5 unsuccessful attempts, display:
  - “Your attempts over.”
  - “Correct answer: [number]”
- Use `try-catch` to:
  - Handle non-integer inputs (`InputMismatchException`)
  - Avoid program crashes on invalid input
- Use input validation to:
  - Ensure the guess is between **1 and 20**
- Use a separate `static` method `result(int guess, int rand)` to check the guess
