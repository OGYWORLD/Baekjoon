/* 백준 2798번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2798 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine() + " "; // N과 M을 문자열 형식으로 받아서
		
		String split[] = s.split(" "); // 쪼개기
		
		int N = Integer.parseInt(split[0]);
		
		int M = Integer.parseInt(split[1]);
		
		s = bf.readLine() + " "; // 카드들도 같은 형식으로 받아준다.
		split = s.split(" ");
		
		int[] cards = new int[N]; // 카드들이 들어갈 배열
		
		// 일일히 쓰기 힘드니깐 for문을 돌린다.
		for(int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(split[i]);
		}
		
		// 노가다 시작...
		int minus = 100000; // 세 카드의 합과 M과의 차이를 담을 변수
		int cmp = 0;
		int m = 0;
		int[] index = new int[3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					cmp = cards[i] + cards[j] + cards[k]; // 세 카드의 합
					m = M - cmp; // 세 카드와 M의 차
					if(m < minus && m > -1 && i != j && i != k && j != k) {
						// 세 카드의 합과 M의 차가 이전 세 카드의 합과 M의 차보다 작으면서 음수가 아니고(M을 넘지 않고)
						// i, j, k가 모두 다르다.
						minus = m; // 차를 업데이트
						index[0] = i;
						index[1] = j;
						index[2] = k;
					}
				}
			}
		}
		
		bw.write((cards[index[0]] + cards[index[1]] + cards[index[2]]) + "");
		
		bw.flush();
		bw.close();
		
		

	}

}
