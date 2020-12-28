/*백준 1316번 그룹 단어 체커*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checker {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int loopCount = Integer.parseInt(bf.readLine()); // loop횟수 받기
		String[] words = new String[loopCount]; // 단어들 담을 String 배열
		
		// 단어 words배열에서 받기
		for(int i = 0; i < loopCount; i++) {
			words[i] = bf.readLine();
		}
		
		int answer = 0; // 출력용 변수 answer
		int stop = 0; // while문에서 쓰일 변수 stop
		
		// 그룹단어인지 검사하는 while문
		while(stop != loopCount) {
			
			int nlength = words[stop].length(); // 현재 조사하는 문자열의 길이
			String nString = words[stop]; // 현재 조사하는 단어
			
			char nTest; // 현재 조사하는 단어의 문자
			
			int different = 0; // 최초의 다른 문자가 나오고 난 뒤 같은 문자가 나오는 지 확인하는 변수 different
			int dCount = 0; // 최초의 다른 문자가 나온 뒤 같은 문자가 나온 횟수를 나타내는 변수 dCount
			// 그룹단어 인지 단어별 검사
			for(int i = 0; i < nlength; i++) {
				nTest = nString.charAt(i);
				for(int j = i+1; j < nlength; j++) {
					if(nTest != nString.charAt(j) && different == 0) {
						different = 1;
					}
					
					else if(nTest == nString.charAt(j) && different == 1) {
						dCount++;
					}
				}
				
				different = 0;
			}
			
			// 지금 검사한 문장이 그룹단어인지 dCount의 갯수로 확인한다.(dCount가 1이상이면 그룹단어가 아니다.)
			if(dCount == 0) {
				answer++;
			}
			stop++;
		}
		
		System.out.println(answer);
		

	}

}
