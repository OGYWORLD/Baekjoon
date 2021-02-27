/* 백준 9012번*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		
		int n = Integer.parseInt(bf.readLine());
		int stop = 0;
		
		while(stop != n) {
			String s = bf.readLine(); // 문자열 받기
			int l = s.length();
			
			// 문자열 0번째 인덱스부터 char으로 꺼내와 stack에 push하기
			for(int i = 0; i < s.length(); i++) {
				stack.push(s.charAt(i));
			}
			
			// VPS인지 확인
			int cnt = 0; // 스택의 FILO 관점에서 봤을 때 지금까지 )가 나온 갯수보다 (가 나온 갯수 가 많으면 VPS가 될 수 없다.
			int right = 0; // )의 등장횟수를 세주는 변수
			int left = 0; // (의 등장횟수를 세주는 변수
			int wrong = 0;
			
			while(!stack.empty()) {
				
				if(stack.pop() == ')') {
					cnt++;
					right++;
					
				}
				else {
					cnt--;
					left++;
					
					if(cnt < 0) { // 스택의 FILO 관점에서 봤을 때 지금까지 )가 나온 갯수보다 (가 나온 갯수 가 많다.
						wrong = 1; 
					}
				}
				
			}
			
			if(right == left && wrong == 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			stop++;
		}

	}

}
