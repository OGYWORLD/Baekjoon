/* 백준 10872번*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
	public static int answer = 1;
	
	public static void Factorial(int depth, int n) {
		if(depth == n+1) { // depth와 n+1이 같아진다면 중지 (n이 10이면 10까지 곱해야하니깐 11에서 멈추는 느낌)
			System.out.println(answer);
		}
		else {
			answer = answer * depth; // 누적 곱하기
			Factorial(depth + 1, n); // 재귀
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); // n 받기

		Factorial(1, n);
	}

}
