# Wildcard string matching
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two strings <strong>wild</strong> and <strong>pattern</strong> where wild string may contain wild card characters and pattern string is a normal string. Determine if the two strings match.&nbsp;The following are the allowed wild card characters in first string :-</span></p>

<pre><span style="font-size:18px">* --&gt; This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.
? --&gt; This character in string wild can be replaced by any one character.</span></pre>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>wild = ge*ks
       pattern = geeks
<strong>Output: </strong>Yes
<strong>Explanation:</strong> Replace the '*' in wild string 
with 'e' to obtain pattern "geeks".</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>wild =<strong> </strong>ge?ks*
       pattern = geeksforgeeks
<strong>Output:</strong> Yes
<strong>Explanation:</strong> Replace '?' and '*' in wild string with
'e' and 'forgeeks' respectively to obtain pattern 
"geeksforgeeks"
</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read&nbsp;input or print anything. Your task is to&nbsp;complete the function <strong>match() </strong>which takes<strong>&nbsp;</strong>the string wild and pattern as input parameters and returns true if the string wild can be made equal to the string pattern, otherwise, returns&nbsp;false.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(length of wild string *&nbsp;length of pattern string)<br>
<strong>Expected Auxiliary Space:</strong> O(length of wild string *&nbsp;length of pattern string)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=length of the two string&lt;=10^3</span><span style="font-size:18px">&nbsp;</span></p>
</div>