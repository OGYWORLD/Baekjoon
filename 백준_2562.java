/*백준 2562번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 배열 받기
		int[] a = new int[9];
		int index = 0; // 인덱스 역활을 할 변수
		int max = 0; // 최댓값
		
		for(int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(bf.readLine());
			
			if(a[i] > max) {
				max = a[i];
				index = i + 1;
			}
		}
		
		bw.write(max + "\n" + index);
		
		bw.flush();
		bw.close();

	}

}
