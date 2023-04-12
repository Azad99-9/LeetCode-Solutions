# Max rectangle
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a binary matrix <strong>M </strong>of size <strong>n X m</strong>. Find the maximum area of a rectangle formed only of <strong>1s</strong> in the given matrix. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 4, m = 4
M[][] = {{0 1 1 0},
         {1 1 1 1},
         {1 1 1 1},
         {1 1 0 0}}
<strong>Output: </strong>8<strong>
Explanation: </strong>For the above test case the
matrix will look like
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
the max size rectangle&nbsp;is&nbsp;
1 1 1 1
1 1 1 1
and area is 4 *2 = 8</span><span style="font-size:18px">.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;</strong><br>
Your task is to complete the function <strong>maxArea</strong>&nbsp;which returns the maximum size rectangle area in a&nbsp;binary-sub-matrix with all 1’s. The function takes 3 arguments the first argument is&nbsp;the Matrix M[ ] [ ] and the next two are two&nbsp;integers n and m which denotes the size of the matrix M.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(n*m)<br>
<strong>Expected Auixiliary Space</strong> : O(m)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=n,m&lt;=1000<br>
0&lt;=M[][]&lt;=1<br>
<br>
<strong>Note:</strong>The <strong>Input/Ouput</strong> format and <strong>Example</strong> given are used for system's internal purpose, and should be used by a user for <strong>Expected Output</strong> only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.</span></p>
</div>