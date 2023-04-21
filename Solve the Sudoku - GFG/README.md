# Solve the Sudoku
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an&nbsp;incomplete <a href="https://en.wikipedia.org/wiki/Sudoku"><strong>Sudoku&nbsp;</strong></a>configuration in terms of a 9 x 9 &nbsp;2-D square matrix (grid[][]), the task to find a solved Sudoku. For simplicity, you may assume&nbsp;that there will be only one unique solution.</span></p>

<p><span style="font-size:18px">A sudoku solution must satisfy&nbsp;<strong>all of the following rules</strong>:</span></p>

<ol>
	<li><span style="font-size:18px">Each of the digits&nbsp;<code>1-9</code>&nbsp;must occur exactly once in each row.</span></li>
	<li><span style="font-size:18px">Each of the digits&nbsp;<code>1-9</code>&nbsp;must occur exactly once in each column.</span></li>
	<li><span style="font-size:18px">Each of the digits&nbsp;<code>1-9</code>&nbsp;must occur exactly once in each of the 9&nbsp;<code>3x3</code>&nbsp;sub-boxes of the grid.</span></li>
</ol>

<p><br>
<span style="font-size:18px"><strong>Sample Sudoku for you to get the logic for its solution:</strong><br>
<br>
<img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/sudoku.png" style="height:247px; width:286px"></span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">grid[][] = 
[[3 0 6 5 0 8 4 0 0],
[5 2 0 0 0 0 0 0 0],
[0 8 7 0 0 0 0 3 1 ],</span>
<span style="font-size:18px">[0 0 3 0 1 0 0 8 0],
[9 0 0 8 6 3 0 0 5],
[0 5 0 0 9 0 6 0 0],
[1 3 0 0 0 0 2 5 0],
[0 0 0 0 0 0 0 7 4],
[0 0 5 2 0 6 3 0 0]]
<strong>Output:
</strong>3 1 6 5 7 8 4 9 2
5 2 9 1 3 4 7 6 8
4 8 7 6 2 9 5 3 1
2 6 3 4 1 5 9 8 7
9 7 4 8 6 3 1 2 5
8 5 1 7 9 2 6 4 3
1 3 8 9 4 7 2 5 6
6 9 2 3 5 1 8 7 4
7 4 5 2 8 6 3 1 9
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You need to complete the two functions:<br>
<strong>SolveSudoku()</strong>: Takes a grid as its argument and returns true if a solution is possible and false if it is not.<br>
<strong>printGrid()</strong>: Takes a grid as its argument and prints the 81 numbers of the solved Sudoku in a single line with space separation.<br>
<strong>NOTE:</strong> Do not give a new line character after printing the grid. It has already been taken care of in the Driver Code.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(9<sup>N*N</sup>).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N*N).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
0 ≤ grid[i][j] ≤ 9</span></p>
</div>