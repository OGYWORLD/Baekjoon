/* 백준 10870번 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10870 {
	public static int answer = 0;

	public static int Fibonaci(int n) {
		if(n == 0) { // 0일 경우 0
			return 0;
		}
		else if(n == 1) { // 1일 경우 1
			return 1;
		}
		else {
			answer = Fibonaci(n - 1) + Fibonaci(n - 2);
			return answer;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());

		if(n == 0) { // 0과 1은 예외로 직접 써준다.
			bw.write("0");
		}
		else if(n == 1) {
			bw.write("1");
		}
		else {
			Fibonaci(n);
			
			bw.write(answer + "");	
		}
		
		bw.flush();
		bw.close();

	}

}
