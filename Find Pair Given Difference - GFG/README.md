# Find Pair Given Difference
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>Arr[]</strong> of size <strong>L</strong> and a number <strong>N,</strong>&nbsp;you need to write a program to find if there exists a pair of elements in the array whose difference is <strong>N</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>L = 6, N = 78
arr[] = {5, 20, 3, 2, 5, 80}<strong>
Output: </strong>1
<strong>Explanation: </strong>(2, 80) have difference of 78.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>L = 5, N = 45
arr[] = {90, 70, 20, 80, 50}
<strong>Output: </strong>-1
<strong>Explanation: </strong>There is no pair with difference of 45.</span></pre>

<p><span style="font-size:18px"><strong>Your&nbsp;Task:</strong><br>
You need not take input or print anything. Your task is to complete the function&nbsp;<strong>findPair()&nbsp;</strong>which takes array arr, size of the array L and N as input parameters&nbsp;and returns True&nbsp;if required pair exists,&nbsp;else return False. </span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(L* Log(L)).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=L&lt;=10<sup>4&nbsp;</sup><br>
1&lt;=Arr[i]&lt;=10<sup>5&nbsp;</sup></span></p>

<p><span style="font-size:18px">0&lt;=N&lt;=10<sup>5</sup></span></p>
</div>