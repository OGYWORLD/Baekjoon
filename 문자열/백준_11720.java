/*백준 11720번*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); // 숫자의 개수 n받기
		
		String s = bf.readLine(); // 숫자들을 배열로 받을 문자열
		
		int sum = 0; // 받은 숫자들의 총합을 담을 변수
		for(int i = 0; i < n; i++) {
			sum += s.charAt(i) - '0'; // char를 int로 바꿔줘서 sum에 누적으로 더해준다.
		}
		
		System.out.println(sum);
	}

}