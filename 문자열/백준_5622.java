/* 백준 5622번 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine(); // 암호화된 문자열 받기
		
		int l = s.length(); // 문자열의 길이
		
		int c;
		int time = 0; // 걸리는 시간
		for(int i = 0; i < l; i++) {
			c = s.charAt(i); // 문자열의 한 글자씩 살펴보기
			
			if(c == 'A' || c =='B' || c == 'C') {
				time += 3;
			}
			else if(c == 'D' || c =='E' || c == 'F') {
				time += 4;
			}
			else if(c == 'G' || c =='H' || c == 'I') {
				time += 5;
			}
			else if(c == 'J' || c =='K' || c == 'L') {
				time += 6;
			}
			else if(c == 'M' || c =='N' || c == 'O') {
				time += 7;
			}
			else if(c == 'P' || c =='Q' || c == 'R' || c == 'S') {
				time += 8;
			}
			else if(c == 'T' || c =='U' || c == 'V') {
				time += 9;
			}
			else if(c == 'W' || c =='X' || c == 'Y' || c == 'Z') {
				time += 10;
			}
		}
		
		System.out.println(time);
	}

}
