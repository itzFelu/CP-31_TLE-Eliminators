Problem Title

Find the Nth Term of a Mixed Geometric Series

Problem Statement

Consider the following series:

1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, ...

This series is formed by mixing two geometric series:

The odd-positioned terms (1st, 3rd, 5th, ...) form a geometric series with common ratio 2.

The even-positioned terms (2nd, 4th, 6th, ...) form another geometric series with common ratio 3.

Given an integer N, determine the Nth term of the series.

Input

The first line contains a single integer T — the number of test cases.

Each of the next T lines contains a single integer N.

Constraints:
1≤𝑇≤100
1≤N≤30

Output

For each test case, print the Nth term of the series.
Do not print any extra characters or spaces.

Example
Input
5
1
2
3
6
16

Output
1
1
2
9
2187