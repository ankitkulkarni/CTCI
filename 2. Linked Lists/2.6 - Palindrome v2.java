boolean palindrome(LinkNode head){
	LinkNode slow = head;
	LinkNode runner = head;
	Stack<Integer> stack = new Stack<>();
	while(runner != null && runner.next != null){
		stack.push(slow.data);
		slow = slow.next;
		runner = runner.next.next;
	}
	//if list size is odd, runner will not equal null. for even it will.
	//to skip the middle element if size is odd, move slow pointer to next
	if(runner != null){
		slow = slow.next;
	}
	while(slow != null){
		int top = stack.pop().intValue();
		if(top != slow.data){
			return false;
		}
		slow = slow.next;
	}
	return true;
}