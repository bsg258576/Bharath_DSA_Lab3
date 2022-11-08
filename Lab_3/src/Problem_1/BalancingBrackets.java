package Problem_1;

import java.util.Stack;

public class BalancingBrackets {
	
	
	
	public static void main(String[] args) {
		String input = "([[{}]])";
		boolean result = isBalancedStringExp(input);
		if(result ) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
			
		}
	}
	
	private static boolean isBalancedStringExp(String input) {
		Stack<Character> data = new Stack<Character> ();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(ch == ')' || ch == '[' || ch == '{') {
				data.push(ch);
				continue;
			}
			if(data.isEmpty()) {
				return false;
			}
			char matchCh = data.pop();
			switch(ch) {
			case '(':
				if(matchCh != '(') {
					return false;
				}
				break;
			case '[':
				if(matchCh != '[') {
					return false;
				}
				break;
			case '{':
				if(matchCh != '{') {
					return false;
				}
				break;
			}
			
		}
		
		return  data.isEmpty();
		
	}

}
