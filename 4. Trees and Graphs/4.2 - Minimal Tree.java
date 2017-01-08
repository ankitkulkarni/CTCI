public Node getMinimalTree(int[] sortedArray){
    return minimalTree(sortedArray, 0, sortedArray.length - 1);
}

public Node minimalTree(int[] sortedArray, int start, int end){
    if(start > end){
        return null;
    }
    int mid = start + (end - start)/2;
    Node n = new Node(sortedArray[mid]);
    n.right = minimalTree(sortedArray, mid + 1, end);
    n.left = minimalTree(sortedArray, start, mid - 1);
    return n;
}