# K-th element of two sorted Arrays
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two sorted arrays <strong>arr1</strong> and <strong>arr2</strong> of size <strong>N</strong>&nbsp;and <strong>M</strong>&nbsp;respectively and an element <strong>K</strong>. The task is to find the element that would be at the k’th position of the final sorted array.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
<strong>Output:</strong>
6
<strong>Explanation:</strong>
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
</span></pre>

<div><span style="font-size:18px"><strong>Example 2:</strong></span></div>

<pre><span style="font-size:18px"><strong>Input:</strong>
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
<strong>Output:</strong>
256
<strong>Explanation:</strong>
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>kthElement()</strong>&nbsp;which takes the arrays <strong>arr1[]</strong>,&nbsp;<strong>arr2[]</strong>, its size <strong>N </strong>and <strong>M </strong>respectively and an integer <strong>K </strong>as inputs and returns the element at the Kth position.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(Log(N) + Log(M))<br>
<strong>Expected Auxiliary Space:</strong> O(Log (N))</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N, M &lt;= 10<sup>6</sup><br>
1 &lt;= arr1<sub>i</sub>, arr2<sub>i</sub> &lt;&nbsp;INT_MAX<br>
1 &lt;= K &lt;= N+M</span></p>
</div>