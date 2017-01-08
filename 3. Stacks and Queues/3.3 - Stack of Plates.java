class setOfStacks{
	ArrayList<Stack> arr = new ArrayList<>();
	public void push(int value){
		Stack lastStack = getLastStack();
		if(lastStack != null && !lastStack.isFull()){
			lastStack.push(value);
		}
		else{
			Stack stk = new Stack(capacity);
			stk.push(value);
			arr.add(stk);
		}
	}
	public int pop(){
		Stack lastStack = getLastStack();
		if(lastStack == null){
			throw new EmptyStackException();
		}
		int val = lastStack.pop();
		if(lastStack.size == 0){
			arr.remove(arr.size() - 1);
		}
		return val;
	}
	public Stack getLastStack(){
		if(arr.size() == 0){
			return null;
		}
		return arr.get(arr.size() - 1);
	}
	public boolean isFull(){
		//can check if the stack size is known
		return true;
	}
}