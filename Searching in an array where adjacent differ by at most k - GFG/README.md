# Searching in an array where adjacent differ by at most k
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">A step array is an array of integers where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of x&nbsp;if multiple elements exist, and return the first occurrence of the key. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {4, 5, 6, 7, 6}, K = 1 
        and X = 6
<strong>Output :</strong> 2
<strong>Explanation:</strong>
In an array arr 6 is present at index 2.
So, return 2.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {20 40 50}, K = 20 
        and X = 70<strong>
Output :</strong>  -1 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>search()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, an integer value <strong>X</strong>, another integer value <strong>K</strong>, and return an integer displaying the index of the element <strong>X&nbsp;</strong>in the array arr. If the element is not present in the array return <strong>-1</strong>. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ K ≤ 10<sup>2</sup><br>
1 ≤ arr[i], X ≤ 10<sup>5</sup></span></p>
</div>