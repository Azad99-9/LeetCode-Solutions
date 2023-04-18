# Find median in a stream
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an input stream of <strong>N</strong> integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of <strong>X</strong> to the new stream.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
X[] = 5,15,1,3
<strong>Output:
</strong>5</span>
<span style="font-size:18px">10</span>
<span style="font-size:18px">5</span>
<span style="font-size:18px">4<strong>
Explanation:</strong>Flow in stream : 5, 15, 1, 3 </span>
<span style="font-size:18px">5 goes to stream --&gt; median 5 (5) </span>
<span style="font-size:18px">15 goes to stream --&gt; median 10 (5,15) </span>
<span style="font-size:18px">1 goes to stream --&gt; median 5 (5,15,1) </span>
<span style="font-size:18px">3 goes to stream --&gt; median 4 (5,15,1 3) </span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 3
X[] = 5,10,15
<strong>Output:
</strong>5</span>
<span style="font-size:18px">7.5</span>
<span style="font-size:18px">10</span><span style="font-size:18px"><strong>
Explanation:</strong>Flow in stream : 5, 10, 15</span>
<span style="font-size:18px">5 goes to stream --&gt; median 5 (5) </span>
<span style="font-size:18px">10 goes to stream --&gt; median 7.5 (5,10) </span>
<span style="font-size:18px">15 goes to stream --&gt; median 10 (5,10,15) </span>
</pre>

<div><span style="font-size:18px"><strong>Your Task:</strong><br>
You are required to complete the class Solution.&nbsp;<br>
It should have 2 data members to represent 2 heaps.&nbsp;<br>
It should have the following member functions:</span></div>

<ol>
	<li><span style="font-size:18px"><strong>insertHeap()</strong> which takes <strong>x&nbsp;</strong>as&nbsp;input and inserts it into the heap, the function should then call <strong>balanceHeaps() </strong>to balance the new heap.</span></li>
	<li><span style="font-size:18px"><strong>balanceHeaps()&nbsp;</strong>does not take any arguments. It is supposed to balance the two&nbsp;heaps.</span></li>
	<li><span style="font-size:18px"><strong>getMedian() </strong>does not take any arguments. It should&nbsp;return&nbsp;the current median of the stream.</span></li>
</ol>

<div><br>
<span style="font-size:18px"><strong>Expected Time Complexity</strong> : O(nlogn)<br>
<strong>Expected Auxilliary Space</strong> : O(n)</span></div>

<div>&nbsp;</div>

<div><span style="font-size:18px"><strong>Constraints:</strong></span></div>

<div><span style="font-size:18px">1<strong> </strong>&lt;= N &lt;= 10<sup>6</sup></span><br>
<span style="font-size:18px">1 &lt;= x &lt;= 10<sup>6</sup></span></div>

<div>&nbsp;</div>
</div>