Master Theorem for Dividing Functions
The Master Theorem helps us find the time complexity of recursive algorithms where the input size is divided into smaller parts.
The general formula is:
T(n) = aT(n / b) + f(n)
Where:
a is the number of recursive calls.
b is the factor by which the input size is divided.
f(n) is the work done outside the recursive calls.

-The Three Cases
First, we calculate:
d = log_b(a)
Then we compare f(n) with n^d.
Case 1: f(n) grows slower than n^d
If f(n) is smaller than n^d by a polynomial factor, then:
T(n) = Θ(n^d)
Case 2: f(n) grows at the same rate as n^d
If f(n) = Θ(n^d), then:
T(n) = Θ(n^d log n)
Case 3: f(n) grows faster than n^d
If f(n) grows faster than n^d by a polynomial factor and the regularity condition is satisfied, then:
T(n) = Θ(f(n))

-Applying the Theorem to Our Functions

Function 1:
T(n) = T(n/2) + 1
a = 1, b = 2, f(n) = 1
n^(log₂ 1) = 1
This is Case 2 because f(n) = Θ(1).
Result:
T(n) = Θ(log n)

Function 2:
T(n) = T(n/2) + n
a = 1, b = 2, f(n) = n
n^(log₂ 1) = 1
The function f(n) grows faster than 1.
This is Case 3.
Result:
T(n) = Θ(n)

Function 3:
T(n) = 2T(n/2) + n
a = 2, b = 2, f(n) = n
n^(log₂ 2) = n
This is Case 2 because f(n) = Θ(n).
Result:
T(n) = Θ(n log n)

-Comparison of Task 2 Results
Function	a	b	f(n)	Master Theorem Case	Complexity
Function 1	1	2	1	Case 2	O(log n)
Function 2	1	2	n	Case 3	O(n)
Function 3	2	2	n	Case 2	O(n log n)

-Conclusion
The Master Theorem makes it easier to find the time complexity of dividing functions.
Function 1 has logarithmic complexity because it makes one recursive call and divides the input by 2.
Function 2 has linear complexity because the loop performs n operations, but the next recursive call works with a smaller input.
Function 3 has linearithmic complexity because it creates two recursive calls at each level, and the total work at every level is n.
The recursion tree and Master Theorem give the same results.

-Final Comparison of All Seven Functions
The following table shows the final time complexity of all functions analyzed in this coursework.

Task	Function	Recurrence	Time Complexity
Task 1	Function 1	T(n) = T(n-1) + 1	O(n)
Task 1	Function 2	T(n) = T(n-1) + n	O(n²)
Task 1	Function 3	T(n) = T(n-1) + log n	O(n log n)
Task 1	Function 4	T(n) = 2T(n-1) + 1	O(2ⁿ)
Task 2	Function 1	T(n) = T(n/2) + 1	O(log n)
Task 2	Function 2	T(n) = T(n/2) + n	O(n)
Task 2	Function 3	T(n) = 2T(n/2) + n	O(n log n)

-General Conclusion
In this coursework, I studied seven recursive functions and analyzed their time complexity.
I learned how to write recurrence relations from code, identify the number of recursive calls, calculate the work at each level, and find the recursion depth.
I also learned the difference between decreasing functions and dividing functions.
For decreasing functions, the input size becomes smaller by a fixed amount. For dividing functions, the input size is divided by a constant factor.
The recursion tree and Master Theorem helped me understand how the total running time grows.

-References
1. Thomas H. Cormen et al. — Introduction to Algorithms, 4th Edition.
2. GeeksforGeeks — Master Theorem.
3. MIT OpenCourseWare — Introduction to Algorithms.
4. Programiz — Recursion in Java.
