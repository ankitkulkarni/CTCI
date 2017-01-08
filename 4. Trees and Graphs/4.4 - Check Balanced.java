//Iterative
boolean isBalanced(TreeNode root){
	return checkBalanced(root) != -1;
}

checkBalanced(TreeNode node){
	if(node == null){
		return 0;
	}
	int leftHeight = checkBalanced(node.left);
	if(leftHeight == -1){
		return -1;
	}
	int rightHeight = checkBalanced(node.right);
	if(rightHeight == -1){
		return -1;
	}
	return Math.abs(leftHeight - rightHeight) > 1 ? -1 : Math.max(leftHeight, rightHeight) + 1;
}



//Recursive
boolean isBalanced(TreeNode root){
	if(root == null){
		return true;
	}
	int leftHeight = getHeight(root.left);
	int rightHeight = getHeight(root.right);
	if(Math.abs(leftHeight - rightHeight) > 1){
		return false;
	}
	else{
		return isBalanced(root.left) && isBalanced(root.right);
	}
}

int getHeight(TreeNode node){
	if(node == null){
		return -1;
	}
	return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
}