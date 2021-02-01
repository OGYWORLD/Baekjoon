/* 백준 10818번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 배열의 개수 빋기
		int n = Integer.parseInt(bf.readLine());
		
		int min = 1000001; // 최소값은 디폴트 값이 안 들어가게 제일 큰 수
		int max = -1000001; // 반대로 여기는 제일 작은 수
		int[] a = new int[n]; // 숫자들을 담을 배열
		
		String s = bf.readLine() + " ";
		String[] split = s.split(" ");
			
 		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(split[i]);
			
			if(a[i] > max) { // 최댓값 분별
				max = a[i];
			}
			if(a[i] < min) { // 최소값 분별
				min = a[i];
			}
		}
 		
 		bw.write(min + " " + max);
 		
 		bw.flush();
 		bw.close();

	}

}
