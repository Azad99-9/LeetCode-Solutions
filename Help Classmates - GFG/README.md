# Help Classmates
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Professor X wants his students to help each other in the chemistry lab. He suggests that every student should help out a classmate who scored less marks than him in chemistry and whose roll number appears after him. But the students are lazy and they don't want to search too far. They each pick the first roll number after them that fits the criteria. Find the marks of the classmate that each student picks.<br>
<strong>Note:</strong> one student may be selected by multiple classmates.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 5, arr[] = {3, 8, 5, 2, 25}
<strong>Output:</strong> 2 5 2 -1 -1
<strong>Explanation:</strong> 
1. Roll number 1 has 3 marks. The first person 
who has less marks than him is roll number 4, 
who has 2 marks.
2. Roll number 2 has 8 marks, he helps student 
with 5 marks.
3. Roll number 3 has 5 marks, he helps student 
with 2 marks.
4. Roll number 4 and 5 can not pick anyone as 
no student with higher roll number has lesser 
marks than them. This is denoted by -1.
Output shows the marks of the weaker student that 
each roll number helps in order. ie- 2,5,2,-1,-1</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 4, a[] = {1, 2, 3, 4}
<strong>Output:</strong> -1 -1 -1 -1&nbsp;
<strong>Explanation:</strong> As the marks ars in increasing order. 
None of the students can find a classmate who has 
a higher roll number and less marks than them.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task: </strong>&nbsp;<br>
You don't need to read input or print anything. Complete the function <strong>help_classmate()</strong> which takes the array arr[] and&nbsp;size of array N as input parameters and returns a list of numbers. If a student is unable to find anyone then output is&nbsp;-1.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 5*10<sup>5</sup></span></p>
</div>