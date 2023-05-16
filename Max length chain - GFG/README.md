# Max length chain
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given N&nbsp;pairs of numbers. In every pair, the first number is always smaller than the second number.&nbsp;A pair (c, d) can follow another pair (a, b) if b &lt; c. Chain of pairs can be formed in this fashion. You have to find&nbsp;the longest chain which can be formed from the&nbsp;given set of pairs.&nbsp;</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
P[] = {5 &nbsp;24 , 39 60 , 15 28 , 27 40 , 50 90}
<strong>Output:</strong> 3
<strong>Explanation</strong>: The given pairs are { {5, 24}, {39, 60},
{15, 28}, {27, 40}, {50, 90} },the longest chain that
can be formed is of length 3, and the chain is
{{5, 24}, {27, 40}, {50, 90}}
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 2
P[] = {5 10 , 1 11}
<strong>Output:</strong> 1
<strong>Explanation</strong>:The max length chain possible is&nbsp;only of
length one.
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to Complete the function&nbsp;<strong>maxChainLen()</strong>&nbsp;which takes a structure p[] denoting the pairs and n as the number of pairs and returns&nbsp;the length of the longest chain formed.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity</strong>: O(Nlog(N))<br>
<strong>Expected Auxiliary Space</strong>: O(1)<br>
<br>
<strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>5</sup></span></p>
</div>