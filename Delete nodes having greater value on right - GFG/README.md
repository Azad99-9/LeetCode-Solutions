# Delete nodes having greater value on right
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a singly linked list, remove all the nodes which have a greater value on their right side.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList = 12-&gt;15-&gt;10-&gt;11-&gt;5-&gt;6-&gt;2-&gt;3
<strong>Output: </strong>15 11 6 3<strong>
Explanation: </strong>Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>LinkedList = 10-&gt;20-&gt;30-&gt;40-&gt;50-&gt;60
<strong>Output: </strong>60
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>compute</strong>() which should modify the list as required and return the head of the modified linked list.&nbsp;The <strong>printing </strong>is done by the <strong>driver </strong>code,</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ size of linked list&nbsp;≤ 1000<br>
1 ≤ element of linked list ≤ 1000<br>
<strong>Note</strong>: Try to solve the problem without using any extra space.</span></p>
</div>