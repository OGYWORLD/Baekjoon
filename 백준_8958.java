/* 백준 8958번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B8959 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// OX덩어리 개수
		int n = Integer.parseInt(bf.readLine());
		
		int stop = 0;
		while(stop != n) {
			
			String s = bf.readLine();
			
			int O = 1; // 연속된 O의 개수
			int answer = 0; // 최종적인 O의 개수
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'O') {
					answer += O;
					O++;
				}
				
				if(s.charAt(i) != 'O') {
					O = 1;
				}
				
			}
			
			bw.write(answer +"\n");
			stop++;
		}
		
		bw.flush();
		bw.close();

	}

}