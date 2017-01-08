public class MinStack(){
	public static Stack<Integer> stack1 = new Stack<>();
	public void push(int value){
		int newMinimum = java.lang.Math.min(value, min());
		stack1.push(new NodeWithMinimum(value, newMinimum));
	}
	public int min(){
		if(stack1.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return stack1.peek().minimum;
		}
	}
}

class NodeWithMinimum{
	public int value;
	public int minimum;
	public NodeWithMinimum(int val, int min){
		this.value = val;
		this.minimum = min;
	}
}