import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B1018 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String split = bf.readLine() + " "; // n과 m을 문자열로 받기
		String[] s = split.split(" "); // 쪼개기
		
		int n = Integer.parseInt(s[0]); // n, m넣기 
		int m = Integer.parseInt(s[1]); 
		
		char[][] chess = new char[n][m]; // 받은 이상한 체스판
		String orignChess = "";
		for(int i = 0; i < n; i++) {
			orignChess = bf.readLine();
			char[] ss = orignChess.toCharArray();
			for(int j = 0; j < m; j++) {
				chess[i][j] = ss[j];
			}
		}
		
		// 정상적인 체스판 배열 2가지
		char[][] black = new char[8][8];
		char[][] white = new char[8][8];
		
		// 정상적인 체스판 집어넣기
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(i % 2 == 0) {
					black[i][j] = 'B';
					white[i][j] = 'W';
					j++;
					black[i][j] = 'W';
					white[i][j] = 'B';
				}
				else {
					black[i][j] = 'W';
					white[i][j] = 'B';
					j++;
					black[i][j] = 'B';
					white[i][j] = 'W';
				}
				
			}
		}
		
		// 어느 부분 뜯을지 결정하기
		int dif_black = 0; // 정상적인 체스판과 다른 횟수를 기록하는 변수 dif
		int dif_white = 0; // 정상적인 체스판과 다른 횟수를 기록하는 변수 dif
		
		int min_black = 64;
		int min_white = 64;
		
		for(int i = 0; i <= n-8; i++) {
			for(int j = 0; j <= m-8; j++) {
					
				for(int k = 0; k < 8; k++) {
					for(int r = 0; r < 8; r++) {

						if(chess[i+k][j+r] != black[k][r]) {
							dif_black++;
						}
						
						if(chess[i+k][j+r] != white[k][r]) {
							dif_white++;
						}

					}
				}
				
				// 한 조각 조사 완료
				if(min_black > dif_black) {
					min_black = dif_black;
				}
				
				if(min_white > dif_white) {
					min_white = dif_white;
				}
				
				dif_black = 0;
				dif_white = 0;
					
					
					
			}
		}
		
		if(min_black > min_white) {
			bw.write(min_white + "");
		}
		else {
			bw.write(min_black + "");
		}
		
		
		bw.flush();
		bw.close();

	}

}
