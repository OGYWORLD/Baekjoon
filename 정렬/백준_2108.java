/*백준 2108번*/

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> aa = new ArrayList<Integer>(); // 숫자들 받을 배열
		
		// 숫자 개수 받기
		int n = Integer.parseInt(bf.readLine());
		
		int[] count = new int[8001]; // 빈도 값을 담을 배열 count
		
		// 숫자들 받기
		double total = 0; // 산술평균 구할 때 쓸 변수 total
		for(int i = 0; i < n; i++) {
			aa.add(Integer.parseInt(bf.readLine()));
			total += (double)aa.get(i);
		}
		
		Collections.sort(aa);
		
		// 받은 숫자가 1개 였을 경우
		if(n == 1) {
			bw.write(aa.get(0) + "\n");
			bw.write(aa.get(0) + "\n");
			bw.write(aa.get(0) + "\n");
			bw.write(0 + "");
			
			bw.flush();
			bw.close();
		}
		else {
			// 산술평균
			int average = (int)Math.round((total / n));
			bw.write(Math.round((total / n)) + "\n");	

			// 중앙값
			bw.write((aa.get(n/2)) + "\n"); 

			// 범위(끝에서 출력함)
			int range = aa.get(n-1) - aa.get(0);
			
			// 최빈값
			for(int i = 0; i < n; i++) {
				count[(aa.get(i) + 4000)]++;
			}
			
			int max = 0;
			int mode = 0;
			for(int i = 0; i <8001; i++) {
				if(count[i] != 0) {
					if(max < count[i]) {
						int temp = count[i];
						count[i] = max;
						max = temp;
						mode = i;
					}
				}
				
			}

			// check = 0: 최빈값이 1개다. check = 1: 최빈값이 2개다.
			int mode_2 = 0;
			int isMinus = 0;
			int check = 0;
			for(int i = 0; i < 8001; i++) {
				if(count[i] != 0 && count[i] == max && i > mode && check == 0) {
					mode_2 = i; // 제일작은 맥스보다 다음으로 큰 맥스를 지닌 숫자	
					if((i - 4000) < 0) {
						isMinus++;
					}
					check++;
				}
				else if(count[i] != 0 && count[i] == max && i > mode && check > 0) {
					check++;
					isMinus++;
				}
			}
			
			// 최빈값이 1개
			if(check == 0) {
				bw.write((mode - 4000) + "\n");
			}
			else if(check == 1) {
				if(isMinus == 1) {
					bw.write((mode_2 - 4000) + "\n");
				}
				else {
					bw.write((mode - 4000) + "\n");	
				}
			}
			else if(check > 1) {
				bw.write((mode_2 - 4000) + "\n");
			}
			else {
				bw.write((mode_2 - 4000) + "\n");
			}
			
			bw.write(range + "\n");
			
			bw.flush();
			bw.close();

		}
		

	}

}
