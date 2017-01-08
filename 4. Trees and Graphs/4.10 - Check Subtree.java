//1st approach
boolean containsTree(Node t1, Node t2){
	StringBuilder sb1 = new StringBuilder();
	StringBuilder sb2 = new StringBuilder();
	getNodeOrderString(sb1, t1);
	getNodeOrderString(sb2, t2);
	return sb1.indexOf(sb2.toString()) != -1;
}
void getNodeOrderString(StringBuilder sb, Node n){
	if(n == null){
		sb.append("X");
		return;
	}
	sb.append(n.val + " ");
	getNodeOrderString(sb, n.left);
	getNodeOrderString(sb, n.right);
}


//2nd approach
boolean containsTree(Node t1, Node t2){
	if(t2 == null){
		return true;
	}
	return checkSubtree(t1, t2);
}
boolean checkSubtree(Node t1, Node t2){
	if(t1 == null){
		return false;
	}
	if(t1.data = t2.data && matchSubtree(t1, t2)){
		return true;
	}
	return checkSubtree(t1.left, t2) || checkSubtree(t1.right, t2);
}
boolean matchSubtree(Node t1, Node t2){
	if(t1 == null && t2 == null){
		return true;
	}
	if((t1 == null || t2 == null) || (t1.val != t2.val)){
		return false;
	}
	return matchSubtree(t1.left, t2.left) && matchSubtree(t1.right, t2.right);
}