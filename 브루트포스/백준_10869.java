/* 백준 10869번*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10869 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 두 숫자 받기
		String numbers = bf.readLine() + " ";
		
		String[] s = numbers.split(" ");
		
		int plus = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
		int minus = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
		int multi = Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
		int divide = Integer.parseInt(s[0]) / Integer.parseInt(s[1]);
		int trash = Integer.parseInt(s[0]) % Integer.parseInt(s[1]);
		bw.write(plus + "\n" + minus + "\n" + multi + "\n" + divide + "\n" + trash);
		
		bw.flush();
		bw.close();
		

	}

}
