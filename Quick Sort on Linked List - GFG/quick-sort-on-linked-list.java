//{ Driver Code Starts
import java.util.*;
import java.lang.*;

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

class SortLL
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
  }
}
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
    public static Node quickSort(Node node)
    {
        node = quickSortRec(node, getTail(node));
        
        return node;
    }
    
    public static Node getTail(Node n)
    {
        while(n != null && n.next != null)
               n = n.next;
               
        return n;
    }
    
    static class Res
    {
        Node newHead = null, newEnd = null;
    }
    public static Node quickSortRec(Node head, Node last)
    {
        if(head == null || head == last)
          return head;
          
        Res r = new Res();
        Res s = new Res();
        Node pivot = partition(head, last, r, s);
        
        if(r.newHead != pivot)
        {
            Node tmp = r.newHead;
            while (tmp.next != pivot)
                    tmp = tmp.next;
                    tmp.next = null;
                    
            r.newHead = quickSortRec(r.newHead, tmp);
            tmp = getTail(r.newHead);
            tmp.next =  pivot;
        
        }
        pivot.next = quickSortRec(pivot.next, s.newEnd);
        return r.newHead;
    }
    
    public static Node partition(Node head, Node last, Res r, Res s)
    {
        Node pivot = last;
         Node prev = null, cur = head, tail = pivot;
         
        while(cur != pivot)
        {
            if (cur.data < pivot.data)
        {
           
            if (r.newHead == null)
                r.newHead = cur;
 
            prev = cur;  
            cur = cur.next;
        }
        else 
        {
            
            if (prev != null)
                prev.next = cur.next;
            Node tmp = cur.next;
            cur.next = null;
            tail.next = cur;
            tail = cur;
            cur = tmp;
        }
        }
        
        if (r.newHead == null)
           r.newHead = pivot;
           
        s.newEnd = tail;
        
        return pivot;
    }
}