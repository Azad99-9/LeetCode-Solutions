
class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    Node ptr = head;
	    if (ptr == null) return null;
	    while (ptr != null && ptr.next != null) {
	        if (ptr.data == ptr.next.data) {
	            ptr.next = ptr.next.next;
	        } else {
	            ptr = ptr.next;
	        }
	    }
	    return head;
    }
}
