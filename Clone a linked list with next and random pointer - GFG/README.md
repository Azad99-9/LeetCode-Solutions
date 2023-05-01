# Clone a linked list with next and random pointer
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given a special&nbsp;linked list&nbsp;with&nbsp;<strong>N </strong>nodes where each node has a&nbsp;next pointer pointing to its&nbsp;next node. You are also given&nbsp;<strong>M</strong>&nbsp;random pointers, where you will be given <strong>M </strong>number of pairs denoting two nodes <strong>a</strong> and <strong>b</strong>&nbsp;&nbsp;<strong>i.e.&nbsp;</strong></span><strong><span style="font-size:18px">a-&gt;arb = b </span></strong><span style="font-size:18px">(arb is pointer to random node)<strong>.</strong></span></p>

<p><span style="font-size:18px">Construct a copy of the given list. The copy should consist of exactly <strong>N</strong>&nbsp;new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.</span></p>

<p><span style="font-size:18px">For example, if there are two nodes <strong>X</strong> and <strong>Y</strong> in the original list, where <strong>X.arb</strong> <strong>--&gt;</strong> <strong>Y</strong>, then for the corresponding two nodes <strong>x</strong> and <strong>y</strong> in the copied list, <strong>x.arb --&gt; y.</strong></span></p>

<p><span style="font-size:18px">Return the head of the copied linked list.</span></p>

<p><span style="font-size:18px"><img alt="ArbitLinked List1" class="aligncenter size-full wp-image-1254" src="https://contribute.geeksforgeeks.org/wp-content/uploads/clone.jpg" style="height:160px; width:450px" title="ArbitLinked List1"></span></p>

<p><span style="font-size:18px"><strong>Note</strong> :- The diagram isn't part of any example, it just depicts an example of how the linked list may look like.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, M = 2
value = {1,2,3,4}
pairs = {{1,2},{2,4}}
<strong>Output: </strong>1<strong>
Explanation: </strong>In this test case, there
are 4 nodes in linked list.&nbsp; Among these
4 nodes,&nbsp; 2 nodes have arbitrary pointer
set, rest two nodes have arbitrary pointer
as NULL. Second line tells us the value
of four nodes. The third line gives the
information about arbitrary pointers.
The first node arbitrary pointer is set to
node 2.&nbsp; The second node&nbsp;arbitrary pointer
is set to node 4.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, M = 2
value[] = {1,3,5,9}
pairs[] = {{1,1},{3,4}}
<strong>Output: </strong>1<strong>
Explanation: </strong>In the given testcase ,
applying the method as stated in the
above example, the output will be 1.</span>

</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>copyList</strong>() which takes one argument the head of the linked list to be cloned and should <strong>return</strong> the head of the cloned linked list.</span></p>

<p><span style="font-size:18px"><strong>NOTE :&nbsp;</strong><br>
1. If there is any node whose arbitrary pointer is not given then it's by default NULL.&nbsp;<br>
2. Your solution return an output <strong>1</strong> if your clone linked list is correct, else it returns <strong>0</strong>.<br>
3. Don't make any changes to the original linked list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(n)<br>
<strong>Expected Auxilliary Space </strong>: O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 100<br>
1 &lt;= M&nbsp;&lt;= N<br>
1 &lt;= a, b &lt;= 100</span></p>
</div>