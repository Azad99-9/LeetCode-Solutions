/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
        PriorityQueue<Integer> p = new PriorityQueue<>();
        Node ptr = head1;
        Set<Integer> track = new HashSet<>();
        while (ptr != null) {
            if (!track.contains(ptr.data)) {
                p.offer(ptr.data);
                track.add(ptr.data);
            }
            ptr = ptr.next;
        }
        ptr = head2;
        while (ptr != null) {
            if (!track.contains(ptr.data)) {
                p.offer(ptr.data);
                track.add(ptr.data);
            }
            ptr = ptr.next;
        }
        Node dummy = new Node(0);
        ptr = dummy;
        while(!p.isEmpty()){
            int  data= p.poll();
            Node tmp = new Node(data);
            ptr.next = tmp;
            ptr = tmp;
        }
        return dummy.next;
	}
}