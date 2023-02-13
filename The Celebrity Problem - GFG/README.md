# The Celebrity Problem
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.<br>
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j &nbsp;is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.<br>
<strong>Note:</strong> Follow 0 based indexing.<br>
<strong>Follow Up:</strong> Can you optimize it to O(N)</span><br>
&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
<strong>Output:</strong> 1
<strong>Explanation: </strong>0th and 2nd person both
know 1. Therefore, 1 is the celebrity. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
M[][] = {{0 1},
         {1 0}}
<strong>Output:</strong> -1
<strong>Explanation: </strong>The two people at the party both
know each other. None of them is a celebrity.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Complete the function <strong>celebrity()</strong> which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N^2)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
2 &lt;= N &lt;= 3000<br>
0 &lt;= M[][] &lt;= 1</span></p>
</div>