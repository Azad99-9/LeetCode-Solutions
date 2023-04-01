# Remove Consecutive Characters
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string <strong>S</strong>. For each index i(1&lt;=i&lt;=N-1), erase it if s[i] is equal to s[i-1] in the string.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
S = aabb
<strong>Output:  </strong>ab 
<strong>Explanation:</strong> 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
S = aabaa
<strong>Output:  </strong>aba
<strong>Explanation:</strong> 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Your Task:</span></strong><br>
<span style="font-size:18px">You dont need to read input or print anything. Complete the function <strong>removeConsecutiveCharacter()</strong> which accepts a string as input parameter and <strong>returns</strong> modified string. </span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(|S|).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(|S|).</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=|S|&lt;=10<sup>5</sup><br>
All characters are lowercase alphabets.</span><br>
&nbsp;</p>
</div>