# Combination Sum
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of integers and a sum B, find all unique combinations in the array where the sum is equal to B. The same number may be chosen from the array&nbsp;any number of times to make B.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong><br>
&nbsp;&nbsp;&nbsp; &nbsp; &nbsp; <strong>1.</strong> All numbers will be positive integers.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong> 2.</strong> Elements in a combination (a1, a2, …, ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <strong>3.</strong> The combinations themselves must be sorted in ascending order.</span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 4
arr[] = {7,2,6,5}
B = 16
<strong>Output:
</strong>(2 2 2 2 2 2 2 2)
(2 2 2 2 2 6)
(2 2 2 5 5)
(2 2 5 7)
(2 2 6 6)
(2 7 7)
(5 5 6)</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 11
arr[] = {6,5,7,1,8,2,9,9,7,7,9}
B = 6
<strong>Output:
</strong>(1 1 1 1 1 1)
(1 1 1 1 2)
(1 1 2 2)
(1 5)
(2 2 2)
(6)<strong>
</strong></span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
Your task is to complete the function <strong>combinationSum()&nbsp;</strong>which takes the array A and a sum B as inputs and returns a list of list denoting the required combinations in the order specified in the problem description. The printing is done by the driver's code.&nbsp;If no set can be formed with the given set, then&nbsp; "Empty" (without quotes) is printed.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(X<sup>2</sup> * 2<sup>N</sup>), where X is average of summation B/arr<sub>i </sub>for every number in the array.<br>
<strong>Expected Auxiliary Space:</strong> O(X * 2<sup>N</sup>)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 30<br>
1 &lt;= A[i] &lt;= 20<br>
1 &lt;= B &lt;= 100</span></p>
</div>