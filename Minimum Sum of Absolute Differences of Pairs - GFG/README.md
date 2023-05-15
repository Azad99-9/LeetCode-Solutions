# Minimum Sum of Absolute Differences of Pairs
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given two arrays <strong>A</strong>&nbsp;and <strong>B</strong>&nbsp;of equal length <strong>N</strong>. Your task is to pair each element of array <strong>A</strong>&nbsp;to an element in array <strong>B</strong>, such that the sum&nbsp;of the&nbsp;<strong>absolute differences </strong>of all the pairs<strong> </strong>is<strong> minimum.</strong></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">N = 4</span>
<span style="font-size:18px">A = {4,1,8,7}</span>
<span style="font-size:18px">B = {2,3,6,5}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">6</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">If we take the pairings as (1,2), (4,3),
(7,5), and (8,6), the sum will be S =
|1 - 2| + |4 - 3| + |7 - 5| + |8 - 6| = 6.
It can be shown that this is the minimum sum we can get.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">N = 3</span>
<span style="font-size:18px">A = {4,1,2}</span>
<span style="font-size:18px">B = {2,4,1}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">0</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">If we take the pairings as (4,4), (1,1), and
(2,2), the sum will be S = |4 - 4| + |1 - 1| +
|2 - 2| = 0. It can be shown that this is the
minimum sum we can get.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>findMinSum()</strong>&nbsp;which takes the arrays&nbsp;<strong>A[], B[],</strong>&nbsp;and its size <strong>N&nbsp;</strong>as inputs and returns the <strong>minimum</strong> sum of the absolute differences of the pairs.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*log(N))<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N&nbsp;&lt;= 10<sup>5</sup><br>
0 &lt;= A[i] &lt;= 10<sup>9</sup><br>
0 &lt;= B[i] &lt;= 10<sup>9</sup><br>
Sum of N over all test cases doesn't exceeds 10<sup>6</sup></span></p>
</div>