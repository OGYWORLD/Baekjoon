/* 백준 10773번*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<>();
		 
		int n = Integer.parseInt(bf.readLine()); // 입력받을 개수 n
		
		int stop = 0;
		
		while(n != stop) {
			
			int check = Integer.parseInt(bf.readLine());
			
			if(check != 0) { // 0이 아니라면 push
				stack.push(check);
			}
			else { // 0이라면 pop
				stack.pop();
			}
			
			stop++;
		}
		
		// 스택 안에 있는 값들을 모두 더해주기
		int sum = 0;
		while(!stack.empty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);

	}

}
