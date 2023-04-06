# Smallest window in a string containing all the characters of another string
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two strings <strong>S</strong> and <strong>P</strong>. Find the smallest window in the string&nbsp;<strong>S</strong> consisting of all the characters(<strong>including duplicates</strong>) of the string&nbsp;<strong>P</strong>.&nbsp;</span>&nbsp;<span style="font-size:18px">Return "<strong>-1</strong>" in case there is no such window present.&nbsp;In case there are multiple such windows of same length, return the one with the least starting index.<br>
<strong>Note</strong> : All characters are in Lowercase alphabets.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>S = "timetopractice"
P = "toc"
<strong>Output: 
</strong>toprac<strong>
Explanation: "</strong>toprac" is the smallest
substring in which "toc" can be found.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>S = "zoomlazapzo"
P = "oza"
<strong>Output: 
</strong>apzo<strong>
Explanation: </strong><strong>"</strong>apzo" is the smallest 
substring in which "oza" can be found.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>smallestWindow()</strong> which takes two string <strong>S</strong> and <strong>P</strong> as input paramters&nbsp;and returns the smallest window in string <strong>S</strong> having all the characters of the string <strong>P</strong>. In case there are multiple such windows of same length, return the one with the least starting index.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(|S|)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:&nbsp;</strong><br>
1 ≤ |S|, |P| ≤ 10<sup>5</sup></span></p>
</div>