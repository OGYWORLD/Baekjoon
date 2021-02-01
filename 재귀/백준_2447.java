import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B2447 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine()); // 3의 거듭제곱을 저장하는 변수 n
		char[][] piece = new char[n][n]; // 출력될 모양의 한 조각씩 (한조..각..?) 들어있는 배열 piece
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				piece[i][j] = '*';
				
			}
			
		}
		
		// 구멍 뚫기
		int fin = 3; // 경계선을 구분 짓는 변수 fin
		int fakeN = 3; // n을 대체할 변수 fakeN
		
		while(true) {
		
			for(int i = 0; i < n; i += fin) {
				for(int j = 0; j < n; j += fin) {
					
					for(int k = 0; k < fin; k++) {
						for(int r = 0; r < fin; r++) {

							if(((r % fakeN >= (fakeN/3) && r % fakeN <= (fakeN/3)*2-1) && (fakeN/3 <= k && k <= fakeN/3 + fakeN/3 - 1))) { // 가운데 부분 뚫는 용도
								piece[i+k][j+r] = ' ';
							}

						}
					}
					
					
					
				}
			}
			
			if(fakeN >= n) {
				break;
			}
			
			fakeN *= 3;
			fin *= 3;
			
			
		}
		
		// 출력
	 	for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				bw.write(piece[i][j]);
			}
			bw.write("\n");
		}
	 	
	 	bw.flush();
		bw.close();

	}

}