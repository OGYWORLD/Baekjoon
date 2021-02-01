/*백준 15652번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B15652 {
	public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static int[] a; // 출력용 배열
	public static boolean[] isVisited; // 방문용 체크 배열
	
	public static void BackTracking(int N, int M, int depth, int start) throws IOException {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				bw.write(a[i] + " ");
			}
			bw.write("\n");
		}
		
		else {
			for(int i = start; i < N; i++) {
				if(!isVisited[i]) {
					a[depth] = i+1;
					BackTracking(N, M, depth+1, start);
					start++;
				}
			}
		}
	}
	

	public static void main(String[] args) throws IOException {
		// n과 m 입력받기
		String s = bf.readLine() + " ";
		String[] split = s.split(" ");
			
		int N = Integer.parseInt(split[0]);
		int M = Integer.parseInt(split[1]);
				
		// 배열 크기 넣어주기
		a = new int[M];
		isVisited = new boolean[N];
				
		//백트래킹
		BackTracking(N, M, 0, 0);
				
		bw.flush();
		bw.close();
	}

}