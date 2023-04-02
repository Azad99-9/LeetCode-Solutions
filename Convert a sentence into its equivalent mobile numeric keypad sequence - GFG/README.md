# Convert a sentence into its equivalent mobile numeric keypad sequence
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">Given a sentence in the form of a string in uppercase, convert it into its equivalent mobile numeric keypad sequence. Please note there might be spaces in between the words in a sentence and we can print spaces by pressing 0.</span></p>

<p><img alt="" src="https://contribute.geeksforgeeks.org/wp-content/uploads/Phone.png" style="height:375px; width:275px"></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
S = "GFG"
<strong>Output:</strong> 43334
<strong>Explanation</strong>: For 'G' press '4' one time.
For 'F' press '3' three times.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
S = "HEY U"
<strong>Output:</strong> 4433999088
<strong>Explanation</strong>: For 'H' press '4' two times.
For 'E' press '3' two times. For 'Y' press '9' 
three times. For white space press '0' one time.
For 'U' press '8' two times.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task: &nbsp;</strong><br>
You dont need to read input or print anything. Complete the function&nbsp;<strong>printSequence()</strong>&nbsp;which takes a string as input parameter and returns </span><span style="font-size:20px">its equivalent mobile numeric keypad sequence as a string.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(Length of String)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Length of String)</span><br>
&nbsp;</p>

<p><strong><span style="font-size:18px">Constraints:</span></strong></p>

<p><span style="font-size:18px">1 &lt;= Length of String &lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">Characters of string can be empty space or capital alphabets.</span></p>
</div>