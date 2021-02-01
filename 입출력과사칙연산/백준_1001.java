/*백준 1001번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 두 숫자 받기
		String numbers = bf.readLine() + " ";
		
		String[] s = numbers.split(" ");
		
		int answer = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
		bw.write(answer + "");
		
		bw.flush();
		bw.close();
		

	}

}