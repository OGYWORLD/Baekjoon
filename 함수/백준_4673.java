/* 백준 4673번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B4673 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] non_self = new int[20001]; // 셀프넘버가 아닌 숫자들의 배열
		for(int i = 10; i <= 10000; i++) {
			
			String s = i + ""; // 조사할 숫자의 길이를 알기 위한
			int copy = i;
			int l = s.length(); // 숫자를 문자열로 바꿨을 떄 길이
			
			int[] a = new int[l]; // 찢어둔 숫자 넣어둘 배열
			
			// 찢어주기
			int sum = 0;
			for(int j = 0; j < l; j++) {
				int ten = ((int) Math.pow(10.0,(double)(l - j)) / 10);
				
				a[j] = copy / ten;
				
				copy -= a[j] * ten;
				sum += a[j]; // 각 자리의 합을 알아야 하므로
			}
			
			non_self[i] = sum + i; // 셀프 넘버가 아닌 것들

		}
		
		int k = 0; // 20미만의 셀프 넘버가 아닌 것들을 넣어 준다.(20 미만의 홀수)
		for(int i = 2; i < 20; i+=2) {
			non_self[k] = i;
			k++;
		}
		
		int count = 0; // 셀프 넘버가 맞다면 count가 0이다
		for(int i = 1; i <= 10000; i++) {
			for(int j = 0; j <= 10000; j++) {
				if(i == non_self[j]) {
					count++;
				}
			}
			
			if(count == 0) {
				bw.write(i + "\n");
			}
			count = 0;
		}
		
		
		bw.flush();
		bw.close();

	}

}