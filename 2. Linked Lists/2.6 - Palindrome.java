public boolean palindrome(LinkNode head){
	LinkNode reverseHead = reversedList(head);
	return checkPalindrome(head, reverseHead);
}

public static LinkNode reversedList(LinkNode head){
	LinkNode rhead = null;
	while(head != null){
		LinkNode n = new LinkNode(head.data);
		n.next = rhead;
		rhead = n;
		head = head.next;
	}
	return rhead;
}

public static boolean checkPalindrome(LinkNode head, LinkNode rhead){
	while(head != null && rhead != null){
		if(head.data != rhead.data){
			return false;
		}
		head = head.next;
		rhead = rhead.next;
	}
	return true;
}