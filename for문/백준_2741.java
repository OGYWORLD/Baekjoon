/* 백준 2741번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 변수 n 입력받기
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= n; i++) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
