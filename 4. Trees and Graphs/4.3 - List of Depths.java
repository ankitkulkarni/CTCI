public List<List<TreeNode>> levelOrder(TreeNode root) {
    List<List<TreeNode>> result = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if(root != null){
        queue.offer(root);
    }
    while(!queue.isEmpty()){
        ArrayList<TreeNode> sublist = new ArrayList<>();
        int numberOfNodesInQueue = queue.size();
        for(int i = 0; i < numberOfNodesInQueue; i++){
            if(queue.peek().left != null){
                queue.offer(queue.peek().left);
            }
            if(queue.peek().right != null){
                queue.offer(queue.peek().right);
            }
            sublist.add(queue.poll());
        }
        result.add(sublist);
    }
    return result;
}




ArrayList<LinkedList<Node>> listOfDepths(Node root){
    ArrayList<LinkedList<Node>> result = new ArrayList<>();
    LinkedList<Node> list = new LinkedList<>();
    if(root != null){
        list.offer(root);
    }
    while(list.size() > 0){
        int numberOfNodes = list.size();
        result.add(list);
        for(int i = 0; i < numberOfNodes; i++){
            Node temp = list.poll();
            if(temp.left != null){
                list.offer(temp.left);
            }
            if(temp.right != null){
                list.offer(temp.right);
            }
        }
    }
    return result;
}




public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new LinkedList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    ArrayList<Integer> sublist = new ArrayList<>();
    if(root != null){
        queue.offer(root);
        sublist.add(root.val);
    }
    while(!queue.isEmpty()){
        int numberOfNodesInQueue = queue.size();
        result.add(sublist);
        sublist = new ArrayList<Integer>();
        for(int i = 0; i < numberOfNodesInQueue; i++){
            if(queue.peek().left != null){
                queue.offer(queue.peek().left);
                sublist.add(queue.peek().left.val);
            }
            if(queue.peek().right != null){
                queue.offer(queue.peek().right);
                sublist.add(queue.peek().right.val);
            }
            queue.poll();
        }
    }
    return result;
}