/*백준 14681번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 좌표 입력받기
		int x = Integer.parseInt(bf.readLine());
		int y = Integer.parseInt(bf.readLine());
		
		// 4분면 정해주기
		if(x > 0 && y > 0) { // Quadrant 1
			bw.write("1");
		}
		else if(x < 0 && y > 0) { // Quadrant 2
			bw.write("2");
		}
		else if(x < 0 && y < 0) { // Quadrant 3
			bw.write("3");
		}
		else if(x > 0 && y < 0) { // Quadrant 4
			bw.write("4");
		}
		
		bw.flush();
		bw.close();

	}

}