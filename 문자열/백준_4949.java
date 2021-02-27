/* 백준 4949번 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class B4949 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
 
		int stop = 0; // while문을 종료시키기 위한 변수
		int stop2 = 0;
		String answer = "";
		
		String s; // 문장을 받을 문자열
		
		while(stop != 1) {
			s = bf.readLine(); // 문장 받기
			
			if(s.equals(".")) { // .이 들어오면 종료한다.
				stop = 1;
			}
			
			else {
				char c; // 문자열에서 꺼내올 문자
				for(int i = 0; i < s.length(); i++) {
					c = s.charAt(i);
					
					if(c == '(' || c == '[') { // 만약 여는 괄호였다면 stack에 집어넣는다.
						stack.push(c);
					}
					
					else if(c == ')') { // 만약 저거였다.
						if(stack.empty() || stack.peek() != '(') {
							// 비었다 = 저거랑 매칭 될 게 없다. or 상단이 ( 이게 아니다 = 저거랑 매칭될 게 없다.
							answer = "no";
							stop2 = 1;
							break;
						}
						
						else {
							stack.pop();
						}
					}
					
					else if(c == ']') {
						if(stack.empty() || stack.peek() != '[') {
							answer = "no";
							stop2 = 1;
							break;
						}
						
						else {
							stack.pop();
						}
					}
				}
				
				if(stop2 == 1) {
					System.out.println(answer);
				}
				else if(stack.empty()) { // stack이 비었다 = 모두 매칭이 됐다. 그리고 포문에서 no가 결정되지 않았다.
					System.out.println("yes");
				}
				else { // 아니면
					System.out.println("no");
				}

				stack.clear();
				stop2 = 0;
				
			}
		}
	
	}
 
}
