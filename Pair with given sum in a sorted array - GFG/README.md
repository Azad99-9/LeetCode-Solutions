# Pair with given sum in a sorted array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">You are given an array <strong>Arr</strong> of size <strong>N</strong>. You need to find <strong>all pairs</strong> in the array that sum to a number <strong>K</strong>. If no such pair exists then output will be <strong>-1</strong>. The elements of the array are <strong>distinct </strong>and are in <strong>sorted </strong>order.<br>
<strong>Note:</strong> (a,b) and (b,a) are considered same. Also, an element cannot pair with itself, i.e., (a,a) is invalid.</span></p>

<p><span style="font-size:20px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:20px"><strong>â€‹</strong><strong>Input:
</strong>n = 7
arr[] = {1, 2, 3, 4, 5, 6, 7}
K = 8
<strong>Output:
</strong>3
<strong>Explanation:</strong>
We find 3 such pairs that
sum to 8 (1,7) (2,6) (3,5)
</span></pre>

<p><br>
<span style="font-size:20px"><strong>â€‹Example 2:</strong></span></p>

<pre><span style="font-size:20px"><strong>Input:
</strong>n = 7
arr[] = {1, 2, 3, 4, 5, 6, 7}
K = 98 <strong>
Output:
</strong>-1 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:20px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>Countpair()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, an integer <strong>K</strong> and return the count of the pairs which add up to the sum <strong>K</strong>. The driver code takes care of the printing.</span></p>

<p><br>
<span style="font-size:20px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:20px"><strong>Constraints:</strong><br>
0 &lt;= A<sub>i</sub> &lt;=10<sup>7</sup><br>
2 &lt;= N &lt;= 10<sup>7</sup><br>
0 &lt;= K &lt;= 10<sup>7</sup></span></p>
</div>