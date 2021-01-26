/* 백준 1546번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 과목 개수
		int n = Integer.parseInt(bf.readLine());
		
		String s = bf.readLine() + " ";
		String[] split = s.split(" ");
		
		int max = 0;
		double[] a = new double[n]; // 점수를 받을 배열 만들기
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(split[i]);
			
			if(a[i] > max) { // 최뎃값 찾기
				max = (int) a[i];
			}
		}
		
		double sum = 0; // 평균을 구하기 위한 전체 더한 값
		for(int i = 0; i < n; i++) {
			a[i] = (a[i] / (double) max) * 100.0;

			sum += a[i];
		}
		
		bw.write((sum / (double)n) + "");
		
		bw.flush();
		bw.close();
		
	}

}
