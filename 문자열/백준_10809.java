/* 백준 10809번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10809 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 단어 받기
		String s = bf.readLine();
		
		int[] point = new int[123]; // 알파벳을 인덱스로하는 배열, 알파벳의 위치가 들어갈거다.
		int l = s.length(); // 문자열 길이
		boolean[] isVisited = new boolean[123];
		
		for(int i = 97; i < 123; i++) {
			point[i] = -1;
		}
		
		for(int i = 0; i < l; i++) {
			if(!isVisited[s.charAt(i)]) { // 중복됐을 경우 처음 등장하는 위치를 나타내야하므로 이미 방문한 경우를 거른다.
				point[s.charAt(i)] = i;
				isVisited[s.charAt(i)] = true;
			}
		}
		
		for(int i = 97; i < 123; i++) {
			bw.write(point[i] + " ");
		}
		
		bw.flush();
		bw.close();

	}

}
