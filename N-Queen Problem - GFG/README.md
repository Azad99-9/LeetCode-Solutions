# N-Queen Problem
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">The n-queens puzzle is the problem of placing <strong>n</strong> queens on a&nbsp;(<strong>n×n)</strong> chessboard such that no two queens can&nbsp;attack each other.<br>
Given an integer n, find all distinct solutions to the n-queens puzzle. Each solution contains distinct board configurations of the n-queens’ placement, where the solutions are&nbsp;a permutation of [1,2,3..n] in increasing order, here&nbsp;the number in the <em>ith</em>&nbsp;place denotes&nbsp;that the <em>ith</em>-column queen is&nbsp;placed in the row with that number. For eg below figure represents a chessboard [3 1 4 2].<br>
<br>
<img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/ratinmaze_filled11-1.png" style="height:201px; width:231px"></span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
1
<strong>Output:</strong>
[1]
<strong>Explaination:</strong>
Only one queen can be placed 
in the single cell available.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
4
<strong>Output:</strong>
[2 4 1 3 ] [3 1 4 2 ]
<strong>Explaination:</strong>
These are the 2 possible solutions.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>nQueen()</strong> which takes n as input parameter and returns a list containing all the possible chessboard configurations in sorted order. Return an empty list if no solution exists.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n!)<br>
<strong>Expected Auxiliary Space:</strong> O(n<sup>2</sup>)&nbsp;</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 10&nbsp;</span></p>
</div>