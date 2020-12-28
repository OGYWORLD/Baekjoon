/*백준 2941 크로아티아 알파벳*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String alpa = bf.readLine();
		int alength = alpa.length();
		
		int[] check = new int[alength]; // 확인용
		
		for(int i = 0; i < alength; i++) {
			check[i] = 0;
		}
	
		int answer = 0;
		
		// 확인
		for(int i = 0; i < alength; i++) {
			
			if(alength - i > 1) {
				
				if(alength - i > 2) {
					// dz=
					if(alpa.charAt(i) == 'd' && alpa.charAt(i+1) == 'z' && alpa.charAt(i+2) == '='
							&& check[i] == 0 && check[i+1] == 0 && check[i+2] == 0) {
							answer++;
							check[i]++;
							check[i+1]++;
							check[i+2]++;
						}
				}
				
				// c=
				if(alpa.charAt(i) == 'c' && alpa.charAt(i+1) == '='
					&& check[i] == 0 && check[i+1] == 0) {
					answer++;
					check[i]++;
					check[i+1]++;
				}
				
				// c-
				else if(alpa.charAt(i) == 'c' && alpa.charAt(i+1) == '-'
						&& check[i] == 0 && check[i+1] == 0) {
						answer++;
						check[i]++;
						check[i+1]++;
					}
				
				// d-
				else if(alpa.charAt(i) == 'd' && alpa.charAt(i+1) == '-'
						&& check[i] == 0 && check[i+1] == 0) {
						answer++;
						check[i]++;
						check[i+1]++;
					}
				//lj
				else if(alpa.charAt(i) == 'l' && alpa.charAt(i+1) == 'j'
						&& check[i] == 0 && check[i+1] == 0) {
						answer++;
						check[i]++;
						check[i+1]++;
					}
				
				//nj
				else if(alpa.charAt(i) == 'n' && alpa.charAt(i+1) == 'j'
						&& check[i] == 0 && check[i+1] == 0) {
						answer++;
						check[i]++;
						check[i+1]++;
					}
				
				//s=
				else if(alpa.charAt(i) == 's' && alpa.charAt(i+1) == '='
						&& check[i] == 0 && check[i+1] == 0) {
						answer++;
						check[i]++;
						check[i+1]++;
					}
				
				//z=
				else if(alpa.charAt(i) == 'z' && alpa.charAt(i+1) == '='
						&& check[i] == 0 && check[i+1] == 0) {
						answer++;
						check[i]++;
						check[i+1]++;
					}
			}
			
		}
		
		for(int i = 0; i < alength; i++) {
			if(check[i] == 0) {
				answer++;
				check[i]++;
			}
		}
		
		System.out.println(answer);

	}

}