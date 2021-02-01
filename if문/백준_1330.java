/* 백준 1330번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1330 {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자 문자열로 입력받기
		String s = bf.readLine() + " ";
		
		String[] split = s.split(" ");
		
		// 문자열 정수형 정수로 변환
		int A = Integer.parseInt(split[0]);
		int B = Integer.parseInt(split[1]);
		
		// 비교하기
		if(A > B) {
			bw.write(">");
		}
		else if(A < B) {
			bw.write("<");
		}
		else {
			bw.write("==");
		}
		
		bw.flush();
		bw.close();

	}

}