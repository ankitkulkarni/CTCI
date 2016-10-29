public LinkNode LinkedListPartition(LinkNode node, int x){
	LinkNode beforeStart = null;
	LinkNode beforeEnd = null;
	LinkNode afterStart = null;
	LinkNode afterEnd = null;
	while(node != null){
		LinkNode next = node.next;
		node.next = null;
		if(node.data < x){
			if(beforeStart == null){
				beforeStart = node;
				beforeEnd = beforeStart;
			}
			else{
				beforeEnd.next = node;
				beforeEnd = node;
			}
		}
		else{
			if(afterStart == null){
				afterStart = node;
				afterEnd = afterStart;
			}
			else{
				afterEnd.next = node;
				afterEnd = node;
			}
		}
		node = next;
	}
	if(beforeStart == null){
		return afterStart;
	}
	beforeEnd.next = afterStart;
	return beforeStart;
}