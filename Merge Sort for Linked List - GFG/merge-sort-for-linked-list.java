//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node findMid(Node head) {
        Node ptr = head;
        Node lptr = head;
        while (lptr.next != null && lptr.next.next != null) {
            ptr = ptr.next;
            lptr = lptr.next.next;
        }
        return ptr;
    }
    
    static Node merge(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        Node result = null;
        
        if (l1.data < l2.data) {
            result = l1;
            result.next = merge(l1.next, l2);
        } else {
            result = l2;
            result.next = merge(l2.next, l1);
        }
        
        return result;
    }
    
    static Node mergeSort(Node head)
    {
        if (head == null || head.next == null) return head;
        
        Node mid = findMid(head);
        Node midNext = mid.next;
        
        mid.next = null;
        
        Node left = mergeSort(head);
        Node right = mergeSort(midNext);
        
        return merge(left, right);
    }
}


