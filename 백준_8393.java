/* 백준 8393번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자 n 입력받기
		int n = Integer.parseInt(bf.readLine());
		int sum = 0; // 합계를 알려줄 변수 sum
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		bw.write(sum +"");
		
		bw.flush();
		bw.close();

	}

}
