/* 백준 2577번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 숫자 받기
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());
		
		int multi = a * b * c;
		int multi_2 = a * b * c;
		int[] index = new int[10];
		
		String s = multi + "";
		int l = s.length();
		
		// multi 찢어주기
		for(int i = 0; i < l; i++) {
			int ten = (int)(Math.pow(10, (l - i)) / 10);
			index[i] = multi_2 / ten;
			
			multi_2 -= index[i] * ten;
			
		}

		
		//counting 정렬
		int[] count = new int[10];
		for(int i = 0; i < l; i++) {
			count[index[i]]++;
		}
		
		// 출력
		for(int i = 0; i < 10; i++) {
			bw.write(count[i] + "\n");
		}
		
		bw.flush();
		bw.close();

	}

}
