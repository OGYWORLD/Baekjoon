import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine()) - 1; // n 번째 시리즈를 알려줄 변수 n
		int answer = 666; // 정답이 될 변수 answer, 666부터 시작하므로 저렇게 초기화
		int check = 0; // 일 단위에서 6이 몇번
		String a = ""; // answer을 string으로 바꿔줄 변수 a
		
		// 정답찾기
		for(int i = 0; i < n;) {
			answer++;
			
			a = Integer.toString(answer); // answer string으로 변환
			for(int j = 0; j < a.length()-2; j++) {
				if(a.charAt(j) == '6') {
					if(a.charAt(j+1) == '6') {
						if(a.charAt(j+2) == '6') {
							check++;
						}
					}
				}
			}
			
			if(check >= 1) {
				i++;
			}
		
			check = 0;
		}
		
		bw.write(answer+"");
		
		bw.flush();
		bw.close();

	}

}
