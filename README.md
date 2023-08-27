# COP2805FibonacciThreads
Jean Fernandez Rivera
Advanced Java
CRN COP 2805C

This was homework 7 of my advanced java class
the Fibonacci sequence of numbers is: 0 1 1 2 3 5 8 13 21

That is, starting with 0 and 1, every number after that is the previous two added together. What we want to do is write a couple of threads that find the n'th number of the Fibonacci sequence. So if n = 0, it would return 0, if n = 6, it would return 8, if n = 8 it would return 21.

Objective: Implement both methods of solving the Fibonacci sequence into two separate classes that extend the Thread class. The threads will have some way to set n before the thread is started. In the run() function, you will execute the algorithm and time how long it takes to get an answer. At the end, the thread will output the answer to the screen along with the number of milliseconds it took.
