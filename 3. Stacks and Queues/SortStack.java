void SortStack(Stack<Integer> stk1){
    Stack<Integer> stk2 = new Stack<>();
    while(!stk1.isEmpty()){
        int temp = stk1.pop();
        while(!stk2.isEmpty() && temp < stk2.peek()){
            stk1.push(stk2.pop());
        }
        stk2.push(temp);
    }
    while(!stk2.isEmpty()){
        stk1.push(stk2.pop());
    }
}