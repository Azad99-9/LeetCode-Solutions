def delNode(head, k):
    # Code here
    if k == 1: return head.next
    cur = head
    prev = None
    i = 1
    while i<=k and cur != None:
        if i == k:
            if prev != None:
                prev.next = cur.next
        prev = cur
        cur = cur.next
        i+=1
    return head

