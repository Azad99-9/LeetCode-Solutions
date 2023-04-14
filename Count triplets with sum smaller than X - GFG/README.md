# Count triplets with sum smaller than X
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of distinct integers of size <strong>N</strong> and a value <strong>sum</strong>, the task is to find the count of triplets <strong>(i, j, k)</strong>, having <strong>(i&lt;j&lt;k)&nbsp;</strong>with the sum of<strong> <strong>(arr[i] + arr[j] + arr[k])</strong>&nbsp;</strong>smaller than the given value sum.</span></p>

<p><br>
<strong><span style="font-size:18px"><strong>Example 1:</strong></span></strong></p>

<pre><strong>
<span style="font-size:18px"><strong>Input: </strong></span></strong><span style="font-size:18px">N = 4, sum = 2
arr[] = {-2, 0, 1, 3}</span><strong><span style="font-size:18px">
<strong>Output:</strong>  </span></strong><span style="font-size:18px">2</span><strong><span style="font-size:18px">
<strong>Explanation</strong>: </span></strong><span style="font-size:18px">Below are triplets with 
sum less than 2 (-2, 0, 1) and (-2, 0, 3). </span>
</pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px"><strong>Example 2:</strong></span></strong></p>

<pre><strong>
<span style="font-size:18px"><strong>Input: </strong></span></strong><span style="font-size:18px">N = 5, sum = 12
arr[] = {5, 1, 3, 4, 7}</span><strong><span style="font-size:18px">
<strong>Output:</strong> </span></strong><span style="font-size:18px">4</span><strong><span style="font-size:18px">
<strong>Explanation</strong>: </span></strong><span style="font-size:18px">Below are triplets with 
sum less than 12 (1, 3, 4), (1, 3, 5), 
(1, 3, 7) and (1, 4, 5).
</span></pre>

<p><br>
<strong><span style="font-size:18px"><strong>Your Task:</strong></span></strong><br>
<span style="font-size:18px">This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countTriplets() that take array arr[],&nbsp;integer N&nbsp; and integer&nbsp;sum&nbsp;as parameters and returns the count of triplets.</span></p>

<p><br>
<strong><span style="font-size:18px"><strong>Expected Time Complexity:</strong> </span></strong><span style="font-size:18px">O(N<sup>2</sup>).</span><br>
<strong><span style="font-size:18px"><strong>Expected Auxiliary Space:</strong> </span></strong><span style="font-size:18px">O(1).</span></p>

<div><br>
<strong><span style="font-size:18px"><strong>Constraints:</strong></span></strong><br>
<span style="font-size:18px">3 ≤ N ≤ 10<sup>3</sup></span></div>

<div><span style="font-size:18px">-10<sup>3</sup>&nbsp;≤ arr[i]&nbsp;≤ 10<sup>3</sup></span></div>
</div>