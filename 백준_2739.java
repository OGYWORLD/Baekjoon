/*백준 2739번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자 입력받기
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i < 10; i++) {
			bw.write(n + " * " + i + " = " + (n*i) + "\n");
		}
		
		
		bw.flush();
		bw.close();

	}

}