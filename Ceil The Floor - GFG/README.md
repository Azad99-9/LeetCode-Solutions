# Ceil The Floor
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an unsorted array <strong>Arr[]</strong>&nbsp;of <strong>N</strong> integers and an integer&nbsp;<strong>X</strong>, find floor and ceiling of <strong>X</strong>&nbsp;in <strong>Arr[0..N-1]</strong>.</span></p>

<p><span style="font-size:18px"><strong>Floor</strong>&nbsp;of <strong>X</strong> is the largest element which is smaller than or equal to <strong>X</strong>. Floor of <strong>X</strong>&nbsp;doesn’t exist if <strong>X</strong>&nbsp;is smaller than smallest element of <strong>Arr[]</strong>.</span></p>

<p><span style="font-size:18px"><strong>Ceil</strong>&nbsp;of <strong>X</strong>&nbsp;is the smallest element which is greater than or equal to <strong>X</strong>. Ceil of <strong>X</strong>&nbsp;doesn’t exist if <strong>X</strong> is greater than greatest element of <strong>Arr[]</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 8, X = 7
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
<strong>Output:</strong> 6 8
<strong>Explanation:
</strong>Floor of 7 is 6 and ceil of 7 
is 8.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 8, X = 10
Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
<strong>Output:</strong> 9 -1
<strong>Explanation:
</strong>Floor of 10 is 9 but ceil of 10 is not 
possible.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>getFloorAndCeil()</strong>&nbsp;which takes the array of integers&nbsp;<strong>arr, n</strong>&nbsp;and&nbsp;<strong>x&nbsp;</strong>as parameters and returns a pair&nbsp;of integers denoting the answer. Return <strong>-1</strong> if floor or ceil is not present.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints :</strong><br>
1 ≤ N&nbsp;≤ 10<sup>5</sup><br>
1 ≤ Arr[i], X ≤ 10<sup>6</sup></span></p>

<p>&nbsp;</p>
</div>