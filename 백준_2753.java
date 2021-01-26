/*백준 2753번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2753 {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자 입력받기
		int year = Integer.parseInt(bf.readLine());
		
		// 비교하기
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			bw.write("1");
		}
		else {
			bw.write("0");
		}
		
		bw.flush();
		bw.close();

	}

}
