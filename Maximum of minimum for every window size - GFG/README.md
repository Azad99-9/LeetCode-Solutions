# Maximum of minimum for every window size
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an integer array. The task is to find the maximum of the minimum of every window size in the array.<br>
<strong>Note:</strong> Window size varies from 1 to the size of the Array.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 7
arr[] = {10,20,30,50,10,70,30}
<strong>Output: </strong>70 30 20 10 10 10 10&nbsp;<strong>
Explanation: 
</strong>1.First element in output
indicates maximum of minimums of all
</span><span style="font-size:18px">windows of size 1.
</span><span style="font-size:18px">2.Minimums of windows of size 1 are {10},
 {20}, {30}, {50},{10}, </span><span style="font-size:18px">{70} and {30}. 
&nbsp;Maximum of these minimums is 70. </span>
<span style="font-size:18px">3. Second element in output indicates
maximum of minimums of all </span><span style="font-size:18px">windows of
size 2. 
</span><span style="font-size:18px">4. Minimums of windows of size 2
are {10}, {20}, {30}, {10}, {10}, </span><span style="font-size:18px">and
{30}.
5. Maximum of these minimums is 30 </span>
<span style="font-size:18px">Third element in output indicates
maximum of minimums of all </span><span style="font-size:18px">windows of
size 3. 
6. </span><span style="font-size:18px">Minimums of windows of size 3
are {10}, {20}, {10}, {10} and {10}.
</span><span style="font-size:18px">7.Maximum of these minimums is 20. </span>
<span style="font-size:18px">Similarly other elements of output are
computed.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 3
arr[] = {10,20,30}
<strong>Output: </strong>30 20 10<strong>
Explanation: </strong>First element in output
indicates maximum of minimums of all
</span><span style="font-size:18px">windows of size 1.Minimums of windows
of size 1 are {10} , {20} , {30}.
Maximum of these minimums are 30 and
similarly other outputs can be computed</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function&nbsp;<strong>maxOfMin</strong>() which takes the array arr[] and its size N as inputs and finds the maximum of minimum of every window size and returns an array containing the result.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complxity</strong> : O(N)<br>
<strong>Expected Auxilliary Space</strong> : O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1 &lt;= arr[i] &lt;= 10<sup>6</sup></span></p>
</div>