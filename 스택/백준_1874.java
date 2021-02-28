/* 백준 1874번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder(); // 이 문제는 이거 안 쓰면 메모리 추가가 뜹니다.
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(bf.readLine());
		int goal; // 수열이 될 숫자를 하나씩 받고 있는데 그 하나를 담을 변수이다.
		int start = 1; // i가 시작될 위치(하나씩 받아서 그 해당 숫자의 pop이 끝나고 들어가던 숫자의 순서는 유지되어야한다.)
		String answer = "";
		
		int stop = 0; // while문을 멈춰줄 변수
		while(stop < n) {
			
			goal = Integer.parseInt(bf.readLine());
			
			for(int i = start; ;) {
				if(!stack.empty() && stack.peek() == goal) { // 스택 상단의 값이 목표값이다.
					sb.append("-\n");
					stack.pop(); // 빼버리기
					start = i;
					break;
				}
				else if(i > goal) { // 위에서 안 걸렸다.(= 상단에는 목표값이 없다.) 근데 현재 돌고 있는 값이(i) 목표값보다 크다.
					// = 목표값은 스택 안에 있지만 상단에는 없다 = 가망이 없다.
					System.out.println("NO");
					stop = 100001; // 어차피 100000까지 밖에 못들어오니깐 저렇게 해놔서 answer가 출력 못되게 한다.
					break;
				}
				else { // 아니다 (= 스택이 비었다 혹은 스택 상단이 목표값이 아니다.)
					stack.push(i); // 집어넣기
					sb.append("+\n");
					i++;
				}
			}
			
			stop++;
		}
		
		if(stop < 100001) {
			bw.write(sb + "");
		}
		
		bw.flush();
		bw.close();

	}

}
