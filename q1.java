package stackop;
//Bottom of the stack
import java.util.*;
public class q1 {

	public static void pushBottom(Stack<Integer> s,int data)
	{
		if(s.empty())
		{
			s.push(data);
			return;
		}
		int top=s.pop();
		pushBottom(s,data);
		s.push(top);
	}
	
	public static void main(String[] args) {
		
		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		pushBottom(s,4);
		while(!s.empty())
		{
			System.out.println(s.pop());
			
		}
		
	}

}
