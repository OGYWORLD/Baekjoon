/* 백준 1011 Fly me to the Alpha Centauri */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1011 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int loopCount = Integer.parseInt(bf.readLine()); // TestCase 개수를 담은 변수 loopCount
		int stop = 0;
		
		while(loopCount != stop) {
		
			String needSplit = bf.readLine() + " "; // x와 y를 문자열로 받는 needSplit. " "을 기준으로 쪼개기 위해 " "을 더해줬다.
			
			String[] needInteger = needSplit.split(" "); // " "을 기준으로 쪼개서 needInteger에 String 배열로 넣어준다.
			
			// needInteger을 Integer로 바꾸기. 시간복잡도를 위해 for문을 사용하지 않는다.(어차피 2개니깐ㅎㅎ)
			long xPoint = Integer.parseInt(needInteger[0]);
			long yPoint = Integer.parseInt(needInteger[1]);
			
			int sq = (int) Math.sqrt(yPoint - xPoint);
			
			if(yPoint - xPoint == sq * sq) {
				System.out.println(sq * 2 -1);
			}
			else if(yPoint - xPoint > sq * sq && yPoint - xPoint <= sq * sq + sq) {
				System.out.println(sq * 2);
			}
			else if(sq * sq + sq < yPoint - xPoint && yPoint - xPoint < (sq + 1) * (sq + 1) ) {
				System.out.println(sq * 2 + 1);
			}
			
				
			
			stop++;
		}
		
		
	}

}
