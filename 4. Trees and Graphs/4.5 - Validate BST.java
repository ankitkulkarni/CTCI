//In-Order
Integer last_considered = null;
boolean validateBST(Node n){
	if(n == null){
		return true;
	}
	if(!validateBST(n.left)){
		return false;
	}
	if(last_considered != null && n.val <= last_considered){
		return false;
	}
	last_considered = n.val;
	if(!validateBST(n.right)){
		return false;
	}
	return true;
}




//Min-Max
boolean validateBST(Node n){
	return checkBST(Node n, long.MIN_VALUE, long.MAX_VALUE);
}

boolean checkBST(Node n, long min, long max){
	if(n == null){
		return true;
	}
	if(n.val <= min || n.val >= max){
		return false;
	}
	if(!checkBST(n.left, min, n.val) || !checkBST(n.right, n.val, max)){
		return false;
	}
	return true;
}