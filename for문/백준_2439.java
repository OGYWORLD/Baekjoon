/* 백준 2439번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자쌍의 개수를 저장하는 변수 n 입력받기
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if ((n - j) < i) {
					bw.write("*");
				}
				else {
					bw.write(" ");	
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}