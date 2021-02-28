/*백준 1152번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1152 {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0; // 단어의 개수를 담을 변수
		boolean isChar = false; // 문자가 최초로 등장하면 true로 바뀜
		
		String s = bf.readLine(); // 검사할 문장
		
		int l = s.length(); // 문장의 길이
		int check = 1; // 빈 칸으로만 이루어져 있으면 check가 1이 된다.
		for(int i = 0; i < l; i++) {
			if(s.charAt(i) != ' ') { // 문장 첫 부분에(단어가 최초로 등장하기 이전의) 빈 칸이 있다면
				s = s.substring(i, l); // 그 앞부분의 빈칸들은 없애버린다.
				check = 0; // 여기 걸렸다는 건 문장이 빈 칸으로만 이루어지지 않았다는 뜻
				break; // 즉시종료
			}
		}
		
		l = s.length(); // 문장의 길이 update
		
		for(int i = 0; i < l; i++) {
			
			if(s.charAt(i) == ' ') { // 빈 칸이 등장했는데 해당 문자 다음 칸은 문자일 경우
				isChar = true;
			}
			
			else if(isChar && s.charAt(i) != ' ') { // 빈 칸이 등장했었고 해당 문자가 빈 칸이 아니라면
				cnt++; // 단어 수 증가
				isChar = false; // isChar 초기화
			}
			
			
		}
		
		if(check != 1) {
			bw.write((cnt + 1) + "");	
		}
		else {
			bw.write("0");	
		}
		
		bw.flush();
		bw.close();

	}

}
