# Circular tour
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Suppose there is a circle. There are <strong>N</strong> petrol pumps on that circle. You will be&nbsp;given two sets of data.<br>
<strong>1.</strong>&nbsp;The amount of petrol that every petrol pump has.<br>
<strong>2.</strong>&nbsp;Distance from that petrol pump to the next petrol pump.<br>
Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.</span><br>
<span style="font-size:18px"><strong>Note :</strong>&nbsp;&nbsp;Assume for 1 litre petrol, the truck can go 1 unit of distance.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
Petrol = 4&nbsp;6&nbsp;7&nbsp;4
Distance = 6 5 3 5
<strong>Output: </strong>1<strong>
Explanation: T</strong>here are&nbsp;4 petrol pumps with
amount of petrol and distance to next
petrol pump value pairs as {4, 6}, {6, 5},
{7, 3} and {4, 5}. The first point from
where truck can make a circular tour is
2nd petrol pump. Output in this case is&nbsp;1
(index of 2nd petrol pump).</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Your task is to complete the&nbsp;function <strong>tour</strong>() which takes the required data as inputs and&nbsp;returns an integer denoting a point from where a truck will be able to complete the circle (The truck will stop at each petrol pump and it has infinite capacity). If there exists multiple such starting points, then the function must return the first one out of those. (return -1 otherwise)</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N)<br>
<strong>Expected Auxiliary Space </strong>: O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ N ≤&nbsp;10000<br>
1 ≤&nbsp;petrol, distance ≤&nbsp;1000</span></p>

<p>&nbsp;</p>
</div>