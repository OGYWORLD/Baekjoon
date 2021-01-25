/* 백준 1181번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class B1181 {
	
	public static class Words implements Comparable<Words>{
		private String w;
		
		public Words(String w) {
			this.w = w;
		}
		
		public int getLength() {
			return w.length();
		}
		
		public int getFirst(int i) {
			return w.charAt(i);
		}
		
		public String toString(){
	        return w;
	    }

		@Override
		public int compareTo(Words o) {
			Integer tmp = new Integer(this.getLength());
			int result = tmp.compareTo(o.getLength());
			
			for(int j = 0; j < tmp; j++) {
				if(result == 0) {
					Integer tmp_2 = new Integer(this.getFirst(j));
					result = tmp_2 - o.getFirst(j);
				}
				if(result != 0) {
					break;
				}
			}
			return result;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Words> w = new ArrayList<>(); // 단어 담을 배열
		ArrayList<String> w_2 = new ArrayList<>(); // 단어 담을 배열
		ArrayList<String> w_3 = new ArrayList<>(); // 단어 담을 배열
 		
		// 단어 개수
		int n = Integer.parseInt(bf.readLine());

		// 단어들 집어 넣기
		for(int i = 0; i < n; i++) {
			w_2.add(bf.readLine());
			
		}
		
		// 중복제거
		for(int i = 0; i < n; i++) {
			if(!w_3.contains(w_2.get(i))){
				w.add(new Words(w_2.get(i)));
				w_3.add(w_2.get(i));
			}
		}

		// 클래스 정렬
		Collections.sort(w);
		
		// 출력하기
		for(int i = 0; i < w.size(); i++) {
			bw.write(w.get(i) + "\n");	
		}
		
		bw.flush();
		bw.close();

	}

}