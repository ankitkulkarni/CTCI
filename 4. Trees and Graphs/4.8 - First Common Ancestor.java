//With links to Parents
Node firstCommonAncestor(Node p, Node q){
	int difference = getDepth(p) - getDepth(q);
	Node first = difference > 0 ? q : p;
	Node second = difference > 0 ? p : q;
	second = getUp(second, difference);
	while(first != second && second != null && first != null){
		first = first.parent;
		second = second.parent;
	}
	return first == null || second == null ? null : first;
}
int getDepth(Node n){
	int depth = 0;
	while(n != null){
		n = n.parent;
		depth++;
	}
	return depth;
}
Node getUp(Node n, int difference){
	while(n != null && difference > 0){
		n = n.parent;
		difference--;
	}
	return n;
}


//With links to Parents (Better worse-case time)
Node firstCommonAncestor(Node root, Node p, Node q){
	if(!covers(root, p) || !covers(root, q)){
		return null;
	}
	else if(covers(p, q)){
		return p;
	}
	else if(covers(q, p)){
		return q;
	}
	Node sibling = getSibling(p);
	Node father = p.parent;
	while(!covers(sibling, q)){
		sibling = getSibling(father);
		father = father.parent;
	}
	return parent;
}
boolean covers(Node root, Node n){
	if(root == null){
		return false;
	}
	if(root == n){
		return true;
	}
	return covers(root.left, n) || covers(root.right, n);
}
Node getSibling(Node n){
	if(n == null || n.parent == null){
		return null;
	}
	Node father = n.parent;
	return father.left == n ? father.right : father.left;
}


//Without links to Parents
Node firstCommonAncestor(Node root, Node p, Node q){
	if(!covers(root, p) || !covers(root, q)){
		return null;
	}
	return ancestorHelper(root, p, q);
}
Node ancestorHelper(Node root, Node p, Node q){
	if(root == null || root == p || root == q){
		return root;
	}
	boolean pIsOnLeft = covers(root.left, p);
	boolean qIsOnLeft = covers(root.left, q);
	if(pIsOnLeft != qIsOnLeft){
		return root;
	}
	Node childSide = pIsOnLeft ? root.left : root.right;
	return ancestorHelper(childSide, p, q);
}
boolean covers(Node root, Node n){
	if(root == null){
		return false;
	}
	if(root == n){
		return true;
	}
	return covers(root.left, n) || covers(root.right, n);
}