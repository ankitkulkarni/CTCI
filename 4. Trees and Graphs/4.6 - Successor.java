Node giveSuccessor(Node n){
	if(n == null){
		return null;
	}
	if(n.right != null){
		return leftMost(n.right);
	}
	else{
		Node temp = n;
		Node father = temp.parent;
		while(father != null && temp != father.left){
			temp = father;
			father = father.parent;
		}
		return father;
	}
}

Node leftMost(Node n){
	if(n == null){
		return null;
	}
	while(n.left != null){
		n = n.left;
	}
	return n;
}