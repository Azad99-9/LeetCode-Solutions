# Remove loop in Linked List
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a linked list of&nbsp;<strong>N</strong>&nbsp;nodes such that it may contain a loop.</span></p>

<p><span style="font-size:18px">A loop here means that the last node of the link list is connected to the node at position X(1-based index). If the link list does not have any loop, X=0.</span></p>

<p><span style="font-size:18px">Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 3
value[] = {1,3,4}
X = 2
<strong>Output: </strong>1<strong>
Explanation: </strong>The link list looks like<strong>
</strong>1 -&gt; 3 -&gt; 4
     ^    |
     |____|    
A loop is present. If you remove it 
successfully, the answer will be 1. 
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
value[] = {1,8,3,4}
X = 0
<strong>Output: </strong>1<strong>
Explanation: </strong>The&nbsp;Linked list does not 
contains any loop. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 3:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
value[] = {1,2,3,4}
X = 1
<strong>Output: </strong>1<strong>
Explanation: </strong>The link list looks like<strong> 
</strong>1 -&gt; 2 -&gt; 3 -&gt; 4
     |_________|
A loop is present. 
If you remove it successfully, 
the answer will be 1. </span></pre>

<p><br>
<span style="font-size:18px"><strong>Your&nbsp;Task:</strong><br>
You don't need to read input or print anything.&nbsp;Your task is to&nbsp;complete the function&nbsp;<strong>removeLoop</strong>() which takes the&nbsp;head of the linked list as the input parameter. Simply remove the loop in the list (if present) without disconnecting any nodes from the list.<br>
<strong>Note:&nbsp;</strong>The generated output&nbsp;will be&nbsp;<strong>1&nbsp;</strong>if your submitted code is correct.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected time complexity:</strong>&nbsp;O(N)<br>
<strong>Expected auxiliary space:&nbsp;</strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10^4</span></p>
</div>