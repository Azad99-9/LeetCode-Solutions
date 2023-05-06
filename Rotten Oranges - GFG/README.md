# Rotten Oranges
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a grid&nbsp;of dimension <strong>nxm</strong>&nbsp;where each cell in the grid&nbsp;can have values 0, 1 or 2 which has the following meaning:</span><br>
<span style="font-size:18px"><strong>0 </strong>: Empty cell </span><br>
<span style="font-size:18px"><strong>1</strong> : Cells have fresh oranges </span><br>
<span style="font-size:18px"><strong>2</strong> : Cells have rotten oranges </span></p>

<p><span style="font-size:18px">We have to determine what is the minimum time required to rot all oranges. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (<strong>up</strong>, <strong>down</strong>, <strong>left</strong> and <strong>right</strong>) in unit time.&nbsp;</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>grid = {{0,1,2},{0,1,2},{2,1,1}}
<strong>Output: </strong>1
<strong>Explanation: </strong>The grid is-
0 1 2
0 1 2
2 1 1
Oranges at positions (0,2), (1,2), (2,0)
will rot oranges at (0,1), (1,1), (2,2) and 
(2,1) in unit time.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>grid = {{2,2,0,1}}
<strong>Output: </strong>-1
<strong>Explanation: </strong>The grid is-
2 2 0 1
Oranges at (0,0) and (0,1) can't rot orange at
(0,3).</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything, Your task is to complete the function&nbsp;<strong>orangesRotting()&nbsp;</strong>which takes grid as input parameter and returns the minimum time to rot all the fresh oranges. If not possible returns -1.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n*m)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(n*m)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n, m ≤ 500</span></p>
</div>