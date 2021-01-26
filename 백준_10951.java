/* 백준 10951번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10951 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 버퍼로 EOF
		String input = "";
		while((input = bf.readLine()) != null) {
			String s = input + " "; // 숫자 문자열로 저장 후 정수형 숫자로 바꾸기
			String[] split = s.split(" ");
			
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			
			bw.write((a + b) + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}