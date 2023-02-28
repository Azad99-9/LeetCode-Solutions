# Predecessor and Successor
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">There is BST given with root node with key part as an integer only.&nbsp;You need to find the in-order successor and predecessor of a given key.&nbsp;If either predecessor or successor is not found, then set it to NULL.</span></p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
2
6
50 30 L 30 20 L 30 40 R 50 70 R 70 60 L 70 80 R
65
6
50 30 L 30 20 L 30 40 R 50 70 R 70 60 L 70 80 R
100</span>

<span style="font-size:18px"><strong>Output:</strong>
60 70
80 -1

<strong>Explanation:</strong> In each test case first node is the root. Here, 50 is the root. Here, 50 30 L denotes that node having data 50 has its left child having data 30. Similarly, 30 20 L denotes that node having data 30 has its left child having data 20. Same goes for 30 40 R but here R means node 40 is right child of node 30. So, we can easily draw a bst and in first case, we have find predecessor and successor of 65. 
Now, 65 need not to be present in the tree. Here, we can see 60 is its predecessor and 70 would be its successor. Please note that even if 65 were there in the tree, its predecessor and successor would have been the same because we don't count node itself as predecessor or successor.
</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Output:</strong><br>
Find the&nbsp;predecessor and successor of the&nbsp;key in BST and&nbsp;sets pre and suc as predecessor and successor, respectively Otherwise, set to NULL.</span></p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;</strong>You don't need to print anything. You only need to set p.pre to the predecessor and s.succ to the&nbsp;successor. p and s have been passed in the function parameter.</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=T&lt;=100<br>
1&lt;=n&lt;=100<br>
1&lt;=data of node&lt;=100<br>
1&lt;=key&lt;=100</span><br>
&nbsp;</p>
</div>