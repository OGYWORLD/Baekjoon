/* 백준 9663번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9663try5 {
	public static int[] chess; // 체스판으로 쓰일 배열
	public static int cnt = 0; // 가능횟수를 세는 변수
	public static int n;
	
	/* 어떻게 푼 건지에 대한 기초 설명
	 어떤 느낌이냐면 열마다 해당 위치가 퀸이 올 수 있는 자리인지 확인을 할 껀데
	 어떤 느낌이냐면 해당 자리가 퀸이 와도 되는가? -> 조건을 통과하는 지 본다 -> 통과시 재귀호출 아니면 다음 자리 확인
	 자리는 depth를 행 chess[depth]를 열로 본다. 그래서 4x4를 예시로 들면
	 첫 번째 0,0을 배열 chess에 넣는다.(chess[0] = 0) 조건을 통과하는 지 본다. -> 첫 번째 이므로 무조건 통과
	 그다음 1,0을 배열 chess에 넣는다. 조건을 통과하는 지 본다.(이때 이전의 chess에 넣어진 좌표들과 비교한다. 그러므로 안 됨.)
	 ... 이런 식으로 하다보면 depth가 n만큼 도달하여 종료한다.*/
	
	public static boolean check(int col) {
		for(int i = 0; i < col; i++) {
			// 조건문은 같은 열 혹은 행에 있거나 대각선 사이에 있는 지 확인하는 것이다.(기울기가 1인지 확인하는 것과 같다.)
			if (chess[col] == chess[i] || Math.abs(col - i) == Math.abs(chess[col] - chess[i])) {
				return false;
			} 
		}
		return true;
	}
	
	public static void Backtracking(int depth) {
		if(n == depth) {
			cnt++;
			return;
		}
		
		else {
			for(int i = 0; i < n; i++) {
				chess[depth] = i;
				
				if (check(depth)) {
					Backtracking(depth + 1);
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		n = Integer.parseInt(bf.readLine()); // n*n과 퀸의 수를 담은 변수 n
		
		chess = new int[n];
		
		Backtracking(0);
		
		bw.write(cnt + "");
		
		bw.flush();
		bw.close();
		
	}

}