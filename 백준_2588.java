/* 백준 2588번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int first = Integer.parseInt(bf.readLine());
		int secound = Integer.parseInt(bf.readLine());
		int secound_copy = secound;
		
		int[] divide = new int[3];
		
		// 두 번째 세 자리수를 각 자리씩 나눠서 divide 배열에 넣기
		for(int i = 0; i < 3; i++) {
			int ten = (int) (Math.pow(10, (double)(2 - i)));
			divide[i] = (int) (secound_copy / ten);
			secound_copy -= divide[i] * ten;
		}
		
		int three = first * divide[2];
		int four = first * divide[1];
		int five = first * divide[0];
		int six = first * secound;
		
		bw.write(three + "\n" + four + "\n" + five + "\n" + six);
		
		bw.flush();
		bw.close();

	}

}