/* 백준 2675번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine()); // 테스트 케이스의 개수를 담을 변수
		
		int stop = 0; // while문을 멈춰줄 변수
		
		String[] s; // 아래의 while문에서 문자열을 받을 때 쓸 문자열 변수
		
		while(stop != n) {
			
			s = (bf.readLine() + " ").split(" "); // R과 S를 문자열로 받은 다음 split를 사용하여 문자열 배열로 넣는다.
			
			int r = Integer.parseInt(s[0]); //split 배열의 0번째 인덱스에 r이 들어있다.
			
			int l = s[1].length(); // s의 길이
			
			for(int i = 0; i < l; i++) {
				for(int j = 0; j < r; j++) {
					bw.write(s[1].charAt(i) + ""); // split 배열의 1번째는 s다. 그 s의 0번째 문자부터 r만큼 출력한다.
				}
			}
			
			bw.write("\n");
			
			stop++;
		}
		
		bw.flush();
		bw.close();
		
		

	}

}