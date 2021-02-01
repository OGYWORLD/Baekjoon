/* 백준 11022번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자쌍의 개수를 저장하는 변수 n 입력받기
		int n = Integer.parseInt(bf.readLine());
		
		int stop = 0; // while문을 멈추기 위한 변수 stop
		while(stop != n) {
			String s = bf.readLine() + " "; // 숫자 문자열로 저장 후 정수형 숫자로 바꾸기
			String[] split = s.split(" ");
			
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			
			bw.write("Case #" + (stop + 1) +": " + a + " + " + b + " = " + (a + b) + "\n");
			
			stop++;
		}
		
		bw.flush();
		bw.close();

	}

}
