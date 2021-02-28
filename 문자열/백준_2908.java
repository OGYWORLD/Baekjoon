/* 백준 2908번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2908 {
	
	public static int reverse(String s) {
		int n = s.charAt(0) - '0'; // 반대로 집어넣기
		
		n += (s.charAt(1)- '0') * 10;
		
		n += (s.charAt(2)- '0') * 100;
		
		return n;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine() + " "; // 칠판의 두 수를 일단 합쳐서 문장으로 받으면서 끝에 빈 칸을 같이 받아 빈 칸으로 두 수를 구분한다.

		String[] split = s.split(" "); // 빈 칸을 기준으로 배열로 만들기
		
		int first = reverse(split[0]);
		int second = reverse(split[1]);
		
		if(first > second) {
			bw.write(first + "");
		}
		else {
			bw.write(second + "");
		}
		
		bw.flush();
		bw.close();
	}

}
