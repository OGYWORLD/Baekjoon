/*백준 10828번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10828 {
	public static int[] stack = new int[100000]; // 스택으로 쓰일 배열
	public static int sp = 0; // 스택 포인터로 쓰일 변수 sp

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < 100000; i++) {
			stack[i] = -2; // 빈 배열임을 알 수 있게 처음에 모두 -2로 채운다.
		}
		
		int stop = 0;
		
		while(n != stop) {
			// 명령어 받기
			String s = bf.readLine() + " ";
			String[] split = s.split(" ");
			
			if(split.length == 2) { // 배열의 크기가 2라면 push n 밖에 없다.
				stack[sp] = Integer.parseInt(split[1]); // 스택에 push할 숫자를 넣고
				sp++; // sp를 증가시킨다.
			}
			
			else if(split[0].equals("pop")) { // pop인 경우
				if(sp == 0) { // sp가 0이라는 뜻은 비었다는 뜻
					bw.write("-1\n");
					
				}
				else { // 그게 아니라면 sp가 가리키는 값을 출력하는데 sp는 인덱스보다 1 큼을 주의!
					bw.write(stack[sp - 1] + "\n");
					stack[sp - 1] = -2; // pop해주기
					sp--; // 다시 sp 감소
				}
			}
			
			else if(split[0].equals("size")) { // 사이즈 = sp
				bw.write(sp + "\n");
			}
			
			else if(split[0].equals("empty")) {
				if(sp == 0) { // sp가 0이라는 것은 스택이 비었다는 뜻
					bw.write(1 + "\n");
				}
				else {
					bw.write(0 + "\n");
				}
			}
			
			else if(split[0].equals("top")) {
				if(sp == 0) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(stack[sp - 1] + "\n");
				}
			}
			
			stop++;
		}
		
		bw.flush();
		bw.close();

	}

}
