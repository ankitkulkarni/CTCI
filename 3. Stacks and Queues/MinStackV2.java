public class MinStackV2{
	public static Stack<Integer> stack1 = new Stack<>();
	public static Stack<Integer> stack2 = new Stack<>();
	public void push(int value){
		if(value <= min()){
			s2.push(value);
		}
		s1.push(value);
	}
	public int pop(){
		if(s1.isEmpty()){
			return EmptyStackException();
		}
		int val = s1.pop();
		if(val == min()){
			s2.pop();
		}
		return val;
	}
	public int min(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		return s2.peek();
	}
}