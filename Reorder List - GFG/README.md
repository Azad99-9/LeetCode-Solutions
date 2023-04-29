# Reorder List
## Hard
<div class="problems_problem_content__Xm_eO"><p>Given a singly linked list<em>: A</em>0→<em>A</em>1→...→<em>A</em><em>n</em>-2→<em>A</em>n-1, reorder it to: <em>A</em>0→<em>A</em><em>n-1</em>→<em>A</em>1→<em>A</em><em>n</em>-2→<em>A</em>2→<em>A</em><em>n</em>-3→...<br>
For example: Given 1-&gt;2-&gt;3-&gt;4-&gt;5 its reorder is 1-&gt;5-&gt;2-&gt;4-&gt;3.</p>

<p><strong>Note: It is recommended do this in-place without altering the node's&nbsp;values.</strong></p>

<p><strong>Example 1:</strong></p>

<pre><strong>Input:
</strong><strong>LinkedList:</strong> 1-&gt;2-&gt;3
<strong>Output: </strong>1 3 2
<strong>Explanation:
</strong>Here n=3, so the correct
order is<em> A</em>0→<em>A</em><em>2</em>→<em>A</em><em>1</em></pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:
</strong>Explanation: 1-&gt;7-&gt;3-&gt;4
<strong>Output: </strong>1 4 7 3
<strong>Explanation:
</strong>Here n=4, so the correct
order is<em> A</em>0→<em>A</em><em>3</em>→<em>A</em><em>1</em>→<em>A</em><em>2</em></pre>

<p><strong>Your Task:</strong><br>
The task is to complete the function <strong>reorderList</strong>() which should reorder the list as required. The reorder list is automatically printed by the driver's code.</p>

<p><strong>Note</strong>: Try to solve without using any auxilliary space.</p>

<p><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</p>

<p><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 5*105<br>
0 &lt;= A[ i ]&nbsp;&lt;= 105</p>
</div>