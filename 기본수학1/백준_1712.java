/* 백준 1712번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1712 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine() + " "; // ABC를 문장으로 받기
		
		String[] split = s.split(" "); // " " 기준으로 문장 나눠서 문자열 배열로 넣기
		
		int A = Integer.parseInt(split[0]); // 문자열 숫자로 바꿔주기
		
		int B = Integer.parseInt(split[1]);
		
		int C = Integer.parseInt(split[2]);

		if(B >= C) { // A + B * n < C * n을 유도하면 n = A/C-B가 나온다. 이중 n이 음수가 나오면 손익분기점이 발생하지 않는 건데
			// 식을 정리하면 B >= C일때 임을 알 수 있다.
			bw.write("-1");
		}
		else {
			bw.write(((A/(C-B)) + 1) + "");
		}
		
		bw.flush();
		bw.close();

	}

}
