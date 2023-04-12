# Permutations in array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two arrays of equal size <strong>N</strong> and an integer <strong>K</strong>. The task is to check if after permuting both arrays, we get sum of their corresponding element greater than or equal to k i.e <strong>A<sub>i</sub> + B<sub>i</sub> &gt;= K </strong>for all i (from <strong>0</strong> to <strong>N-1</strong>). Return <strong>true</strong> if possible, else <strong>false</strong>.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input : 
</strong>a[] = {2, 1, 3}, 
b[] = { 7, 8, 9 }, 
k = 10. 
<strong>Output : 
</strong>True
<strong>Explanation:</strong>
Permutation  a[] = { 1, 2, 3 } 
and b[] = { 9, 8, 7 } 
satisfied the condition a[i] + b[i] &gt;= K.

</span>
</pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input : </strong>
a[] = {1, 2, 2, 1}, b[] = { 3, 3, 3, 4 }, k = 5.
<strong>Output : </strong>
False</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Since any permutation won't give the answer.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>isPossible()</strong>&nbsp;which takes the array <strong>A[]</strong>, <strong>B[]</strong>, its size <strong>N </strong>and an integer <strong>K </strong>as inputs and returns the answer.</span><br>
<br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N. Log(N))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup></span><br>
<span style="font-size:18px">1&nbsp;≤ K ≤ 10<sup>18 </sup><br>
1&nbsp;≤ A<sub>i</sub>, B<sub>i</sub>&nbsp;≤ 10<sup>17</sup></span></p>
</div>