# Product array puzzle
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>nums[]</strong> of size <strong>n</strong>, construct a Product Array <strong>P</strong> (of same size n) such that<strong> P[i]</strong> is equal to the product of all the elements of <strong>nums</strong> except nums[i].</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 5
nums[] = {10, 3, 5, 6, 2}
<strong>Output:
</strong>180 600 360 300 900<strong>
Explanation: </strong>
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>n = 2
nums[] = {12,0}
<strong>Output:
</strong>0 12</span>

</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not have to read input. Your task is to complete the function&nbsp;<strong>productExceptSelf() </strong>that takes array nums[] and n&nbsp;as input parameters and returns a list of n&nbsp;integers denoting the product array P.&nbsp;If the array has only one element the returned list should&nbsp;should contains one value i.e {1}</span><br>
<span style="font-size:18px"><strong>Note:&nbsp;</strong>Try to solve this problem without using the division operation.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(n)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 1000<br>
0 &lt;= nums<sub>i</sub> &lt;= 200</span><br>
<span style="font-size:18px">Array&nbsp;may contain duplicates.</span></p>
</div>