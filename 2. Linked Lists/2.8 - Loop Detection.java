public LinkNode loopDetection(LinkNode head){
	LinkNode slow = head;
	LinkNode fast = head;
	while(fast != null && fast.next != null){
		slow = slow.next;
		fast = fast.next.next;
		if(slow == fast){
			break; // collision happened
		}
	}
	//the point where collision occurs is the same distance from the point of collision and head
	if(fast == null || fast.next == null){
		return null; //no loop
	}
	slow = head;
	while(slow != fast){
		slow = slow.next;
		fast = fast.next;
	}
	return fast;
}