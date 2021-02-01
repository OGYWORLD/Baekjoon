/*백준 9498번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9498 {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자 입력받기
		int score = Integer.parseInt(bf.readLine());
		
		// 비교하기
		if(score >= 90) {
			bw.write("A");
		}
		else if(score < 90 && score >= 80) {
			bw.write("B");
		}
		else if(score < 80 && score >= 70) {
			bw.write("C");
		}
		else if(score < 70 && score >= 60) {
			bw.write("D");
		}
		else {
			bw.write("F");
		}
		
		bw.flush();
		bw.close();

	}

}