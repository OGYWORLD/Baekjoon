/* 벡준 10952번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String s = bf.readLine() + " "; // 숫자 문자열로 저장 후 정수형 숫자로 바꾸기
			String[] split = s.split(" ");
			
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			
			if(a == 0 && b == 0) {
				break;
			}
			
			bw.write((a + b) + "\n");
			
		}
		
		bw.flush();
		bw.close();

	}

}
