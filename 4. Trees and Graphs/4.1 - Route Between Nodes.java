enum State{
    unvisited, visited, visiting;
}

boolean lookForRoute(Graph g, Node start, Node end){
    if(start == end){
        return true;
    }
    LinkedList<Node> queue = new LinkedList<>();
    for(Node n : g.getNodes()){
        n.state = State.unvisited;
    }
    start.state = State.visiting;
    queue.add(start);
    Node temp;
    while(!queue.isEmpty()){
        temp = queue.removeFirst();
        if(temp != null){
            for(Node v : temp.getAdjacent()){
                if(v.state == State.unvisited){
                    if(v == end){
                        return true;
                    }
                    else{
                        v.state = State.visiting;
                        queue.add(v);
                    }
                }
            }
            temp.state = State.visited;
        }
    }
    return false;
}