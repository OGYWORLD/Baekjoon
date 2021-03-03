/* 백준 2231번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		int answer = 1000001; // 정답(생성자)을 담을 변수
		int one = 0; // 각 자리의 합을 담을 변수
	
		String s = ""; // i를 문자열로 만들어서 각 자리 더할 예정

		for(int i = 1; i < 1000001; i++) {
			s = i + ""; // i를 문자열로 바꿔서
			
			for(int j = 0; j < s.length(); j++) {
				one += s.charAt(j) - '0'; // 각자리를 더해준다. (문자에 '0' 빼주면 정수 됨)
			}
			
			if(i + one == n) { // 생성자이고 이전의 생성자보다 작으면
				answer = i;
				break; // 가장 작을때 = 최초
			}
			one = 0;
		}
		
		if(answer != 1000001) { // answer가 1000001이 아니다 = 위의 for문에서 if문이 걸리긴 했었다.
			bw.write(answer + "");
		}
		else { // answer가 0이다 = if문 안 걸림 = 생성자없음
			bw.write("0");
		}
		
		bw.flush();
		bw.close();

	}

}
