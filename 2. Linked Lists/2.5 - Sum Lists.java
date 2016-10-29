public LinkNode SumLists(LinkNode m, LinkNode n, int carry){
	if(m == null && n == null && carry == 0){
		return null;
	}
	LinkNode result = new LinkNode();
	int sum = carry;
	if(m != null){
		sum += m.data;
	}
	if(n != null){
		sum += n.data;
	}
	result.data = sum % 10;
	if(m != null || n != null){
		LinkNode next = SumLists(m == null ? null : m.next, 
								 n == null ? null : n.next, 
								 sum >= 10 ? 1 : 0);
		result.setNext(next);
	}
	return result;
}