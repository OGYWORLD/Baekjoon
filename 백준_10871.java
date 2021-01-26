/* 백준 10871번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N과 X입력받기
		String s = bf.readLine() + " ";
		
		String[] split = s.split(" ");
		
		int N = Integer.parseInt(split[0]);
		int X = Integer.parseInt(split[1]);
		
		// 수열을 담을 배열
		s = bf.readLine() + " ";
		split = s.split(" ");
		
		// 배열 집어넣기
		String answer = "";
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			if(Integer.parseInt(split[i]) < X) {
				answer += Integer.parseInt(split[i]) + " ";
			}
		}
		// 끝에 빈칸 하나 빼주기
		answer = answer.substring(0, answer.length()-1);
		
		bw.write(answer);
		
		bw.flush();
		bw.close();

	}

}
